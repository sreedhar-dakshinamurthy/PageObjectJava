import Actions.FirstPageActions;
import org.junit.Test;

/**
 * Created by sdakshin on 30-Jul-14.
 */
public class SecondPageTestClass {
    @Test
    public void SecondPageFirstTest(){
        new FirstPageActions().NavigateToSecondPage().SecondPageFirstVerification();
    }

    @Test
    public void SecondPageSecondTest(){
        new FirstPageActions().NavigateToSecondPage().SecondPageSecondVerification();
    }
}