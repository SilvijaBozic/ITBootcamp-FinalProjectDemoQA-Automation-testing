package DEMOQA_BASE;

import DEMOQA_PAGES.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class Base {
        public static WebDriver driver;
        public WebDriverWait wdwait;
        public Home_Page homePage;
        public Elements_Page elements_page;
        public ExcelReader excelReader;

        public String homeURL;
        public TextBox_Page textBox_page;
        public CheckBox_Page checkBox_page;
        public RadioButton_Page radioButton_page;
        public WebTables_Page webTables_page;

        public Links_Page links_page;
        public BrokenLinksAndImaged_Page brokenLinksAndImaged_page;

        public BrowserWindows_Page browserWindows_page;
        public Alerts_Page alerts_page;
        public Frames_Page frames_page;
        public Buttons_Page buttons_page;

        @BeforeClass
    public void setUp() throws IOException {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
            elements_page = new Elements_Page(driver, wdwait);
            homePage = new Home_Page(driver, wdwait);
            textBox_page = new TextBox_Page(driver, wdwait);
            checkBox_page = new CheckBox_Page(driver, wdwait);
            radioButton_page = new RadioButton_Page(driver,wdwait);
            webTables_page = new WebTables_Page(driver, wdwait);
            excelReader = new ExcelReader("C:\\Users\\Administrator\\Desktop\\DEMOQA.xlsx");
            homeURL = excelReader.getStringData("URL", 1, 0);
            links_page = new Links_Page(driver, wdwait);
            brokenLinksAndImaged_page = new BrokenLinksAndImaged_Page(driver, wdwait);
            browserWindows_page = new BrowserWindows_Page(driver, wdwait);
            alerts_page = new Alerts_Page(driver, wdwait);
            frames_page = new Frames_Page(driver, wdwait);
            buttons_page = new Buttons_Page(driver, wdwait);
            
            }


    /*@AfterClass
        public void TearDown(){
        driver.manage().deleteAllCookies();
        driver.quit();
        }*/
}
