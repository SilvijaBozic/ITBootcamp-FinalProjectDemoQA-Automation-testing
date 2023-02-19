package DEMOQA_TESTS;

import DEMOQA_BASE.Base;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Frames_Test extends Base {
    @BeforeMethod
    public void pageSetUpMethod(){
        driver.manage().window().maximize();
        driver.get(excelReader.getStringData("URL", 1, 13));
    }
    @Test
    public void checkIfFramesAreDisplayed(){
        Assert.assertTrue(frames_page.getFrame1().isDisplayed());
        Assert.assertTrue(frames_page.getFrame2().isDisplayed());
    }
}
