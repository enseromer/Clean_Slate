package Tests;
import Utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatePracID {




    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) throws Exception{
        test1();
    }

    public static void test1() throws Exception{
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/login");
        driver.findElement(By.id("woodenspoon")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}