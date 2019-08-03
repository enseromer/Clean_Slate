package VYTrack;


import Utilities.SeleniumUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

class Module{
    String moduleLocator, submoduleLocator, expectedTitle, expectedPageName, actualTitle, actualPageName;
}
public class MenuOptTest2 {

    private WebDriver driver;
    private String pageNameLocator = "[class='oro-subtitle']";

    @BeforeClass
    public void beforeClass(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://qa2.vytrack.com/user/login");
    }
    @Test
    public void testMenuOptionsDriver() {
        //login
        driver.findElement(By.id("prependedInput")).sendKeys("user192");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123", Keys.ENTER);
        SeleniumUtils.waitPlease(2);

        Module fleet = new Module();
        fleet.moduleLocator = "//span[@class='title title-level-1' and contains(text(),'Fleet')]";
        fleet.submoduleLocator = "//span[@class='title title-level-2' and contains(text(),'Vehicle')]";
        fleet.expectedTitle = "Car - Entities - System - Car - Entities - System";
        fleet.expectedPageName = "All Cars";

        Module customer = new Module();
        customer.moduleLocator = "//span[@class='title title-level-1' and contains(text(),'Customers')]";
        customer.submoduleLocator = "//span[@class='title title-level-2' and contains(text(),'Accounts')]";
        customer.expectedTitle = "Accounts - Customers";
        customer.expectedPageName = "Accounts";

        Module customer1 = new Module();
        customer1.moduleLocator = "//span[@class='title title-level-1' and contains(text(),'Customers')]";
        customer1.submoduleLocator = "//span[@class='title title-level-2' and contains(text(),'Contacts')]";
        customer1.expectedTitle = "Contacts - Customers";
        customer1.expectedPageName = "Contacts";

        Module activities = new Module();
        activities.moduleLocator = "//span[@class='title title-level-1' and contains(text(),'Activities')]";
        activities.submoduleLocator = "//span[@class='title title-level-2' and contains(text(),'Calendar Events')]";
        activities.expectedTitle = "Calendar Events - Activities";
        activities.expectedPageName = "Calendar Events";

        ArrayList<Module> modules = new ArrayList<Module>(Arrays.asList(fleet, customer, customer1, activities));

        SoftAssert softAssert = new SoftAssert();

        for(int i=0; i<modules.size(); i++){
            driver.findElement(By.xpath(modules.get(i).moduleLocator)).click();
            driver.findElement(By.xpath(modules.get(i).submoduleLocator)).click();
            SeleniumUtils.waitPlease(2);
            modules.get(i).actualTitle = driver.getTitle();
            modules.get(i).actualPageName = driver.findElement(By.cssSelector(pageNameLocator)).getText();
            SeleniumUtils.waitPlease(2);
            softAssert.assertEquals(modules.get(i).actualTitle, modules.get(i).expectedTitle);
            softAssert.assertEquals(modules.get(i).actualPageName, modules.get(i).expectedPageName);
        }
        softAssert.assertAll();
    }
    @Test
    public void testMenuOptionsStoreManager(){
        //log in
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager230");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123", Keys.ENTER);
        SeleniumUtils.waitPlease(3);

        SoftAssert softAssert = new SoftAssert();

        Module dashboard = new Module();
        dashboard.moduleLocator = "//span[@class='title title-level-1' and contains(text(),'Dashboards')]";
        dashboard.submoduleLocator = "//span[@class='title title-level-2' and contains(text(),'Dashboard')]";
        dashboard.expectedTitle = "Dashboard - Dashboards";
        dashboard.expectedPageName = "Dashboard";

        Module fleet = new Module();
        fleet.moduleLocator = "//span[@class='title title-level-1' and contains(text(),'Fleet')]";
        fleet.submoduleLocator = "//span[@class='title title-level-2' and contains(text(),'Vehicles')]";
        fleet.expectedTitle = "All - Car - Entities - System - Car - Entities - System";
        fleet.expectedPageName = "All Cars";

        Module customer = new Module();
        customer.moduleLocator = "//span[@class='title title-level-1' and contains(text(),'Customers')]";
        customer.submoduleLocator = "//span[@class='title title-level-2' and contains(text(),'Accounts')]";
        customer.expectedTitle = "All - Accounts - Customers";
        customer.expectedPageName = "All Accounts";

        Module customer1 = new Module();
        customer1.moduleLocator = "//span[@class='title title-level-1' and contains(text(),'Customers')]";
        customer1.submoduleLocator = "//span[@class='title title-level-2' and contains(text(),'Contacts')]";
        customer1.expectedTitle = "All - Contacts - Customers";
        customer1.expectedPageName = "All Contacts";

        Module sales = new Module();
        sales.moduleLocator = "//span[@class='title title-level-1' and contains(text(),'Sales')]";
        sales.submoduleLocator = "//span[@class='title title-level-2' and contains(text(),'Opportunities')]";
        sales.expectedTitle = "Open Opportunities - Opportunities - Sales";
        sales.expectedPageName = "Open Opportunities";

        Module activities = new Module();
        activities.moduleLocator = "//span[@class='title title-level-1' and contains(text(),'Activities')]";
        activities.submoduleLocator = "//span[@class='title title-level-2' and contains(text(),'Calls')]";
        activities.expectedTitle = "All - Calls - Activities";
        activities.expectedPageName = "All Calls";

        Module activities1 = new Module();
        activities1.moduleLocator = "//span[@class='title title-level-1' and contains(text(),'Activities')]";
        activities1.submoduleLocator = "//span[@class='title title-level-2' and contains(text(),'Calendar Events')]";
        activities1.expectedTitle = "Calendar Events - Activities";
        activities1.expectedPageName = "All Calendar Events";

        ArrayList<Module> modules = new ArrayList<Module>(Arrays.asList(dashboard, fleet, customer, customer1, sales, activities, activities1));
        for(int i=0; i<modules.size(); i++){
            driver.findElement(By.xpath(modules.get(i).moduleLocator)).click();
            driver.findElement(By.xpath(modules.get(i).submoduleLocator)).click();
            SeleniumUtils.waitPlease(2);
            modules.get(i).actualTitle = driver.getTitle();
            modules.get(i).actualPageName = driver.findElement(By.cssSelector(pageNameLocator)).getText();
            SeleniumUtils.waitPlease(2);
            softAssert.assertEquals(modules.get(i).actualTitle, modules.get(i).expectedTitle);
            softAssert.assertEquals(modules.get(i).actualPageName, modules.get(i).expectedPageName);
        }
        softAssert.assertAll();
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}