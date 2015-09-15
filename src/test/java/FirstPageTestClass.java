import Actions.FirstPageActions;
import org.junit.Test;

/**
 * Created by sdakshin on 30-Jul-14.
 */
public class FirstPageTestClass {
    @Test
    public void FirstPageFirstTest(){

        new FirstPageActions().FirstPageFirstVerification();

    }

    @Test
    public void FirstPageSecondTest(){

        new FirstPageActions().FirstPageSecondVerification();
    }

    @Test
    public void FirstPageThirdTest(){
        new FirstPageActions().FirstPageFirstAndSecondVerification();
    }
}