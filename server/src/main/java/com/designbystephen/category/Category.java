package com.designbystephen.category;

import com.designbystephen.core.BaseEntity;
import com.designbystephen.game.Game;
import com.designbystephen.tile.Tile;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

/**
 * Created by birdie on 3/14/2017.
 */
@Entity
public class Category extends BaseEntity {
    private String title;
    @ManyToOne
    private Game game;
    @OneToMany(mappedBy = "category", cascade = ALL)
    private List<Tile> tiles;

    protected Category() {
        super();
        tiles = new ArrayList<>();
    }

    public Category(String title) {
        this();
        this.title = title;
    }

    public List<Tile> getTiles() {
        return tiles;
    }

    public void addTile(Tile tile) {
        tile.setCategory(this);
        tiles.add(tile);
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
