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

public class CIDSignInPage extends net.serenitybdd.core.pages.PageObject {

    private static Logger logger = LoggerFactory.getLogger(CIDSignInPage.class);

    public boolean dashboardPageIsDisplayed() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.DASHBOARD_GENERAL_TABLES)));
        return $(LOCATORS.DASHBOARD_GENERAL_TABLES).isPresent();
    }
}
