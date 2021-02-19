package io.getwhistler.pages;

import io.getwhistler.LOCATORS;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

@DefaultUrl("https://test-dashboard.getwhistler.io/")
//https://dashboard.getwhistler.io/

public class RAVerifyingTheContentInsideTheEmailWithTheViolationPage extends net.serenitybdd.core.pages.PageObject {

    private static Logger logger = LoggerFactory.getLogger(RASignInPage.class);

    public void clickOnTheFromMikeFoyle(String arg0) {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.SENT_MESSAGE_FROM_THE_YAHOO_MAIL.replace("$1", arg0)));
    }

    public boolean isOpened(String arg0) {
        withTimeoutOf(30, ChronoUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.MESSAGE_DETAILS_POPUP.replace("$1", arg0))));
        return $(LOCATORS.MESSAGE_DETAILS_POPUP.replace("$1", arg0)).isPresent();
    }

    public boolean withHighRiskIsDisplayedOnTheOpenIssuesList(String arg0) {
        withTimeoutOf(30, ChronoUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.HIGH_RISK_MESSAGE_ON_THE_OPEN_ISSUES_LIST.replace("$1", arg0))));
        return $(LOCATORS.HIGH_RISK_MESSAGE_ON_THE_OPEN_ISSUES_LIST.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheWithHighRisk(String arg0) {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.HIGH_RISK_MESSAGE_ON_THE_OPEN_ISSUES_LIST.replace("$1", arg0)));
    }

    public boolean withHighRiskIsDisplayedInTheMessageDetailsPopUp(String arg0) {
        withTimeoutOf(30, ChronoUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.HIGH_RISK_LABEL_ON_THE_MESSAGE.replace("$1", arg0))));
        return $(LOCATORS.HIGH_RISK_LABEL_ON_THE_MESSAGE.replace("$1", arg0)).isPresent();
    }
}
