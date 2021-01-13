package io.getwhistler.steps.serenity;

import io.getwhistler.LOCATORS;
import io.getwhistler.pages.CIDSignInPage;
import io.getwhistler.pages.CIDVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage;
import io.getwhistler.pages.EMDSignInPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class EndUserSteps extends ScenarioSteps {

    EMDSignInPage emdSignInPage;
    CIDSignInPage cidSignInPage;
    CIDVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage cidVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage;

    //======================================================SignInPage===================================================

    @Step
    public void openSignInPage() {
        emdSignInPage.open();
    }

    public void enterEmailInTheEmailAddressField(String arg0) {
        emdSignInPage.enterEmailInTheEmailAddressField(arg0);
    }

    public void clickOnTheNextButton() {
        emdSignInPage.clickOnTheNextButton();
    }

    public void emailIsDisplayedAbovePasswordField(String arg0) {
        Assert.assertTrue("False", emdSignInPage.emailIsDisplayedAbovePasswordField(arg0));
    }

    public void enterPasswordInThePasswordField(String arg0) {
        emdSignInPage.enterPasswordInThePasswordField(arg0);
    }

    public void clickOnSignInButton() {
        emdSignInPage.clickOnSignInButton();
    }

    public void userNameIsDisplayedInTheLeftNavigationMenu(String arg0) {
        Assert.assertTrue("False", emdSignInPage.userNameIsDisplayedInTheLeftNavigationMenu(arg0));
    }

    public void inboxPageIsDisplayed() {
        Assert.assertTrue("False", emdSignInPage.inboxPageIsDisplayed());
    }

    public void openAuthenticationPage() {
        cidSignInPage.open();
    }

    public void dashboardPageIsDisplayed() {
        Assert.assertTrue("False", cidSignInPage.dashboardPageIsDisplayed());
    }

    public void linkIsDisplayedInTheLeftNavigationMenu(String arg0) {
        Assert.assertTrue("False", cidVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage.linkIsDisplayedInTheLeftNavigationMenu(arg0));
    }

    public void clickOnLink(String arg0) {
        cidVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage.clickOnLink(arg0);
    }

    public void expandedMenuIsAppeared() {
        Assert.assertTrue("False", cidVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage.expandedMenuIsAppeared());
    }
}