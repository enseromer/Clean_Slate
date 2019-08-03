package Tests;

import Utilities.BrowserFactory;
import Utilities.StringUtility;


import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class NavigationTests {




    public static void testChrome(){

        testCase("chrome");

    }

    public static void testFirefox(){
        testCase("firefox");


    }

    public static void testSafari(){

        testCase("safari");

    }

    public static void testCase(String s){

        WebDriver driver = BrowserFactory.getDriver(s);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("https://google.com");
        String t1 = driver.getTitle();

        driver.navigate().to("https://etsy.com");
        String t2 = driver.getTitle();

        driver.navigate().back();

        StringUtility.verifyEquals(t1, driver.getTitle());


        driver.navigate().forward();
        StringUtility.verifyEquals(t2, driver.getTitle());

        driver.close();

    }

    public static void main(String[] args) throws InterruptedException {



        System.out.println("Testing chrome browser");
        testChrome();
        Thread.sleep(3000);


        System.out.println("Testing safari browser");
        testSafari();
        Thread.sleep(3000);


        System.out.println("Testing Firefox browser");
        testFirefox();
        Thread.sleep(3000);

    }


}