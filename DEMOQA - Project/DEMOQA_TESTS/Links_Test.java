package DEMOQA_TESTS;

import DEMOQA_BASE.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Links_Test extends Base {

    @BeforeMethod
    public void SetItUp(){
        driver.manage().window().maximize();
        driver.get(excelReader.getStringData("URL", 1, 7));
    }

    @Test
    public void clickOnLinksThatWillOpenInNewTab() throws InterruptedException {
        links_page.getHome().click();
        List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles()); //switch to new tab
        driver.switchTo().window(browserTabs.get(1));
        String URLHome= "https://demoqa.com/";
        Assert.assertEquals(URLHome, driver.getCurrentUrl());
        driver.switchTo().window(browserTabs.get(0));
        links_page.getHomepFQGT().click();
        driver.switchTo().window(browserTabs.get(1));
        Assert.assertEquals(URLHome, driver.getCurrentUrl());
    }

    @Test
    public void clickOnLinksThatSendApiCall() throws InterruptedException {
        links_page.getCreated().click();
        Assert.assertTrue(links_page.getNotificationForLinks().getText().equals("Link has responded with staus 201 and status text Created"));
       // links_page.getNoContent().click();
       // Assert.assertTrue(links_page.getNotificationForLinks().getText().equals("Link has responded with staus 204 and status text No Content"));
        links_page.getMoved().click();
        JavascriptExecutor jse2 = (JavascriptExecutor) driver;
        jse2.executeScript("window.scrollBy(0,250)", "");
        Assert.assertTrue(links_page.getNotificationForLinks().getText().equals("Link has responded with staus 301 and status text Moved Permanently"));
        links_page.getBadRequest().click();
        Thread.sleep(2000);
        Assert.assertTrue(links_page.getNotificationForLinks().getText().equals("Link has responded with staus 400 and status text Bad Request"));
        links_page.getUnauthorized().click();
        Thread.sleep(5000);
        Assert.assertTrue(links_page.getNotificationForLinks().equals("Link has responded with staus 401 and status text Unauthorized"));
        links_page.getForbidden().click();
        Assert.assertTrue(links_page.getNotificationForLinks().getText().equals("Link has responded with staus 403 and status text Forbidden"));
        links_page.getNotFound().click();
        Assert.assertTrue(links_page.getNotificationForLinks().getText().equals("Link has responded with staus 404 and status text Not Found"));
    }
}
