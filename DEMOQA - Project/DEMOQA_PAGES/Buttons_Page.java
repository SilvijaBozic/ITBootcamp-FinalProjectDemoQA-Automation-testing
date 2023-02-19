package DEMOQA_PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Buttons_Page {
    WebDriver driver;
    WebDriverWait wdwait;

    WebElement doubleClickMe;
    WebElement rightClickMe;
    WebElement clickMe;

    WebElement doubleClickNotification;
    WebElement rightClickNotification;
    WebElement clickMeNotification;



    public Buttons_Page(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getDoubleClickMe() {
        return driver.findElement(By.id("doubleClickBtn"));
    }

    public WebElement getRightClickMe() {
        return driver.findElement(By.id("rightClickBtn"));
    }

    public WebElement getClickMe() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button"));

    }
    public WebElement getDoubleClickNotification() {
        return driver.findElement(By.id("doubleClickMessage"));
    }

    public WebElement getRightClickNotification() {
        return driver.findElement(By.id("rightClickMessage"));
    }

    public WebElement getClickMeNotification() {
        return driver.findElement(By.id("dynamicClickMessage"));
    }
}
