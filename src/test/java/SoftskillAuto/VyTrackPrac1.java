package SoftskillAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Basic Authentication
public class VyTrackPrac1 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver",
                "/Users/ansaerwumaier/Documents/Selenium Dependencies/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().fullscreen(); // for mac
        driver.manage().window().maximize(); // for windows
        driver.get("http://qa2.vytrack.com/user/login");




        WebElement inputUserName = driver.findElement(By.id("prependedInput"));
        // enter username
        inputUserName.sendKeys("user165");
        // password
        WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
        inputPassword.sendKeys("UserUser123");
        // locate the sign in button
        WebElement signInButton = driver.findElement(By.id("_submit"));
        System.out.println(driver.getTitle());
        signInButton.click();
        System.out.println(driver.getTitle());
        WebElement username = driver.findElement(By.name("dropdown"));
        String actualUserName = username.getText();
        System.out.println(actualUserName);
        if("user165".equals(actualUserName)){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("EXPECTED: user165");
            System.out.println("ActualUserName = " + actualUserName);
        }
        if(!driver.getTitle().contains(("Sign In"))){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println(driver.getTitle());
        }
    }
}