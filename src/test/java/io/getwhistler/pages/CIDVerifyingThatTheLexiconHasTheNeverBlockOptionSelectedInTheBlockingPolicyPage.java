package io.getwhistler.pages;

import io.getwhistler.LOCATORS;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.concurrent.TimeUnit;

@DefaultUrl("https://central.getwhistler.io/")

public class CIDVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage extends net.serenitybdd.core.pages.PageObject {

    private static Logger logger = LoggerFactory.getLogger(CIDSignInPage.class);

    public boolean linkIsDisplayedInTheLeftNavigationMenu(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(LOCATORS.DASHBOARD_GENERAL_TABLES.replace("$1", arg0))));
        return $(LOCATORS.DASHBOARD_GENERAL_TABLES.replace("$1", arg0)).isPresent();
    }

    public void clickOnLink(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(org.openqa.selenium.By.xpath(LOCATORS.LINK_IN_THE_LEFT_NAV_MENU.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.LINK_IN_THE_LEFT_NAV_MENU.replace("$1", arg0)));
    }

    public boolean expandedMenuIsAppeared() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.EXPANDED_MENU_AFTER_CLICKING_RISK_POLICIES_LINK)));
        return $(LOCATORS.EXPANDED_MENU_AFTER_CLICKING_RISK_POLICIES_LINK).isPresent();

    }
}