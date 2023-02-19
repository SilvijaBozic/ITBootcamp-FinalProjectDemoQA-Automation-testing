package DEMOQA_TESTS;

import DEMOQA_BASE.Base;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alerts_Test extends Base {
    @BeforeMethod
    public void SetPageUp(){
        driver.manage().window().maximize();
        driver.get(excelReader.getStringData("URL", 1, 12));
    }
    @Test
    public void verifyThatButtonsAreDisplayed(){
        Assert.assertTrue(alerts_page.getButtons().isDisplayed());
    }
    @Test
    public void verifyThatButtonsAreClickable(){
        alerts_page.getButton1().click();
        driver.navigate().refresh();
        alerts_page.getButton2().click();
        driver.navigate().refresh();
        alerts_page.getButton3().click();
        driver.navigate().refresh();
        alerts_page.getButton4().click();
        driver.navigate().refresh();
    }
}
