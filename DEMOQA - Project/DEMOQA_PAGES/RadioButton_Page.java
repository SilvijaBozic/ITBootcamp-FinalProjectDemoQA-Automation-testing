package DEMOQA_PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class RadioButton_Page {
    WebDriver driver;

    WebDriverWait wdwait;
    List<WebElement> YesImpressiveNoButtons;
    WebElement notificationIfYouClickYesButton;
    WebElement notificationIfYouClickImpressiveButton;
    public RadioButton_Page(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
    public List<WebElement> getYesImpressiveNoButtons() {
        return driver.findElements(By.className("custom-control-label"));
    }
    public WebElement getNotificationIfYouClickYesButton() {
        return driver.findElement(By.className("mt-3"));
    }
    public WebElement getNotificationIfYouClickImpressiveButton() {
        return driver.findElement(By.className("text-success"));
    }
}
