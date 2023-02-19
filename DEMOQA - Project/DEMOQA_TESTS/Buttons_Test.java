package DEMOQA_TESTS;

import DEMOQA_BASE.Base;
import com.beust.ah.A;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Buttons_Test extends Base {
        @BeforeMethod
    public void setThePageUp(){
            driver.manage().window().maximize();
            driver.get(excelReader.getStringData("URL", 1, 6));

        }

    @Test
    public void doubleClickOnButton(){
        Actions actions = new Actions(driver);
        actions.doubleClick(buttons_page.getDoubleClickMe()).perform();
        String notification = "You have done a double click";
        Assert.assertEquals(buttons_page.getDoubleClickNotification().getText(),notification );
        }
    @Test
    public void rightClickOnButton() {
        Actions actions = new Actions(driver);
        actions.contextClick(buttons_page.getRightClickMe()).perform();
        String notification = "You have done a right click";
        Assert.assertEquals(buttons_page.getRightClickNotification().getText(), notification);
    }

    @Test
    public void clickOnClickMeButton(){
    buttons_page.getClickMe().click();
    String notification = "You have done a dynamic click";
    Assert.assertEquals(buttons_page.getClickMeNotification().getText(), notification);
    }
}
