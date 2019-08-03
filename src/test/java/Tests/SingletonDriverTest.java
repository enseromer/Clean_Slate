package Tests;

import Utilities.Driver;
import Utilities.SeleniumUtils;
import org.testng.annotations.Test;

public class SingletonDriverTest {
    @Test
    public void test1(){
        Driver.getDriver().get("http://google.com");
        SeleniumUtils.waitPlease(2);
        Driver.closeDriver();//to completely shutdown driver
    }
}