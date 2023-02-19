package DEMOQA_PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
public class TextBox_Page {

    WebDriver driver;
    WebDriverWait wdwait;

    WebElement fullName;
    WebElement emailAddress;
    WebElement currentAddress;
    WebElement permanentAddress;
    WebElement submitButton;

     List<WebElement> cards;
     WebElement textBoxInfo;

    public WebElement getTextBoxInfo() {
        return driver.findElement(By.cssSelector(".mt-4.row"));
    }

    public List<WebElement> getCards() {
        return driver.findElements(By.cssSelector(".mr-sm-2.form-control"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getFullName() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmailAddress() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public TextBox_Page(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public void insertFullName (String fullName){
        getFullName().clear();
        getFullName().sendKeys(fullName);
    }
    public void insertEmailAddress(String emailAddress) {
            getEmailAddress().clear();
            getEmailAddress().sendKeys(emailAddress);
        }

    public void insertCurrentAddress(String currentAddress){
        getCurrentAddress().clear();
        getCurrentAddress().sendKeys(currentAddress);
    }
    public void insertPermanentAddress(String permanentAddress){
        getPermanentAddress().clear();
        getPermanentAddress().sendKeys(permanentAddress);
    }
    public void clickOnSubmitButton(){
        getSubmitButton().click();
    }
}
