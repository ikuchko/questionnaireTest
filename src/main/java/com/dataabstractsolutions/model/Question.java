package com.dataabstractsolutions.model;

/**
 * Created by Illiak on 1/13/2017.
 */
public class Question {
    private Integer id;
    private String question;

    public Question(String question) {
        this.question = question;
    }

    public Integer getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
