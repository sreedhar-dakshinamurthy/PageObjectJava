import Actions.FirstPageActions;
import org.junit.Test;

/**
 * Created by sdakshin on 30-Jul-14.
 */
public class ThirdPageTestClass {
    @Test
    public void ThirdPageFirstTest(){
        new FirstPageActions().NavigateToSecondPage().NavigateToThirdPage().ThirdPageFirstVerification();
    }

    @Test
    public void ThirdPageSecondTest(){
        new FirstPageActions().NavigateToSecondPage().NavigateToThirdPage().ThirdPageSecondVerification();
    }
}
