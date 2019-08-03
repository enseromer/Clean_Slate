package ERP;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TwoUserStories {

    WebDriver driver;
    String usernameLoginLocator = "login";
    String passwordLoginLocator = "password";



    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://34.220.250.213/web/login");

    }

    @Test
    public void test1_DeliveryReceiptsShouldHaveTotalRetailValueOfProducts(){
        driver.findElement(By.id(usernameLoginLocator)).sendKeys("inm6@info.com");
        driver.findElement(By.id(passwordLoginLocator)).sendKeys("trt332qWW13");
        driver.findElement(By.id(passwordLoginLocator)).submit();
        String expectedTitle = "Odoo";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        driver.findElement(By.xpath("//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[9]/a/span")).click();
        String expectedTitle1= "Odoo";
        String actualTitle1 = driver.getTitle();
        Assert.assertEquals(actualTitle1,expectedTitle1);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[1]/td[2]")).click();
        String expectedTotal= "$ 750.00";
        String actualTotal=driver.findElement(By.name("amount_total")).getText();
        Assert.assertEquals(actualTotal, expectedTotal);

    }

    @Test
    public void test2_managerShouldBeAbleToAccessCalender(){
        driver.findElement(By.id(usernameLoginLocator)).sendKeys("in_manager@info.com");
        driver.findElement(By.id(passwordLoginLocator)).sendKeys("Wdf4ssa44");
        driver.findElement(By.id(passwordLoginLocator)).submit();
        String expectedTitle = "Odoo";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        driver.findElement(By.className("oe_menu_text")).click();
        String expectedURL ="http://34.220.250.213/web?";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL,expectedURL);
        driver.findElement(By.className("oe_topbar_name")).click();
        driver.findElement(By.xpath("//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[2]/li/ul/li[6]/a")).click();
        String expectedFinalURL="http://34.220.250.213/web/login";
        String actualFinalURL=driver.getCurrentUrl();
        Assert.assertEquals(actualFinalURL, expectedFinalURL);

    }



    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}