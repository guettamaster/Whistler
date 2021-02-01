package io.getwhistler.pages;

import io.appium.java_client.windows.WindowsDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import javax.naming.Name;
import java.net.URL;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class NotepadTest {

    private static WindowsDriver notepadSession = null;


    public static String getDate(){
        LocalDate date = LocalDate.now();
        System.out.println(date.toString());
        return date.toString();
    }


    @BeforeClass
    public static void setUp() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("app", "notepad.exe");
            capabilities.setCapability("platformName", "Windows");
            capabilities.setCapability("deviceName", "PC");
            notepadSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
            notepadSession.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    @After
//    public void cleanApp(){
//        notepadSession.quit();
//        setUp();
//    }
//
//    @AfterAll
//    public void tearDown(){
//        notepadSession.quit();
//    }
//        @Test
//        public void checkAboutWindow() {
//            notepadSession.findElementByName("Help").click();
//            notepadSession.findElementByName("About Notepad").click();
//            notepadSession.findElementByName("OK").click();
//        }
//
//        @Test
//        public void sendTestText(){
//            notepadSession.findElementByClassName("Value").sendKeys(getDate());
//            notepadSession.findElementByClassName("Edit").clear();
//        }
//
//        @Test()
//        public void pressTimeAndDateButton(){
//            notepadSession.findElementByName("Edit").click();
//            notepadSession.findElementByAccessibilityId("26").click();
//            Assert.assertNotNull(notepadSession.findElementByClassName("Edit"));
//            notepadSession.findElementByClassName("Edit").clear();
//    }

        @Test
        public void SendViolationWord() {
            notepadSession.findElementByClassName("Edit").sendKeys("lss");
            notepadSession.findElementByClassName("Edit").click();

//            notepadSession.findElementByClassName("WhistlerViolationAlertPopup").click();
//            notepadSession.findElementByName("btnOk").click();

            WebElement t = notepadSession.switchTo().activeElement();
            System.out.println(t.getText());

            notepadSession.findElementByName("File").click();
            notepadSession.findElementByName("Exit").click();
            notepadSession.findElementByName("Don't Save").click();
    }


}
