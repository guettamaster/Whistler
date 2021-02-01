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

    private static Logger logger = LoggerFactory.getLogger(CIDVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage.class);

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

    public boolean lexiconsSubLinkIsDisplayedInTheExpandedMenu() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.LEXICONS_SUB_LINK)));
        return $(LOCATORS.LEXICONS_SUB_LINK).isPresent();
    }

    public void clickOnLexiconsSubLink() {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.LEXICONS_SUB_LINK));
    }

    public boolean lexiconsPageIsOpened() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.LEXICONS_TITLE)));
        return $(LOCATORS.LEXICONS_TITLE).isPresent();
    }

    public void chooseLexiconFromTheLexiconsList(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(org.openqa.selenium.By.xpath(LOCATORS.LEXICONS_NAME_FROM_THE_LEXICONS_LIST.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.LEXICONS_NAME_FROM_THE_LEXICONS_LIST.replace("$1", arg0)));
    }

    public boolean lexiconPageIsOpened(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(LOCATORS.LEXICON_PAGE_BREADCRUMB.replace("$1", arg0))));
        return $(LOCATORS.LEXICON_PAGE_BREADCRUMB.replace("$1", arg0)).isPresent();
    }

    public boolean editLexiconButtonIsDisplayed() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.EDIT_LEXICON_BUTTON)));
        return $(LOCATORS.EDIT_LEXICON_BUTTON).isPresent();
    }

    public void clickOnEditLexiconButton() {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.EDIT_LEXICON_BUTTON));
    }

    public boolean editLexiconPopUpIsAppeared() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.EDIT_LEXICON_POPUP)));
        return $(LOCATORS.EDIT_LEXICON_POPUP).isPresent();
    }

    public boolean neverBlockRadioButtonIsSelected() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(LOCATORS.SELECTED_NEVER_BLOCK_RADIO_BUTTON)));
        return $(LOCATORS.SELECTED_NEVER_BLOCK_RADIO_BUTTON).isPresent();
    }
}
