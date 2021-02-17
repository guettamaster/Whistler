package io.getwhistler.pages;

import io.getwhistler.LOCATORS;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.temporal.ChronoUnit;

@DefaultUrl("https://test-dashboard.getwhistler.io/")
//https://dashboard.getwhistler.io/

public class RAVerifyingTheContentInsideTheEmailWithTheViolationPage extends net.serenitybdd.core.pages.PageObject {

    private static Logger logger = LoggerFactory.getLogger(RASignInPage.class);

    public void clickOnTheFromMikeFoyle(String arg0) {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.SENT_MESSAGE_FROM_THE_YAHOO_MAIL));
    }

    public boolean isOpened(String arg0) {
        withTimeoutOf(30, ChronoUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS..replace("$1", arg0))));
        return $(LOCATORS..replace("$1", arg0)).isPresent();
    }
}
