package Tests;

import Utilities.ConfigReader;
import Utilities.LoginPage;
import org.testng.annotations.Test;

public class LoginTest_Singleton {
    LoginPage loginPage = new LoginPage();

    @Test
    public void loginTests1(){
        String username = ConfigReader.getProperty("username");
        String password = ConfigReader.getProperty("password");
        loginPage.login(username, password);
    }
}

