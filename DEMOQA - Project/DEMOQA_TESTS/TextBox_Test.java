package DEMOQA_TESTS;

import DEMOQA_BASE.Base;
import DEMOQA_PAGES.TextBox_Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBox_Test extends Base {

    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.get(excelReader.getStringData("URL", 1, 2));
    }

    @Test
    public void insertUserInfo() throws InterruptedException {
        String validFullName = excelReader.getStringData("TEXTBOX", 1, 0);
        String validEmail = excelReader.getStringData("TEXTBOX", 1, 1);
        String validCurrentAddress = excelReader.getStringData("TEXTBOX", 1, 2);
        String validPermanentAddress = excelReader.getStringData("TEXTBOX", 1, 3);
        Thread.sleep(5000);
        textBox_page.getFullName().click();
        textBox_page.insertFullName(validFullName);
        textBox_page.getEmailAddress().click();
        textBox_page.insertEmailAddress(validEmail);
        Thread.sleep(5000);
        textBox_page.getCurrentAddress().click();
        textBox_page.insertCurrentAddress(validCurrentAddress);
        textBox_page.getPermanentAddress().click();
        textBox_page.insertPermanentAddress(validPermanentAddress);
        textBox_page.clickOnSubmitButton();
        Assert.assertTrue(textBox_page.getTextBoxInfo().isDisplayed());
    }

    @Test
    public void insertInvalidEmail() throws InterruptedException {
        String validFullName = excelReader.getStringData("TEXTBOX", 1, 0);
        String validEmail = excelReader.getStringData("TEXTBOX", 2, 1);
        String validCurrentAddress = excelReader.getStringData("TEXTBOX", 1, 2);
        String validPermanentAddress = excelReader.getStringData("TEXTBOX", 1, 3);
        Thread.sleep(3000);
        textBox_page.getFullName().click();
        textBox_page.insertFullName(validFullName);
        textBox_page.getEmailAddress().click();
        textBox_page.insertEmailAddress(validEmail);
        Thread.sleep(3000);
        textBox_page.getCurrentAddress().click();
        textBox_page.insertCurrentAddress(validCurrentAddress);
        Thread.sleep(3000);
        textBox_page.getPermanentAddress().click();
        textBox_page.insertPermanentAddress(validPermanentAddress);
        textBox_page.clickOnSubmitButton();
        Assert.assertFalse(textBox_page.getTextBoxInfo().isDisplayed());
    }
    @Test
    public void insertNameAndEmailWithOutAddresses() throws InterruptedException {
        String validFullName = excelReader.getStringData("TEXTBOX", 1, 0);
        String validEmail = excelReader.getStringData("TEXTBOX", 1, 1);
        String validCurrentAddress = excelReader.getStringData("TEXTBOX", 1, 2);
        String validPermanentAddress = excelReader.getStringData("TEXTBOX", 1, 3);
        Thread.sleep(3000);
        textBox_page.getFullName().click();
        textBox_page.insertFullName(validFullName);
        textBox_page.getEmailAddress().click();
        textBox_page.insertEmailAddress(validEmail);
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        textBox_page.clickOnSubmitButton();
        Assert.assertTrue(textBox_page.getTextBoxInfo().isDisplayed());
    }
}

