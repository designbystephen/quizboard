package com.designbystephen.category;

import com.designbystephen.board.Board;
import com.designbystephen.core.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by birdie on 3/14/2017.
 */
@Entity
public class Category extends BaseEntity {
    private String title;
    @ManyToOne
    private Board board;

    protected Category() {
        super();
    }

    public Category(String title) {
        this();
        this.title = title;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
