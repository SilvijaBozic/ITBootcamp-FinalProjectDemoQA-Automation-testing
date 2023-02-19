package DEMOQA_TESTS;

import DEMOQA_BASE.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButton_Test extends Base {
    @BeforeMethod
    public void pageSeUp(){
        driver.manage().window().maximize();
        driver.get(excelReader.getStringData("URL", 1, 4));
    }
    @Test
    public void clickOnButtons() throws InterruptedException {

        radioButton_page.getYesImpressiveNoButtons().get(0).click();
        Assert.assertTrue(radioButton_page.getNotificationIfYouClickYesButton().isDisplayed());
        radioButton_page.getYesImpressiveNoButtons().get(1).click();
        Assert.assertTrue(radioButton_page.getNotificationIfYouClickImpressiveButton().isDisplayed());
        Assert.assertTrue(radioButton_page.getYesImpressiveNoButtons().get(2).isDisplayed());
        //kako assertovati da no button nije klikabilno?



        /*
        try {
           if (noButton.isEnabled());
           noButton.click();
        }
        catch(Exception e) {
        //TEST JE PROSAO?
        }*/
    }
}
