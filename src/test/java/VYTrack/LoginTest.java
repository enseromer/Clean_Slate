package VYTrack;

import Utilities.SeleniumUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    private WebDriver driver;
    private String url = "http://qa2.vytrack.com/user/login";

    @BeforeClass
    public void beforeClass(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(url);
    }
    @Test (priority = 0)
    public void positiveLoginTest(){
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager230");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123", Keys.ENTER);
        SeleniumUtils.waitPlease(5);
        Assert.assertTrue(driver.findElement(By.partialLinkText("Esta Kuhic")).isDisplayed());
        Assert.assertEquals(driver.getTitle(), "Dashboard");
        SeleniumUtils.waitPlease(5);
        driver.findElement(By.partialLinkText("Diamond Ankunding")).click();
        driver.findElement(By.cssSelector("a[class='no-hash']")).click();
        SeleniumUtils.waitPlease(5);
        driver.findElement(By.id("prependedInput")).sendKeys("salesmanager293");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123", Keys.ENTER);
        SeleniumUtils.waitPlease(5);
        Assert.assertEquals(driver.getTitle(), "Dashboard");
        Assert.assertTrue(driver.findElement(By.partialLinkText("Whitney Dicki")).isDisplayed());
        SeleniumUtils.waitPlease(5);
        driver.findElement(By.partialLinkText("Whitney Dicki")).click();
        driver.findElement(By.cssSelector("a[class='no-hash']")).click();
        SeleniumUtils.waitPlease(5);
        driver.findElement(By.id("prependedInput")).sendKeys("user192");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123", Keys.ENTER);
        SeleniumUtils.waitPlease(5);
        Assert.assertEquals(driver.getTitle(), "Dashboard");
        Assert.assertTrue(driver.findElement(By.cssSelector("h1[class='oro-subtitle']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.partialLinkText("River Quitzon")).isDisplayed());
    }
    @Test (priority = 1)
    public void negativeLoginTest(){
        String expectedTitle = driver.getTitle();
        driver.findElement(By.id("prependedInput")).sendKeys("user192");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser");
        driver.findElement((By.id("_submit"))).click();
        SeleniumUtils.waitPlease(5);
        Assert.assertTrue(driver.findElement(By.cssSelector("div[class='alert alert-error']")).isDisplayed());
        String expectedMessage = "Invalid user name or password.";
        String actualMessage = driver.findElement(By.cssSelector("div[class='alert alert-error']")).getText();
        Assert.assertEquals(actualMessage, expectedMessage);
        Assert.assertEquals(driver.getTitle(),expectedTitle);
        Assert.assertEquals(driver.getCurrentUrl(),url);

    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}