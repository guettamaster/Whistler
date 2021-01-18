package io.getwhistler.steps.serenity;

import io.getwhistler.LOCATORS;
import io.getwhistler.pages.CIDSignInPage;
import io.getwhistler.pages.CIDVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage;
import io.getwhistler.pages.EMDSignInPage;
import io.getwhistler.pages.EMDVerifyingThatViolationIsCreatedAndDisplayedPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class EndUserSteps extends ScenarioSteps {

    EMDSignInPage emdSignInPage;
    CIDSignInPage cidSignInPage;
    CIDVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage cidVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage;
    EMDVerifyingThatViolationIsCreatedAndDisplayedPage emdVerifyingThatViolationIsCreatedAndDisplayedPage;

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

    public void lexiconsSubLinkIsDisplayedInTheExpandedMenu() {
        Assert.assertTrue("False", cidVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage.lexiconsSubLinkIsDisplayedInTheExpandedMenu());
    }

    public void clickOnLexiconsSubLink() {
        cidVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage.clickOnLexiconsSubLink();
    }

    public void lexiconsPageIsOpened() {
        Assert.assertTrue("False", cidVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage.lexiconsPageIsOpened());
    }

    public void chooseLexiconFromTheLexiconsList(String arg0) {
        cidVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage.chooseLexiconFromTheLexiconsList(arg0);
    }

    public void lexiconPageIsOpened(String arg0) {
        Assert.assertTrue("False", cidVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage.lexiconPageIsOpened(arg0));
    }

    public void editLexiconButtonIsDisplayed() {
        Assert.assertTrue("False", cidVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage.editLexiconButtonIsDisplayed());
    }

    public void clickOnEditLexiconButton() {
        cidVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage.clickOnEditLexiconButton();
    }

    public void editLexiconPopUpIsAppeared() {
        Assert.assertTrue("False", cidVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage.editLexiconPopUpIsAppeared());
    }

    public void neverBlockRadioButtonIsSelected() {
        Assert.assertTrue("False", cidVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage.neverBlockRadioButtonIsSelected());
    }

    public void openNewTab() throws Throwable {
        emdVerifyingThatViolationIsCreatedAndDisplayedPage.openNewTab();
    }

    public void enterWordInTheTab(String url) {
        emdVerifyingThatViolationIsCreatedAndDisplayedPage.enterWordInTheTab(url);
    }
}