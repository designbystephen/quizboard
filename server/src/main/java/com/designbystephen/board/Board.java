package com.designbystephen.board;

import com.designbystephen.category.Category;
import com.designbystephen.core.BaseEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

/**
 * Created by birdie on 3/14/2017.
 */
@Entity
public class Board extends BaseEntity {
    private int phase;
    @OneToMany(mappedBy = "board", cascade = ALL)
    private List<Category> categories;

    protected Board() {
        super();
        categories = new ArrayList<>();
    }

    public Board(int phase){
        this();
        this.phase = phase;
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void addCategory(Category category) {
        category.setBoard(this);
        categories.add(category);
    }
}
