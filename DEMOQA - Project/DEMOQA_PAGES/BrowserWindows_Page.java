package DEMOQA_PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserWindows_Page {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement newTab;
    WebElement newWindow;
    WebElement newWindowMessage;
    WebElement NewWindowContent;

    public WebElement getNewWindowContent() {
        return driver.findElement(By.xpath("/html/body"));
    }

    public BrowserWindows_Page(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getNewTab() {
        return driver.findElement(By.id("tabButton"));
    }

    public WebElement getNewWindow() {
        return driver.findElement(By.id("windowButton"));
    }

    public WebElement getNewWindowMessage() {
        return driver.findElement(By.id("messageWindowButton"));
    }
}
