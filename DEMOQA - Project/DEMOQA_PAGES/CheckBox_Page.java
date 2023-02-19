package DEMOQA_PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CheckBox_Page {

    WebDriver driver;
    WebDriverWait wdwait;

    WebElement Home;
    WebElement notification;

    WebElement ExpandAllBox;
    List<WebElement> Boxes;

    WebElement CollapseAllBox;

    public WebElement getCollapseAllBox() {
        return driver.findElement(By.cssSelector(".rct-option.rct-option-collapse-all"));
    }

    public List<WebElement> getBoxes() {// find elements!
        return  driver.findElements(By.cssSelector(".rct-node.rct-node-parent.rct-node-expanded"));
   }

    public WebElement getExpandAllBox() {
        return driver.findElement(By.cssSelector(".rct-option.rct-option-expand-all"));
    }

    public CheckBox_Page(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getHome() {
        return driver.findElement(By.className("rct-title"));
    }
    public void clickOnHomeBox () {
        getHome().click();
    }
    public WebElement getNotification() {
        return driver.findElement(By.id("result"));
    }
}
