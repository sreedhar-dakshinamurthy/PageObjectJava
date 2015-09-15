package Actions;

import Pages.ThirdPage;

/**
 * Created by sdakshin on 30-Jul-14.
 */
public class ThirdPageActions {
    ThirdPage thirdPage = null;

    public ThirdPageActions(){
        thirdPage = new ThirdPage();
    }

    public void ThirdPageFirstVerification(){
        thirdPage.ThirdPageFirstVerificationImpl();
    }

    public void ThirdPageSecondVerification(){
        thirdPage.ThirdPageSecondVerificationImpl();
    }

    public void ThirdPageFirstAndSecondVerification() {
        thirdPage.ThirdPageFirstVerificationImpl();
        thirdPage.ThirdPageSecondVerificationImpl();
    }
}