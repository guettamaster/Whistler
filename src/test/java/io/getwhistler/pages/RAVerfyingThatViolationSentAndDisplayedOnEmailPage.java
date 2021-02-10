package io.getwhistler.pages;

import io.getwhistler.LOCATORS;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.concurrent.TimeUnit;
import java.time.temporal.ChronoUnit;

@DefaultUrl("https://mail.yahoo.com/")

public class RAVerfyingThatViolationSentAndDisplayedOnEmailPage extends net.serenitybdd.core.pages.PageObject {

    private static Logger logger = LoggerFactory.getLogger(RAVerfyingThatViolationSentAndDisplayedOnEmailPage.class);

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
        evaluateJavascript("arguments[0].click();", $(LOCATORS.GOOGLE_NEXT_BUTTON));
    }

    public boolean emailIsAppearedOnTheTop(String arg0) {
        withTimeoutOf(10, ChronoUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.EMAIL_ABOVE_PASSWORD_INPUT_FIELD.replace("$1", arg0))));
        return $(LOCATORS.EMAIL_ABOVE_PASSWORD_INPUT_FIELD.replace("$1", arg0)).isPresent();

    }

    public void enterPasswordInTheYahooPasswordField(String arg0) {
        $(LOCATORS.PASSWORD_INPUT_FIELD.replace("$1", arg0)).sendKeys(arg0);
    }

    public void clickOnTheNextButtonBelowPasswordFieldOnYahooEmailPage() {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.GOOGLE_NEXT_BUTTON_BELOW_PASSWORD_FIELD));
        waitABit(5000);
    }

    public void navigateOnUserIcon() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(findBy(LOCATORS.USER_ICON_ON_THE_MAILBOX_PAGE)).build().perform();
        waitABit(5000);
    }

    public boolean accountIsConnected(String arg0) {
        withTimeoutOf(10, ChronoUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.EMAIL_AFTER_SUCCESSFUL_AUTHORIZATION.replace("$1", arg0))));
        return $(LOCATORS.EMAIL_AFTER_SUCCESSFUL_AUTHORIZATION.replace("$1", arg0)).isPresent();
    }
}

