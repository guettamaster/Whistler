package io.getwhistler.steps;

import cucumber.api.PendingException;
import io.getwhistler.steps.serenity.EndUserSteps;
import cucumber.api.java.en.*;


import net.thucydides.core.annotations.Steps;

import java.net.URISyntaxException;
import java.util.Map;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUserSteps;

//======================================================SignInPage======================================================

    @Given("^open signin page$")
    public void openSignInPage() {
        endUserSteps.openSignInPage();
    }

    @When("^enter \"([^\"]*)\" email in the Email Address field$")
    public void enterEmailInTheEmailAddressField(String arg0) throws Throwable {
        endUserSteps.enterEmailInTheEmailAddressField(arg0);
    }

    @When("^click on the Next button$")
    public void clickOnTheNextButton() {
        endUserSteps.clickOnTheNextButton();
    }

    @Then("^\"([^\"]*)\" email is displayed above Password field$")
    public void emailIsDisplayedAbovePasswordField(String arg0) throws Throwable {
        endUserSteps.emailIsDisplayedAbovePasswordField(arg0);
    }

    @When("^enter \"([^\"]*)\" password in the Password field$")
    public void enterPasswordInThePasswordField(String arg0) throws Throwable {
        endUserSteps.enterPasswordInThePasswordField(arg0);
    }

    @When("^click on Sign In button$")
    public void clickOnSignInButton() {
        endUserSteps.clickOnSignInButton();
    }

    @Then("^\"([^\"]*)\" user name is displayed in the left navigation menu$")
    public void userNameIsDisplayedInTheLeftNavigationMenu(String arg0) throws Throwable {
        endUserSteps.userNameIsDisplayedInTheLeftNavigationMenu(arg0);
    }

    @Then("^Inbox page is displayed$")
    public void inboxPageIsDisplayed() {
        endUserSteps.inboxPageIsDisplayed();
    }

    @Given("^open authentication page$")
    public void openAuthenticationPage() {
        endUserSteps.openAuthenticationPage();
    }

    @Then("^Dashboard page is displayed$")
    public void dashboardPageIsDisplayed() {
        endUserSteps.dashboardPageIsDisplayed();
    }
}
