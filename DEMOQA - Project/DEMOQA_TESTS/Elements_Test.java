package DEMOQA_TESTS;

import DEMOQA_BASE.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Elements_Test extends Base {
    @BeforeMethod
    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.get(excelReader.getStringData("URL", 1, 1));
    }
    @Test
    public void clickOnSideCards(){
        elements_page.clickOnTextBox();
        elements_page.clickOnCheckBox();
        elements_page.clickOnRadioButton();
        elements_page.clickOnWebTables();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        elements_page.clickOnButton();
        elements_page.clickOnLinks();
        elements_page.clickOnBrokenLinkesImages();
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,250)", "");
        elements_page.clickOnUploadDownload();
        elements_page.clickOnDynamicProperties();
        Assert.assertTrue(elements_page.getDynamicPropertiesDisplayed().isDisplayed());
    }
}
