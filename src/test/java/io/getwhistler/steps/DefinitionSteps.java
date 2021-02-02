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

    @Then("^\"([^\"]*)\" link is displayed in the Left Navigation menu$")
    public void linkIsDisplayedInTheLeftNavigationMenu(String arg0) throws Throwable {
        endUserSteps.linkIsDisplayedInTheLeftNavigationMenu(arg0);
    }

    @When("^click on \"([^\"]*)\" link$")
    public void clickOnLink(String arg0) throws Throwable {
        endUserSteps.clickOnLink(arg0);
    }

    @Then("^Expanded menu is appeared$")
    public void expandedMenuIsAppeared() {
        endUserSteps.expandedMenuIsAppeared();
    }

    @Then("^Lexicons sub-link is displayed in the Expanded menu$")
    public void lexiconsSubLinkIsDisplayedInTheExpandedMenu() {
        endUserSteps.lexiconsSubLinkIsDisplayedInTheExpandedMenu();
    }

    @When("^click on Lexicons sub-link$")
    public void clickOnLexiconsSubLink() {
        endUserSteps.clickOnLexiconsSubLink();
    }

    @Then("^Lexicons page is opened$")
    public void lexiconsPageIsOpened() {
        endUserSteps.lexiconsPageIsOpened();
    }

    @When("^choose \"([^\"]*)\" lexicon from the lexicons list$")
    public void chooseLexiconFromTheLexiconsList(String arg0) throws Throwable {
        endUserSteps.chooseLexiconFromTheLexiconsList(arg0);
    }

    @Then("^\"([^\"]*)\" lexicon page is opened$")
    public void lexiconPageIsOpened(String arg0) throws Throwable {
        endUserSteps.lexiconPageIsOpened(arg0);
    }

    @Then("^Edit lexicon button is displayed$")
    public void editLexiconButtonIsDisplayed() {
        endUserSteps.editLexiconButtonIsDisplayed();
    }

    @When("^click on Edit lexicon button$")
    public void clickOnEditLexiconButton() {
        endUserSteps.clickOnEditLexiconButton();
    }

    @Then("^Edit Lexicon pop-up is appeared$")
    public void editLexiconPopUpIsAppeared() {
        endUserSteps.editLexiconPopUpIsAppeared();
    }

    @Then("^Never Block radio button is selected$")
    public void neverBlockRadioButtonIsSelected() {
        endUserSteps.neverBlockRadioButtonIsSelected();
    }

    @When("^send violation word$")
    public void SendViolationWord() throws Throwable {
        endUserSteps.SendViolationWord();
    }

    @Given("^open RA authentication page$")
    public void openRAAuthenticationPage() {
        endUserSteps.openRAAuthenticationPage();
    }

    @Then("^RA Inbox page is displayed$")
    public void raInboxPageIsDisplayed() {
        endUserSteps.raInboxPageIsDisplayed();
    }

    @Given("^open google start page$")
    public void openGoogleStartPage() {
        endUserSteps.openGoogleStartPage();
    }

    @When("^click on the Enter button$")
    public void clickOnTheEnterButton() {
        endUserSteps.clickOnTheEnterButton();
    }
}
