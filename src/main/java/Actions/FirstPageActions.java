package Actions;

import Pages.FirstPage;

/**
 * Created by sdakshin on 30-Jul-14.
 */
public class FirstPageActions extends BaseActions{
    FirstPage firstPage = null;

    public FirstPageActions(){
        //Launch Home Page
        firstPage = new FirstPage();
    }

    public void FirstPageFirstVerification(){
        firstPage.FirstPageFirstVerificationImpl();
    }

    public void FirstPageSecondVerification(){
        firstPage.FirstPageSecondVerificationImpl();
    }

    public SecondPageActions NavigateToSecondPage(){
        firstPage.NavigateToSecondPageImpl();
        return new SecondPageActions();
    }

    public void FirstPageFirstAndSecondVerification() {
        firstPage.FirstPageFirstVerificationImpl();
        firstPage.FirstPageSecondVerificationImpl();
    }
}
