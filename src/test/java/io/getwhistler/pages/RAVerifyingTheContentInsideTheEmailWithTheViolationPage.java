package io.getwhistler.pages;

import io.getwhistler.LOCATORS;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.temporal.ChronoUnit;

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

    public void openCIDLoginPage() {
        getDriver().get("https://central.getwhistler.io/");
    }

    public boolean flagsSubLinkIsDisplayedInTheExpandedMenu() {
        withTimeoutOf(15, ChronoUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.FLAGS_SUB_LINK)));
        return $(LOCATORS.FLAGS_SUB_LINK).isPresent();
    }

    public void clickOnFlagsSubLink() {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.FLAGS_SUB_LINK));
    }

    public boolean flagsPageIsOpened() {
        withTimeoutOf(15, ChronoUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.FLAGS_TITLE)));
        return $(LOCATORS.FLAGS_TITLE).isPresent();
    }

    public boolean flagIsDisplayed(String arg0) {
        return $(LOCATORS.FLAGS_NAME_FROM_THE_FLAGS_LIST.replace("$1", arg0)).isPresent();
    }

    public boolean flagWithHighRiskIsDisplayedOnTheFlagsPage(String arg0) {
        return $(LOCATORS.HIGH_RISK_FLAG_ON_THE_FLAGS_LIST.replace("$1", arg0)).isPresent();
    }

    public void chooseFlagFromTheFlagsList(String arg0) {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.FLAGS_NAME_FROM_THE_FLAGS_LIST.replace("$1", arg0)));
    }

    public boolean flagPopUpIsOpened(String arg0) {
        withTimeoutOf(5, ChronoUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(LOCATORS.FLAG_POPUP_VALUE)));
        return $(LOCATORS.FLAG_POPUP_VALUE.replace("$1", arg0)).isPresent();
    }

    public boolean flagWithHighRiskIsDisplayedInsideFlagPopUp(String arg0) {
        return $(LOCATORS.HIGH_RISK_FLAG_INSIDE_THE_FLAG_POPUP.replace("$1", arg0)).isPresent();
    }
}
