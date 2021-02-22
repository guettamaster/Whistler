package io.getwhistler.pages;

import io.getwhistler.LOCATORS;
import io.getwhistler.pages.CIDSignInPage;
import io.getwhistler.pages.CIDVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicyPage;
import io.getwhistler.pages.EMDSignInPage;
import io.getwhistler.pages.EMDVerifyingThatViolationIsCreatedAndDisplayedPage;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

@DefaultUrl("https://www.google.com/")

public class EMDVerifyingThatViolationIsCreatedAndDisplayedPage extends net.serenitybdd.core.pages.PageObject {

    private static Logger logger = LoggerFactory.getLogger(EMDVerifyingThatViolationIsCreatedAndDisplayedPage.class);

    public void enterPasswordInThePasswordField(String arg0) {
//        Robot robot=null;
//        try {
//            robot = new Robot();
//        } catch (AWTException e) {
//            e.printStackTrace();
//        }
//        char[] strToArray = arg0.toCharArray();
        String xpath = LOCATORS.GOOGLE_INPUT_FIELD;
        withTimeoutOf(15, ChronoUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        $(xpath).click();
        $(xpath).sendKeys(arg0);
        $(xpath).sendKeys(Keys.SPACE);
//        robot.keyPress(KeyEvent.VK_D);
//        robot.keyPress(KeyEvent.VK_W);
//        robot.keyPress(KeyEvent.VK_A);
//        robot.keyPress(KeyEvent.VK_N);
//        robot.keyPress(KeyEvent.VK_E);
//        robot.keyPress(KeyEvent.VK_SPACE);


    }

//    public void openNewTab() throws Throwable {
//        ((JavascriptExecutor) getDriver()).executeScript("window.open()");
//        switchToTab(2);
//    }
//
//    private void switchToTab(int i) {
//        ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
//        getDriver().switchTo().window(tabs.get(1));
//    }
//
//    public void enterWordInTheTab(String url) {
//        getDriver().get("https://" +url);
//    }
}
