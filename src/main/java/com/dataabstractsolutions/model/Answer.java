package com.dataabstractsolutions.model;

import application.DB;
import org.apache.log4j.Logger;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Illiak on 1/13/2017.
 */
public class Answer {
    private final String QUERY_INSERT = "INSERT INTO answer (answer_name, question_id) VALUES (?,?)";

    private static final Logger LOG = Logger.getLogger(Answer.class);

    private Integer id;
    private String answer;
    private Question question;

    public Answer(Question question, String answer) {
        this.question = question;
        this.answer = answer;
        this.id = insertToDB();
    }

    public Integer getId() {
        return id;
    }

    public String getAnswer() {
        return answer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    private Integer insertToDB() {
        Integer resut = 0;
        List<Object> params = new ArrayList<Object>();
        params.add(getAnswer());
        params.add(getQuestion().getId());
        try {
            resut = DB.executeUpdate(QUERY_INSERT, params);
        } catch (SQLException e) {
            e.printStackTrace();
            LOG.error(e);
        }
        return resut;
    }
}
