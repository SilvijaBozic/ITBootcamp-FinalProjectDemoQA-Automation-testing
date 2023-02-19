package DEMOQA_PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WebTables_Page {
    WebDriver driver;
    WebDriverWait wdwait;

    WebElement tabeleInfo;

    WebElement addToTable;

    WebElement FirstName;
    WebElement LastName;
    WebElement Email;
    WebElement Age;
    WebElement Salary;
    WebElement Department;

    WebElement submitButton;

    WebElement deleteUser;
    WebElement editUser;

    WebElement TamaraNikic;

    List<WebElement> RegistrationForm;

    public List<WebElement> getRegistrationForm() {
        return driver.findElements(By.cssSelector(".mr-sm-2.form-control"));
    }

    public List<WebElement> getTamaraNikic() {
        return driver.findElements(By.className("rt-tr-group"));
    }

    public WebElement getDeleteTamaraNikic() {
        return driver.findElement(By.id("delete-record-4"));
    }

    public WebElement getEditUser1() {
        return driver.findElement(By.id("edit-record-2"));
    }

    public WebTables_Page(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }
    public WebElement getAddToTable() {
        return driver.findElement(By.id("addNewRecordButton"));
    }
    public WebElement getTabeleInfo() {
        return driver.findElement(By.className("rt-tbody"));
    }
}
