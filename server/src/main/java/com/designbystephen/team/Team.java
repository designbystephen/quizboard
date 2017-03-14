package com.designbystephen.team;

import com.designbystephen.core.BaseEntity;
import com.designbystephen.game.Game;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by sysmiller on 3/14/17.
 */
@Entity
public class Team extends BaseEntity {
    private String name;
    private int score;
    @ManyToOne
    private Game game;

    protected Team(){
        super();
    }

    public Team(String name, int score){
        this();
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
