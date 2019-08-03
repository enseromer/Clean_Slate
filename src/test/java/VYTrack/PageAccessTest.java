package VYTrack;


import Utilities.SeleniumUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PageAccessTest {

    WebDriver driver;
    //String InvalidMessageLocator = "//div[@class='message'][contains(text(), 'You')]";

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://qa2.vytrack.com/user/login");

    }


    @Test(priority = 1, description = "Vehicle contracts test store manager")
    public void b(){
        driver.findElement(By.xpath("//input[@name='_username']")).sendKeys("storemanager230");
        driver.findElement(By.xpath("//input[@name='_password']")).sendKeys("UserUser123");
        SeleniumUtils.waitPlease(4);
        driver.findElement(By.xpath("//button[@name='_submit']")).click();
        SeleniumUtils.waitPlease(4);

        driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]")).click();
        SeleniumUtils.waitPlease(6);
        driver.findElement(By.linkText("Vehicle Contracts")).click();
        SeleniumUtils.waitPlease(6);

    }


    @Test(priority = 2, description = "Vehicle contracts test sales manager")
    public void a(){
        driver.findElement(By.xpath("//input[@name='_username']")).sendKeys("salesmanager293");
        driver.findElement(By.xpath("//input[@name='_password']")).sendKeys("UserUser123");
        SeleniumUtils.waitPlease(4);
        driver.findElement(By.xpath("//button[@name='_submit']")).click();
        SeleniumUtils.waitPlease(4);

        driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]")).click();
        SeleniumUtils.waitPlease(6);
        driver.findElement(By.linkText("Vehicle Contracts")).click();
        SeleniumUtils.waitPlease(6);

    }


    @Test(priority = 3, description = "Vehicle contracts test driver")
    public void d(){
        driver.findElement(By.xpath("//input[@name='_username']")).sendKeys("user192");
        driver.findElement(By.xpath("//input[@name='_password']")).sendKeys("UserUser123");
        SeleniumUtils.waitPlease(4);
        driver.findElement(By.xpath("//button[@name='_submit']")).click();
        SeleniumUtils.waitPlease(4);
        driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]")).click();
        SeleniumUtils.waitPlease(4);
        driver.findElement(By.linkText("Vehicle Contracts")).click();
        SeleniumUtils.waitPlease(6);

        String expectedMessage = "You do not have permission to perform this action.";
        String actualMessage = driver.findElement(By.xpath("//div[@class= 'message'][contains(text(), 'You')]")).getText();
        Assert.assertEquals(actualMessage, expectedMessage);
        SeleniumUtils.waitPlease(4);

    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }

}
