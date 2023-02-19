package DEMOQA_PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinksAndImaged_Page {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement brokenImage;
    WebElement validLink;
    WebElement brokenLink;

    WebElement brokenContent;

    public BrokenLinksAndImaged_Page(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getBrokenImage() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/img[2]"));
    }

    public WebElement getValidLink() {
        return driver.findElement(By.linkText("Click Here for Valid Link"));
    }

    public WebElement getBrokenLink() {
        return driver.findElement(By.linkText("Click Here for Broken Link"));
    }
    public WebElement getBrokenContent() {
        return driver.findElement(By.id("content"));
    }
}
