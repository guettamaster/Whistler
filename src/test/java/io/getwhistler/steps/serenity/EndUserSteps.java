package io.getwhistler.steps.serenity;

import io.getwhistler.LOCATORS;
import io.getwhistler.pages.EMDSignInPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class EndUserSteps extends ScenarioSteps {

    EMDSignInPage emdSignInPage;

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
}