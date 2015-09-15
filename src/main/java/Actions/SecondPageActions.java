package Actions;

import Pages.SecondPage;

/**
 * Created by sdakshin on 30-Jul-14.
 */
public class SecondPageActions extends BaseActions{
    SecondPage secondPage = null;

    public SecondPageActions(){
        secondPage = new SecondPage();
    }

    public void SecondPageFirstVerification(){
        secondPage.SecondPageFirstVerificationImpl();
    }

    public void SecondPageSecondVerification(){
        secondPage.SecondPageSecondVerificationImpl();
    }

    public ThirdPageActions NavigateToThirdPage(){
        secondPage.NavigateToThirdPageImpl();
        return new ThirdPageActions();
    }

    public void SecondPageFirstAndSecondVerification() {
        secondPage.SecondPageFirstVerificationImpl();
        secondPage.SecondPageSecondVerificationImpl();
    }
}
