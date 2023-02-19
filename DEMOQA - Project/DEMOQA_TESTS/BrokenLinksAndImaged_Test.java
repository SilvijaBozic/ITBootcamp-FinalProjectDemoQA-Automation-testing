package DEMOQA_TESTS;

import DEMOQA_BASE.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BrokenLinksAndImaged_Test extends Base {
    @BeforeMethod
    public void pageSetItUp(){
      driver.manage().window().maximize();
      driver.get(excelReader.getStringData("URL", 1, 8));
   }
   @Test
   public void checkIfBrokenImageIsDisplayed(){
        Assert.assertTrue(brokenLinksAndImaged_page.getBrokenImage().isDisplayed());
   }
   @Test
   public void clickOnValidLink(){
        brokenLinksAndImaged_page.getValidLink().click();
       Assert.assertNotEquals("https://demoqa.com/broken", driver.getCurrentUrl());
   }
   @Test
   public void clickOnBrokenLink(){
       JavascriptExecutor jse = (JavascriptExecutor) driver;
       jse.executeScript("window.scrollBy(0,250)", "");
        brokenLinksAndImaged_page.getBrokenLink().click();
        Assert.assertTrue(brokenLinksAndImaged_page.getBrokenContent().isDisplayed());
   }
}
