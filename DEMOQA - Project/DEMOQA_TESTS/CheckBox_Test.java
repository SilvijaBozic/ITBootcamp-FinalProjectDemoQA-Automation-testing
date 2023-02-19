package DEMOQA_TESTS;

import DEMOQA_BASE.Base;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBox_Test extends Base {
    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.get(excelReader.getStringData("URL", 1, 3));
    }

    @Test
    public void clickOnHomeBox(){
        checkBox_page.clickOnHomeBox();
        Assert.assertTrue(checkBox_page.getNotification().isDisplayed());
        checkBox_page.getExpandAllBox().click();
        Assert.assertTrue(checkBox_page.getBoxes().get(0).isDisplayed());
        checkBox_page.getCollapseAllBox().click();
        Assert.assertTrue(checkBox_page.getNotification().isDisplayed());
    }

}
