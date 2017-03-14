package com.designbystephen.game;

import com.designbystephen.category.Category;
import com.designbystephen.core.BaseEntity;
import com.designbystephen.team.Team;


import javax.persistence.Entity;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.ALL;


/**
 * Created by sysmiller on 3/14/17.
 */
@Entity
public class Game extends BaseEntity {
    private String title;
    private Boolean closed;
    @OneToMany(mappedBy = "game", cascade = ALL)
    private List<Category> categories;
    @OneToMany(mappedBy = "game", cascade = ALL)
    private List<Team> teams;

    protected Game(){
        super();
        teams = new ArrayList<>();
        categories = new ArrayList<>();
    }

    public Game(String title, Boolean closed){
        this();
        this.title = title;
        this.closed = closed;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public List<Category> getCategory() {
        return categories;
    }

    public void addCategory(Category category) {
        category.setGame(this);
        categories.add(category);
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void addTeam(Team team) {
        team.setGame(this);
        teams.add(team);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
