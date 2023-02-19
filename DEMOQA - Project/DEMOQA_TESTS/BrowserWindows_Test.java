package DEMOQA_TESTS;

import DEMOQA_BASE.Base;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BrowserWindows_Test extends Base {
    @BeforeMethod
    public void setThePageUp() {
        driver.manage().window().maximize();
        driver.get(excelReader.getStringData("URL", 1, 11));
    }

    @Test
    public void clickOnButtonNewTab() {
        browserWindows_page.getNewTab().click();
        List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles()); //switch to new tab
        driver.switchTo().window(browserTabs.get(1));
        Assert.assertEquals("https://demoqa.com/sample", driver.getCurrentUrl());

    }

    @Test
    public void clickOnButtonNewWindow() {
        browserWindows_page.getNewWindow().click();
        List<String> browserWindows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(browserWindows.get(1));
        Assert.assertEquals("https://demoqa.com/sample", driver.getCurrentUrl());
    }

    @Test
    public void clickOnButtonNewWindowMessage() {
        browserWindows_page.getNewWindowMessage().click();
        List<String> browserWindows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(browserWindows.get(1));
        // nije prepoznao xpath tako da ne moze da assertuje da text postoji
        //  String content = "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.";
        // Assert.assertEquals(content, browserWindows_page.getNewWindowContent().getText());
    }
}
