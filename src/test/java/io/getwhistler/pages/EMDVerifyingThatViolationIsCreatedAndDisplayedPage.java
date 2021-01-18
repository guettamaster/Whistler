package io.getwhistler.pages;

import io.getwhistler.pages.CIDSignInPage;
import io.getwhistler.pages.CIDVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage;
import io.getwhistler.pages.EMDSignInPage;
import io.getwhistler.pages.EMDVerifyingThatViolationIsCreatedAndDisplayedPage;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

@DefaultUrl("https://endpoint-desktop.getwhistler.io/")

public class EMDVerifyingThatViolationIsCreatedAndDisplayedPage extends net.serenitybdd.core.pages.PageObject {

    private static Logger logger = LoggerFactory.getLogger(CIDSignInPage.class);

    public void openNewTab() throws Throwable {
        ((JavascriptExecutor) getDriver()).executeScript("window.open()");
        switchToTab(2);
    }

    private void switchToTab(int i) {
        ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(1));
    }

    public void enterWordInTheTab(String url) {
        getDriver().get(url);
    }
}
