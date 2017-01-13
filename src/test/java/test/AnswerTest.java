package test;

import com.dataabstractsolutions.model.Answer;
import com.dataabstractsolutions.model.Question;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Illiak on 1/13/2017.
 */
public class AnswerTest {
    @Rule
    public DatabaseRule databaseRule = new DatabaseRule();

    @Before
    public void initiate() {
        new Question("ques1?");
    }

    @Test
    public void answer_createsCorrectly() {
        Question question = Question.getQuestions().stream().filter(question1 -> question1.getQuestion().equals("ques1?")).findFirst().orElse(null);
        Answer answer = new Answer(question, "answer1");
        assertEquals("answer1", answer.getAnswer());

    }

}