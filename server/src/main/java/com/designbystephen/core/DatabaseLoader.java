package com.designbystephen.core;

import com.designbystephen.category.Category;
import com.designbystephen.category.CategoryRepository;
import com.designbystephen.game.Game;
import com.designbystephen.game.GameRepository;
import com.designbystephen.team.Team;
import com.designbystephen.team.TeamRepository;
import com.designbystephen.tile.Tile;
import com.designbystephen.tile.TileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by birdie on 3/14/2017.
 */
@Component
public class DatabaseLoader implements ApplicationRunner {
    private final GameRepository games;
    private final TeamRepository teams;
    private final CategoryRepository categories;
    private final TileRepository tiles;

    @Autowired
    public DatabaseLoader(GameRepository games, TeamRepository teams, CategoryRepository categories, TileRepository tiles) {
        this.games = games;
        this.teams = teams;
        this.categories = categories;
        this.tiles = tiles;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Game> collectionOfGames = new ArrayList<>();
        List<Team> collectionOfTeams = new ArrayList<>();
        List<Category> collectionOfCategories = new ArrayList<>();
        List<Tile> collectionOfTiles = new ArrayList<>();

        Game newGame = new Game("Christmas 2012", false);
        collectionOfGames.add(newGame);

        Team team1 = new Team("Team A", 0);
        collectionOfTeams.add(team1);
        newGame.addTeam(team1);
        Team team2 = new Team("Team B", 0);
        collectionOfTeams.add(team2);
        newGame.addTeam(team2);

        String[] titles = {
                "Words",
                "Buzz Words",
                "Buzzy Words",
                "Buzzier Words",
                "Buzziest Words"
        };

        IntStream.range(0, 5)
            .forEach(titleIndex -> {
                String title = titles[titleIndex];

                Category newCategory = new Category(title);

                IntStream.range(1, 6)
                        .forEach(pointIndex -> {
                            int value = pointIndex * 100;
                            String question = String.format("For %s points, say %s %s.", value, pointIndex, title);

                            Tile newTile = new Tile(value, question, "Ummmm....", false);

                            collectionOfTiles.add(newTile);
                            newCategory.addTile(newTile);
                        });

                collectionOfCategories.add(newCategory);
                newGame.addCategory(newCategory);
            });

        games.save(collectionOfGames);
        teams.save(collectionOfTeams);
        categories.save(collectionOfCategories);
        tiles.save(collectionOfTiles);
    }
}
