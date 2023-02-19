package DEMOQA_PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Home_Page {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement clickOnElement;
    WebElement alerts;
    WebElement widgets;
    WebElement interactions;
    List<WebElement> cards;

    public Home_Page(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
    public List<WebElement> getCards() {
        return driver.findElements(By.className("card-body"));
    }
   /* public void clickOnCard(String cardName) {
        for (int i = 0; i < getCards().size(); i++) {
            if (getCards().get(i).getText().equals(cardName)) {
                getCards().get(i).click();
                break;
            }
        }
    }*/
    public void clickOnElements() {
        for (int i = 0; i < getCards().size(); i++) {
            if (getCards().get(i).getText().equals("Elements")) {
                getCards().get(i).click();
                break;
            }
        }
    }

    public void clickOnForms() {
        for (int i = 0; i < getCards().size(); i++) {
            if (getCards().get(i).getText().equals("Forms")) {
                getCards().get(i).click();
                break;
            }
        }
    }

    public void clickOnAlerts() {
        for (int i = 0; i < getCards().size(); i++) {
            if (getCards().get(i).getText().equals("Alerts, Frame & Windows")) {
                getCards().get(i).click();
                break;
            }
        }
    }

    public void clickOnWidgets() {
        for (int i = 0; i < getCards().size(); i++) {
            if (getCards().get(i).getText().equals("Widgets")) {
                getCards().get(i).click();
                break;
            }
        }
    }

    public void clickOnInteractions() {
        for (int i = 0; i < getCards().size(); i++) {
            if (getCards().get(i).getText().equals("Interactions")) {
                getCards().get(i).click();
                break;
            }
        }
    }

    public void clickOnBookstore() {
        for (int i = 0; i < getCards().size(); i++) {
            if (getCards().get(i).getText().equals("Book Store Application")) {

                getCards().get(i).click();
                break;
            }
        }
    }
}
