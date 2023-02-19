package DEMOQA_TESTS;

import DEMOQA_BASE.Base;
import DEMOQA_BASE.ExcelReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HomePage_Test extends Base {
    @BeforeMethod
    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.get(homeURL);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)", "");
        List<WebElement> elementList = driver.findElements(By.className("card-up"));
        elementList.get(0).click();
    }
    @Test
    public void testIfTextBoxIsOpen(){
    elements_page.clickOnTextBox();
    String expectedURLTextBox = excelReader.getStringData("URL", 1, 2);
    Assert.assertEquals(driver.getCurrentUrl(), expectedURLTextBox);
    }
    @Test
    public void clickOnBars() {
       /* JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,150)", "");*/
        homePage.clickOnElements();
        driver.navigate().back();
        homePage.clickOnForms();
        driver.navigate().back();
        homePage.clickOnAlerts();
        driver.navigate().back();
        homePage.clickOnWidgets();
        driver.navigate().back();
        homePage.clickOnInteractions();
        driver.navigate().back();
        JavascriptExecutor jse1 = (JavascriptExecutor) driver;
        jse1.executeScript("window.scrollBy(0,100)", "");
        homePage.clickOnBookstore();
        String URL = "https://demoqa.com/books";
        Assert.assertEquals(URL, driver.getCurrentUrl());
    }
}
