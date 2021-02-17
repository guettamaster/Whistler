package io.getwhistler.pages;

import io.getwhistler.LOCATORS;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.temporal.ChronoUnit;

@DefaultUrl("https://mail.yahoo.com/")

public class RAVerifyingThatViolationSentAndDisplayedOnEmailPage extends net.serenitybdd.core.pages.PageObject {

    private static Logger logger = LoggerFactory.getLogger(RAVerifyingThatViolationSentAndDisplayedOnEmailPage.class);

    public void clickOnTheEnterButton() {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.ENTER_BUTTON));
    }

    public boolean titleIsDisplayedOnYahooEmailPage() {
        withTimeoutOf(15, ChronoUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.EMAIL_INPUT_FILED)));
        return $(LOCATORS.EMAIL_INPUT_FILED).isPresent();
    }

    public void enterEmailInTheYahooEmailAddressField(String arg0) {
        $(LOCATORS.EMAIL_INPUT_FILED.replace("$1", arg0)).sendKeys(arg0);
    }

    public void clickOnTheNextButtonOnYahooEmailPage() {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.YAHOO_NEXT_BUTTON));
    }

    public boolean emailIsAppearedOnTheTop(String arg0) {
        withTimeoutOf(10, ChronoUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.EMAIL_ABOVE_PASSWORD_INPUT_FIELD.replace("$1", arg0))));
        return $(LOCATORS.EMAIL_ABOVE_PASSWORD_INPUT_FIELD.replace("$1", arg0)).isPresent();

    }

    public void enterPasswordInTheYahooPasswordField(String arg0) {
        $(LOCATORS.PASSWORD_INPUT_FIELD.replace("$1", arg0)).sendKeys(arg0);
    }

    public void clickOnTheNextButtonBelowPasswordFieldOnYahooEmailPage() {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.YAHOO_NEXT_BUTTON_BELOW_PASSWORD_FIELD));
    }

    public void navigateOnUserIcon() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(findBy(LOCATORS.USER_ICON_ON_THE_MAILBOX_PAGE)).build().perform();
    }

    public boolean accountIsConnected(String arg0) {
        withTimeoutOf(10, ChronoUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.EMAIL_AFTER_SUCCESSFUL_AUTHORIZATION.replace("$1", arg0))));
        return $(LOCATORS.EMAIL_AFTER_SUCCESSFUL_AUTHORIZATION.replace("$1", arg0)).isPresent();
    }

    public void clickOnComposeButtonInTheLeftNavigationMenu() {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.COMPOSE_BUTTON));
    }

    public boolean sendMessageFormIsDisplayed() {
        withTimeoutOf(15, ChronoUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.SEND_MESSAGE_FORM)));
        return $(LOCATORS.SEND_MESSAGE_FORM).isPresent();
    }

    public void enterEmailInTheToField(String arg0) {
        $(LOCATORS.TO_FIELD_IN_THE_MESSAGE_FORM.replace("$1", arg0)).sendKeys(arg0);
    }

    public void enterSubjectInTheSubjectField(String arg0) {
        $(LOCATORS.SUBJECT_FIELD_IN_THE_MESSAGE_FORM.replace("$1", arg0)).sendKeys(arg0);
    }

    public void enterMessageInTheMessageField(String arg0) {
        $(LOCATORS.MESSAGE_FIELD_IN_THE_MESSAGE_FORM.replace("$1", arg0)).sendKeys(arg0);
    }

    public void clickOnSendButton() {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.SEND_BUTTON_IN_THE_MESSAGE_FORM));
    }

    public void openRALoginPage() {
        getDriver().get("https://dashboard.getwhistler.io/");
    }

    public boolean fromMikeFoyleIsDisplayed(String arg0) {
        withTimeoutOf(30, ChronoUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.SENT_MESSAGE_FROM_THE_YAHOO_MAIL.replace("$1", arg0))));
        return $(LOCATORS.SENT_MESSAGE_FROM_THE_YAHOO_MAIL.replace("$1", arg0)).isPresent();
    }
}

