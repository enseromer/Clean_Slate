package VYTrack;


import Utilities.SeleniumUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class MenuOptionsTest {

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

        //log in
        driver.findElement(By.id("prependedInput")).sendKeys("user192");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123", Keys.ENTER);
        SeleniumUtils.waitPlease(2);

        //Fleet - Vehicle
        driver.findElement(By.xpath("//span[@class='title title-level-1' and contains(text(),'Fleet')]")).click();
        driver.findElement(By.cssSelector("a[href='entity/Extend_Entity_Carreservation']")).click();
        SeleniumUtils.waitPlease(2);
        String expectedTitle1 = "Car - Entities - System - Car - Entities - System";
        String actualTitle1 = driver.getTitle();
        Assert.assertEquals(actualTitle1,expectedTitle1);
        String expectedPageName1 = "All Cars";
        String actualPageName1 = driver.findElement(By.cssSelector(pageNameLocator)).getText();
        Assert.assertEquals(actualPageName1, expectedPageName1);
        SeleniumUtils.waitPlease(2);

        //Customer - Accounts
        driver.findElement(By.xpath("//span[@class='title title-level-1' and contains(text(),'Customers')]")).click();
        driver.findElement(By.xpath("//span[@class='title title-level-2' and contains(text(),'Accounts')]")).click();
        SeleniumUtils.waitPlease(2);
        String expectedTitle2 = "Accounts - Customers";
        String actualTitle2 = driver.getTitle();
        Assert.assertEquals(actualTitle2,expectedTitle2);
        String expectedPageName2 = "Accounts";
        String actualPageName2 = driver.findElement(By.cssSelector(pageNameLocator)).getText();
        Assert.assertEquals(actualPageName2, expectedPageName2);
        SeleniumUtils.waitPlease(2);

        //Customer - Contacts
        driver.findElement(By.xpath("//span[@class='title title-level-1' and contains(text(),'Customers')]")).click();
        driver.findElement(By.xpath("//span[@class='title title-level-2' and contains(text(),'Contacts')]")).click();
        SeleniumUtils.waitPlease(2);
        String expectedTitle3 = "Contacts - Customers";
        String actualTitle3 = driver.getTitle();
        Assert.assertEquals(actualTitle3, expectedTitle3);
        String expectedPageName3 = "Contacts";
        String actualPageName3 = driver.findElement(By.cssSelector(pageNameLocator)).getText();
        Assert.assertEquals(actualPageName3, expectedPageName3);
        SeleniumUtils.waitPlease(2);

        //Activities - Calendar events
        driver.findElement(By.xpath("//span[@class='title title-level-1' and contains(text(),'Activities')]")).click();
        driver.findElement(By.xpath("//span[@class='title title-level-2' and contains(text(),'Calendar Events')]")).click();
        SeleniumUtils.waitPlease(2);
        String expectedTitle4 = "Calendar Events - Activities";
        String actualTitle4 = driver.getTitle();
        Assert.assertEquals(actualTitle4, expectedTitle4);
        String expectedPageName4 = "Calendar Events";
        String actualPageName4 = driver.findElement(By.cssSelector(pageNameLocator)).getText();
        Assert.assertEquals(actualPageName4, expectedPageName4);
        SeleniumUtils.waitPlease(2);
    }
    @Test
    public void testMenuOptionsStoreManager(){
        //log in
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager230");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123", Keys.ENTER);
        SeleniumUtils.waitPlease(3);

        //Dashboards - Dashboard
        driver.findElement(By.xpath("//span[@class='title title-level-1' and contains(text(),'Dashboards')]")).click();
        driver.findElement(By.xpath("//span[@class='title title-level-2' and contains(text(),'Dashboard')]")).click();
        SeleniumUtils.waitPlease(2);
        String expectedTitle1 = "Dashboard - Dashboards";
        String actualTitle1 = driver.getTitle();
        Assert.assertEquals(actualTitle1,expectedTitle1);
        String expectedPageName1 = "Dashboard";
        String actualPageName1 = driver.findElement(By.cssSelector(pageNameLocator)).getText();
        Assert.assertEquals(actualPageName1, expectedPageName1);
        SeleniumUtils.waitPlease(2);

        //Fleet - Vehicles
        driver.findElement(By.xpath("//span[@class='title title-level-1' and contains(text(),'Fleet')]")).click();
        driver.findElement(By.xpath("//span[@class='title title-level-2' and contains(text(),'Vehicles')]")).click();
        SeleniumUtils.waitPlease(2);
        String expectedTitle2 = "All - Car - Entities - System - Car - Entities - System";
        String actualTitle2 = driver.getTitle();
        Assert.assertEquals(actualTitle2,expectedTitle2);
        String expectedPageName2 = "All Cars";
        String actualPageName2 = driver.findElement(By.cssSelector(pageNameLocator)).getText();
        Assert.assertEquals(actualPageName2, expectedPageName2);
        SeleniumUtils.waitPlease(2);

        //Customer - Accounts
        driver.findElement(By.xpath("//span[@class='title title-level-1' and contains(text(),'Customers')]")).click();
        driver.findElement(By.xpath("//span[@class='title title-level-2' and contains(text(),'Accounts')]")).click();
        SeleniumUtils.waitPlease(2);
        String expectedTitle3 = "All - Accounts - Customers";
        String actualTitle3 = driver.getTitle();
        Assert.assertEquals(actualTitle3,expectedTitle3);
        String expectedPageName3 = "All Accounts";
        String actualPageName3 = driver.findElement(By.cssSelector(pageNameLocator)).getText();
        Assert.assertEquals(actualPageName3, expectedPageName3);
        SeleniumUtils.waitPlease(2);

        //Customer - Contacts
        driver.findElement(By.xpath("//span[@class='title title-level-1' and contains(text(),'Customers')]")).click();
        driver.findElement(By.xpath("//span[@class='title title-level-2' and contains(text(),'Contacts')]")).click();
        SeleniumUtils.waitPlease(2);
        String expectedTitle4 = "All - Contacts - Customers";
        String actualTitle4 = driver.getTitle();
        Assert.assertEquals(actualTitle4, expectedTitle4);
        String expectedPageName4 = "All Contacts";
        String actualPageName4 = driver.findElement(By.cssSelector(pageNameLocator)).getText();
        Assert.assertEquals(actualPageName4, expectedPageName4);
        SeleniumUtils.waitPlease(2);

        //Sales - Opportunities
        driver.findElement(By.xpath("//span[@class='title title-level-1' and contains(text(),'Sales')]")).click();
        driver.findElement(By.xpath("//span[@class='title title-level-2' and contains(text(),'Opportunities')]")).click();
        SeleniumUtils.waitPlease(2);
        String expectedTitle5 = "Open Opportunities - Opportunities - Sales";
        String actualTitle5 = driver.getTitle();
        Assert.assertEquals(actualTitle5, expectedTitle5);
        String expectedPageName5 = "Open Opportunities";
        String actualPageName5 = driver.findElement(By.cssSelector(pageNameLocator)).getText();
        Assert.assertEquals(actualPageName5, expectedPageName5);
        SeleniumUtils.waitPlease(2);

        //Activities - Calls
        driver.findElement(By.xpath("//span[@class='title title-level-1' and contains(text(),'Activities')]")).click();
        driver.findElement(By.xpath("//span[@class='title title-level-2' and contains(text(),'Calls')]")).click();
        SeleniumUtils.waitPlease(2);
        String expectedTitle6 = "All - Calls - Activities";
        String actualTitle6 = driver.getTitle();
        Assert.assertEquals(actualTitle6, expectedTitle6);
        String expectedPageName6 = "All Calls";
        String actualPageName6 = driver.findElement(By.cssSelector(pageNameLocator)).getText();
        Assert.assertEquals(actualPageName6, expectedPageName6);
        SeleniumUtils.waitPlease(2);

        //Activities - Calendar events
        driver.findElement(By.xpath("//span[@class='title title-level-1' and contains(text(),'Activities')]")).click();
        driver.findElement(By.xpath("//span[@class='title title-level-2' and contains(text(),'Calendar Events')]")).click();
        SeleniumUtils.waitPlease(2);
        String expectedTitle7 = "Calendar Events - Activities";
        String actualTitle7 = driver.getTitle();
        Assert.assertEquals(actualTitle7, expectedTitle7);
        String expectedPageName7 = "All Calendar Events";
        String actualPageName7 = driver.findElement(By.cssSelector(pageNameLocator)).getText();
        Assert.assertEquals(actualPageName7, expectedPageName7);
        SeleniumUtils.waitPlease(2);

    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}