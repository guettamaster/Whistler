package io.getwhistler.steps.serenity;

import io.getwhistler.LOCATORS;
import io.getwhistler.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class EndUserSteps extends ScenarioSteps {

    EMDSignInPage emdSignInPage;
    CIDSignInPage cidSignInPage;
    CIDVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage cidVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage;
//    EMDVerifyingThatViolationIsCreatedAndDisplayedPage emdVerifyingThatViolationIsCreatedAndDisplayedPage;
    NotepadTest notepadTest;
    RASignInPage raSignInPage;
    RAVerfyingThatViolationSentAndDisplayedOnEmailPage raVerfyingThatViolationSentAndDisplayedOnEmailPage;

    //======================================================SignInPage===================================================

    @Step
    public void openSignInPage() {
        emdSignInPage.open();
    }

    @Step
    public void enterEmailInTheEmailAddressField(String arg0) {
        emdSignInPage.enterEmailInTheEmailAddressField(arg0);
    }

    @Step
    public void clickOnTheNextButton() {
        emdSignInPage.clickOnTheNextButton();
    }

    @Step
    public void emailIsDisplayedAbovePasswordField(String arg0) {
        Assert.assertTrue("False", emdSignInPage.emailIsDisplayedAbovePasswordField(arg0));
    }

    @Step
    public void enterPasswordInThePasswordField(String arg0) {
        emdSignInPage.enterPasswordInThePasswordField(arg0);
    }

    @Step
    public void clickOnSignInButton() {
        emdSignInPage.clickOnSignInButton();
    }

    @Step
    public void userNameIsDisplayedInTheLeftNavigationMenu(String arg0) {
        Assert.assertTrue("False", emdSignInPage.userNameIsDisplayedInTheLeftNavigationMenu(arg0));
    }

    @Step
    public void inboxPageIsDisplayed() {
        Assert.assertTrue("False", emdSignInPage.inboxPageIsDisplayed());
    }

    @Step
    public void openAuthenticationPage() {
        cidSignInPage.open();
    }

    @Step
    public void dashboardPageIsDisplayed() {
        Assert.assertTrue("False", cidSignInPage.dashboardPageIsDisplayed());
    }

    @Step
    public void linkIsDisplayedInTheLeftNavigationMenu(String arg0) {
        Assert.assertTrue("False", cidVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage.linkIsDisplayedInTheLeftNavigationMenu(arg0));
    }

    @Step
    public void clickOnLink(String arg0) {
        cidVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage.clickOnLink(arg0);
    }

    @Step
    public void expandedMenuIsAppeared() {
        Assert.assertTrue("False", cidVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage.expandedMenuIsAppeared());
    }

    @Step
    public void lexiconsSubLinkIsDisplayedInTheExpandedMenu() {
        Assert.assertTrue("False", cidVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage.lexiconsSubLinkIsDisplayedInTheExpandedMenu());
    }

    @Step
    public void clickOnLexiconsSubLink() {
        cidVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage.clickOnLexiconsSubLink();
    }

    @Step
    public void lexiconsPageIsOpened() {
        Assert.assertTrue("False", cidVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage.lexiconsPageIsOpened());
    }

    @Step
    public void chooseLexiconFromTheLexiconsList(String arg0) {
        cidVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage.chooseLexiconFromTheLexiconsList(arg0);
    }

    @Step
    public void lexiconPageIsOpened(String arg0) {
        Assert.assertTrue("False", cidVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage.lexiconPageIsOpened(arg0));
    }

    @Step
    public void editLexiconButtonIsDisplayed() {
        Assert.assertTrue("False", cidVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage.editLexiconButtonIsDisplayed());
    }

    @Step
    public void clickOnEditLexiconButton() {
        cidVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage.clickOnEditLexiconButton();
    }

    @Step
    public void editLexiconPopUpIsAppeared() {
        Assert.assertTrue("False", cidVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage.editLexiconPopUpIsAppeared());
    }

    @Step
    public void neverBlockRadioButtonIsSelected() {
        Assert.assertTrue("False", cidVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage.neverBlockRadioButtonIsSelected());
    }

    @Step
    public void SendViolationWord() {
        notepadTest.SendViolationWord();
    }

    @Step
    public void openRAAuthenticationPage() {
        raSignInPage.open();
    }

    @Step
    public void raInboxPageIsDisplayed() {
        Assert.assertTrue("False", raSignInPage.raInboxPageIsDisplayed());
    }

    @Step
    public void openGoogleStartPage() {
        raVerfyingThatViolationSentAndDisplayedOnEmailPage.open();
    }

    @Step
    public void clickOnTheEnterButton() {
        raVerfyingThatViolationSentAndDisplayedOnEmailPage.clickOnTheEnterButton();
    }

    @Step
    public void titleIsDisplayedOnYahooEmailPage() {
        Assert.assertTrue("False", raVerfyingThatViolationSentAndDisplayedOnEmailPage.titleIsDisplayedOnYahooEmailPage());
    }

    @Step
    public void enterEmailInTheYahooEmailAddressField(String arg0) {
        raVerfyingThatViolationSentAndDisplayedOnEmailPage.enterEmailInTheYahooEmailAddressField(arg0);
    }

    @Step
    public void clickOnTheNextButtonOnYahooEmailPage() {
        raVerfyingThatViolationSentAndDisplayedOnEmailPage.clickOnTheNextButtonOnYahooEmailPage();
    }

    @Step
    public void emailIsAppearedOnTheTop(String arg0) {
        Assert.assertTrue("False", raVerfyingThatViolationSentAndDisplayedOnEmailPage.emailIsAppearedOnTheTop(arg0));
    }

    @Step
    public void enterPasswordInTheYahooPasswordField(String arg0) {
        raVerfyingThatViolationSentAndDisplayedOnEmailPage.enterPasswordInTheYahooPasswordField(arg0);
    }
    @Step
    public void clickOnTheNextButtonBelowPasswordFieldOnYahooEmailPage() {
        raVerfyingThatViolationSentAndDisplayedOnEmailPage.clickOnTheNextButtonBelowPasswordFieldOnYahooEmailPage();
    }

    @Step
    public void navigateOnUserIcon() {
        raVerfyingThatViolationSentAndDisplayedOnEmailPage.navigateOnUserIcon();
    }

    @Step
    public void accountIsConnected(String arg0) {
        Assert.assertTrue("False", raVerfyingThatViolationSentAndDisplayedOnEmailPage.accountIsConnected(arg0));
    }

    @Step
    public void clickOnComposeButtonInTheLeftNavigationMenu() {
        raVerfyingThatViolationSentAndDisplayedOnEmailPage.clickOnComposeButtonInTheLeftNavigationMenu();
    }

    @Step
    public void sendMessageFormIsDisplayed() {
        Assert.assertTrue("False", raVerfyingThatViolationSentAndDisplayedOnEmailPage.sendMessageFormIsDisplayed());
    }

    @Step
    public void enterEmailInTheToField(String arg0) {
        raVerfyingThatViolationSentAndDisplayedOnEmailPage.enterEmailInTheToField(arg0);
    }

    @Step
    public void enterSubjectInTheSubjectField(String arg0) {
        raVerfyingThatViolationSentAndDisplayedOnEmailPage.enterSubjectInTheSubjectField(arg0);
    }

    @Step
    public void enterMessageInTheMessageField(String arg0) {
        raVerfyingThatViolationSentAndDisplayedOnEmailPage.enterMessageInTheMessageField(arg0);
    }

    @Step
    public void clickOnSendButton() {
        raVerfyingThatViolationSentAndDisplayedOnEmailPage.clickOnSendButton();
    }

    @Step
    public void openRALoginPage() {
        raVerfyingThatViolationSentAndDisplayedOnEmailPage.openRALoginPage();
    }

    @Step
    public void fromMikeFoyleIsDisplayed(String arg0) {
        Assert.assertTrue("False", raVerfyingThatViolationSentAndDisplayedOnEmailPage.fromMikeFoyleIsDisplayed(arg0));
    }
}