package DEMOQA_TESTS;

import DEMOQA_BASE.Base;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.v85.backgroundservice.BackgroundService;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static java.awt.SystemColor.window;

public class WebTables_Test extends Base {


    @BeforeMethod
    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.get(excelReader.getStringData("URL", 1, 5));
    }

    @Test
    public void checkIfTableIsVisible() throws InterruptedException {
        Assert.assertTrue(webTables_page.getTabeleInfo().isDisplayed());
        // Dimension numberOfPeopleInTable1 = webTables_page.getTabeleInfo().getSize();
    }
        @Test
        public void insertDataIntoTable () throws InterruptedException {
            webTables_page.getAddToTable().click();
            Thread.sleep(5000);
           // webTables_page.getFirstName().click();
            String firstName = excelReader.getStringData("WEBTABLES", 1, 0);
            String lastName = excelReader.getStringData("WEBTABLES", 1, 1);
            String email = excelReader.getStringData("WEBTABLES", 1, 2);
            String age = excelReader.getStringData("WEBTABLES", 1, 3);
           // String salary = excelReader.getStringData("WEBTABLES", 1, 4); //zasto fail-uje?
            String department = excelReader.getStringData("WEBTABLES", 1, 5);
           Thread.sleep(3000);
            webTables_page.getRegistrationForm().get(0).sendKeys(firstName);
            webTables_page.getRegistrationForm().get(1).sendKeys(lastName);
            webTables_page.getRegistrationForm().get(2).sendKeys(email);
            webTables_page.getRegistrationForm().get(3).sendKeys(age);
            webTables_page.getRegistrationForm().get(4).sendKeys("10000");
            webTables_page.getRegistrationForm().get(5).sendKeys(department);
            webTables_page.getSubmitButton().click();
            Assert.assertTrue(webTables_page.getTamaraNikic().get(1).isDisplayed());
        }
        @Test
    public void editUser() {
            webTables_page.getEditUser1().click();
            webTables_page.getRegistrationForm().get(1).clear();
            webTables_page.getRegistrationForm().get(1).sendKeys("Smith");
            webTables_page.getSubmitButton().click();

        }
     @Test
     public void deleteUser() throws InterruptedException {
        insertDataIntoTable();
        Assert.assertTrue(webTables_page.getTamaraNikic().get(3).isDisplayed());
        webTables_page.getDeleteTamaraNikic().click();
        Assert.assertTrue(webTables_page.getTamaraNikic().get(3).getText().isBlank());
     }
   }

