package com.designbystephen.tile;

import com.designbystephen.category.Category;
import com.designbystephen.core.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by sysmiller on 3/14/17.
 */
@Entity
public class Tile extends BaseEntity {
    private int value;
    private String question;
    private String answer;
    private Boolean answered;
    @ManyToOne
    private Category category;

    protected Tile(){
        super();
    }

    public Tile(int value, String question, String answer, Boolean answered){
        this();

        this.value = value;
        this.question = question;
        this.answer = answer;
        this.answered = answered;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Boolean getAnswered() {
        return answered;
    }

    public void setAnswered(Boolean answered) {
        this.answered = answered;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
