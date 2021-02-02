package io.getwhistler.pages;

import io.getwhistler.LOCATORS;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.concurrent.TimeUnit;

@DefaultUrl("https://www.google.com/")

public class RAVerfyingThatViolationSentAndDisplayedOnEmailPage extends net.serenitybdd.core.pages.PageObject {

    private static Logger logger = LoggerFactory.getLogger(RAVerfyingThatViolationSentAndDisplayedOnEmailPage.class);

    public void clickOnTheEnterButton() {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.ENTER_BUTTON));
    }

}

