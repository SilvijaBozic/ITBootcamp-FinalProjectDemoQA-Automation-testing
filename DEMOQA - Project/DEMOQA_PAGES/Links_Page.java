package DEMOQA_PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class Links_Page {

        WebDriver driver;
        WebDriverWait wdwait;

        WebElement Home;
        WebElement HomepFQGT;
        WebElement Created;
        WebElement NoContent;
        WebElement Moved;
        WebElement BadRequest;
        WebElement Unauthorized;
        WebElement Forbidden;
        WebElement NotFound;
        WebElement notificationForLinks;

        public Links_Page(WebDriver driver, WebDriverWait wdwait) {
                this.driver = driver;
                this.wdwait = wdwait;
        }

        public WebElement getHome() {
                return driver.findElement(By.id("simpleLink"));
        }

        public WebElement getHomepFQGT() {
                return driver.findElement(By.id("dynamicLink"));
        }

        public WebElement getCreated() {

                return driver.findElement(By.id("created"));
        }

        public WebElement getNoContent() {
                return driver.findElement(By.id("no-content"));
        }

        public WebElement getMoved() {
                return driver.findElement(By.id("moved"));
        }

        public WebElement getBadRequest() {
                return driver.findElement(By.id("bad-request"));
        }

        public WebElement getUnauthorized() {
                return driver.findElement(By.id("unauthorized"));
        }

        public WebElement getForbidden() {
                return driver.findElement(By.id("forbidden"));
        }

        public WebElement getNotFound() {
                return driver.findElement(By.id("invalid-url"));
        }

        public WebElement getNotificationForLinks() {
                return driver.findElement(By.id("linkResponse"));
        }
}
