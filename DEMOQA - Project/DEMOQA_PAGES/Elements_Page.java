package DEMOQA_PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Elements_Page {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement TextBox;
    WebElement CheckBox;
    WebElement RadioButton;
    WebElement WebTables;
    WebElement Button;
    WebElement Links;
    WebElement BrokenLinkesImages;
    WebElement UploadDownload;
    WebElement DynamicProperties;
    WebElement DynamicPropertiesDisplayed;



    public Elements_Page(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getTextBox() {
        return driver.findElement(By.id("item-0"));
    }
    public void clickOnTextBox(){
    getTextBox().click();
    }

    public WebElement getCheckBox() {
        return driver.findElement(By.id("item-1"));
    }
    public void clickOnCheckBox(){
        getCheckBox().click();
    }

    public WebElement getRadioButton() {
        return driver.findElement(By.id("item-2"));
    }
    public void clickOnRadioButton(){
        getRadioButton().click();
    }

    public WebElement getWebTables() {
        return driver.findElement(By.id("item-3"));
    }
    public void clickOnWebTables(){
        getWebTables().click();
    }

    public WebElement getButton() {
        return driver.findElement(By.id("item-4"));
    }
    public void clickOnButton(){
        getButton().click();
    }

    public WebElement getLinks() {
        return driver.findElement(By.id("item-5"));
    }
    public void clickOnLinks(){
        getLinks().click();
    }

    public WebElement getBrokenLinkesImages() {
        return driver.findElement(By.id("item-6"));
    }
    public void clickOnBrokenLinkesImages(){
        getBrokenLinkesImages().click();
    }

    public WebElement getUploadDownload() {
        return driver.findElement(By.id("item-7"));
    }
    public void clickOnUploadDownload(){
        getUploadDownload().click();
    }

    public WebElement getDynamicProperties() {
        return driver.findElement(By.id("item-8"));
    }
    public void clickOnDynamicProperties(){
        getDynamicProperties().click();
    }
    public WebElement getDynamicPropertiesDisplayed() {
        return driver.findElement(By.cssSelector(".col-12.mt-4.col-md-6"));
    }


}
