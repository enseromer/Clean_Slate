package Tests;

import Utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class RadioButtons {
    static WebDriver dr = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {
        browse();

        System.out.println(dr.findElement(By.id("blue")).isSelected()?"Passed": " Failed");
        dr.quit();
        System.exit(0);
    }
    public static void browse(){
        dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        dr.get("http://practice.cybertekschool.com/radio_buttons");
        dr.manage().window().maximize();
    }

}