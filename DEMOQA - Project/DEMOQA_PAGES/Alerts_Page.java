package DEMOQA_PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts_Page {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement buttons;
    WebElement button1;
    WebElement button2;
    WebElement button3;
    WebElement button4;




    public Alerts_Page(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
    public WebElement getButtons() {
        return driver.findElement(By.id("javascriptAlertsWrapper"));
    }
    public WebElement getButton1() {
        return driver.findElement(By.id("alertButton"));
    }

    public WebElement getButton2() {
        return driver.findElement(By.id("timerAlertButton"));
    }

    public WebElement getButton3() {
        return driver.findElement(By.id("confirmButton"));
    }

    public WebElement getButton4() {
        return driver.findElement(By.id("promtButton"));
    }
}
