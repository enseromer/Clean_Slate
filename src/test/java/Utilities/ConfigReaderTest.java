package Utilities;

import Utilities.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ConfigReaderTest {


    @Test
    public void test1(){
        String expected ="chrome";
        String actual = ConfigReader.getProperty("browser");
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void test2(){
        String expectedUserName = "storemanager85";
        String actualUserName = ConfigReader.getProperty("username");
        Assert.assertEquals(actualUserName, expectedUserName);
    }
}