package io.getwhistler.pages;

import io.getwhistler.LOCATORS;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.concurrent.TimeUnit;

@DefaultUrl("https://endpoint-desktop.getwhistler.io/")

public class EMDSignInPage extends net.serenitybdd.core.pages.PageObject {

    private static Logger logger = LoggerFactory.getLogger(EMDSignInPage.class);

    public void enterEmailInTheEmailAddressField(String arg0) {
        $(LOCATORS.EMAIL_ADDRESS_FIELD.replace("$1", arg0)).sendKeys(arg0);
    }

    public void clickOnTheNextButton() {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.NEXT_BUTTON));
    }

    public boolean emailIsDisplayedAbovePasswordField(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(LOCATORS.EMAIL_ABOVE_PASSWORD_FIELD.replace("$1", arg0))));
        return $(LOCATORS.EMAIL_ABOVE_PASSWORD_FIELD.replace("$1", arg0)).isPresent();
    }

    public void enterPasswordInThePasswordField(String arg0) {
        $(LOCATORS.PASSWORD_FIELD.replace("$1", arg0)).sendKeys(arg0);
    }

    public void clickOnSignInButton() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.SIGNIN_BUTTON)));
        $(LOCATORS.SIGNIN_BUTTON).click();
    }

    public boolean userNameIsDisplayedInTheLeftNavigationMenu(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(LOCATORS.USER_NAME_AFTER_SUCCESSFUL_AUTHORIZATION.replace("$1", arg0))));
        return $(LOCATORS.USER_NAME_AFTER_SUCCESSFUL_AUTHORIZATION.replace("$1", arg0)).isPresent();
    }

    public boolean inboxPageIsDisplayed() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.CATEGORIES_TITLE)));
        return $(LOCATORS.CATEGORIES_TITLE).isPresent();
    }

}