package test;

import com.dataabstractsolutions.model.Question;
import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Illiak on 1/13/2017.
 */
public class QuestionTest {
    @Rule
    public DatabaseRule databaseRule = new DatabaseRule();

    @Test
    public void question_createsNewQuestion() {
        Question question = new Question("question?");
        assertEquals("question?", question.getQuestion());
    }
}
