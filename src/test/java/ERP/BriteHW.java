package ERP;

import Utilities.SeleniumUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class BriteHW {
    @Test(priority=3)
    public void moduleCRM() throws IOException {
//        BreetAPPUtils.navigateToModule1(driver, "CRM");
//        SeleniumUtils.waitPlease(4);
//        driver.findElement(By.xpath(CreateButton2)).click();
//        SeleniumUtils.waitPlease(4);
//        driver.findElement(By.xpath(Opportunity)).sendKeys("Admin2");
//        SeleniumUtils.waitPlease(4);
//        //here it is successfully sending keys.
//        driver.findElement(By.xpath(Customer)).sendKeys("Admin3", Keys.ENTER);
//        //but cannot click the create edit button.
//        SeleniumUtils.waitPlease(4);
//        //  driver.findElement(By.xpath("//input[@class='o_input']")).sendKeys("Admin2", Keys.ESCAPE);
//        // driver.findElement(By.xpath(CreateButton4)).click();
//        driver.findElement(By.xpath(ExpectedRevenue)).clear();
//        driver.findElement(By.xpath(ExpectedRevenue)).sendKeys("24");
//        SeleniumUtils.waitPlease(4);
//
//        Actions a = new Actions(driver);
//        a.moveToElement(driver.findElement(By.xpath(Priority))).perform();//here finding the box
//        SeleniumUtils.waitPlease(4);//
//        a.moveToElement(driver.findElement(By.xpath(Priority))).click().perform();
//        SeleniumUtils.waitPlease(3);
//        driver.findElement(By.xpath("//td[@style]/div[@class='o_priority o_field_widget']/a[@title='Very High']")).click();
//        //  driver.findElement(By.xpath(Priority)).click();
//        //(//td[@style]//div[@class='o_priority o_field_widget']//a)[1]->it is for 1 star
//        //(//td[@style]//div[@class='o_priority o_field_widget']//a)[2]->2 star icin
//        //(//td[@style]//div[@class='o_priority o_field_widget']//a)[3]->buda 3 star icin
//        SeleniumUtils.waitPlease(4);
//        driver.findElement(By.xpath(CreateButton3)).click();
//
////        Alert alert = driver.switchTo().alert();
//// // Capturing alert message.
////        String alertMessage= driver.switchTo().alert().getText();
////
////        // Displaying alert message
////        System.out.println(alertMessage);
////        Thread.sleep(5000);
////
////        // Accepting alert
////        alert.accept();
//
//        Actions act=new Actions(driver);
//        act.moveToElement(driver.findElement(By.xpath("(//div[@class='oe_kanban_color_0 oe_kanban_global_click o_kanban_record ui-sortable-handle'])[1]"))).perform();//searching for the box
//        act.moveToElement(driver.findElement(By.xpath("(//div[@class='oe_kanban_color_0 oe_kanban_global_click o_kanban_record ui-sortable-handle'])[1]"))).perform();//hoverover the box
//        SeleniumUtils.waitPlease(4);
//        driver.findElement(By.xpath("(//div[@class='o_dropdown_kanban dropdown'])[1]")).click();//click on box
//        SeleniumUtils.waitPlease(4);
//        driver.findElement(By.xpath("(//a[@class=' oe_kanban_action oe_kanban_action_a'])[2]")).click();//find the delete button and click on it
//        SeleniumUtils.waitPlease(4);
//        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();//click on ok button
////
//        //2.nd way
//        SeleniumUtils.waitPlease(4);
//        driver.findElement(By.xpath(ListButtonLocator)).click();
//        SeleniumUtils.waitPlease(2);
//        driver.findElement(By.xpath(pipelineLocator));
//        SeleniumUtils.waitPlease(3);
//        String beforeNumStr = driver.findElement(By.xpath(beforeDeleteLocator)).getText();
//        System.out.println(beforeNumStr);
//        driver.findElement(By.xpath(vendorBottonLocator)).click();
//        SeleniumUtils.waitPlease(2);
//        driver.findElement(By.xpath(ActionButtonLocator)).click();
//        SeleniumUtils.waitPlease(2);
//        driver.findElement(By.xpath(DeleteButtonLocator)).click();
//        SeleniumUtils.waitPlease(3);
//        driver.findElement(By.xpath(okButtonLocator)).click();
//        SeleniumUtils.waitPlease(2);
//        String afterNumStr = driver.findElement(By.xpath(afterDeleteNumberLocator)).getText();
//        //print out the number string
//        System.out.println(afterNumStr);
//        //change the string to the Integer
//        int beforeNum=Integer.parseInt(beforeNumStr);//here converting String to primitive int
//        int afterNum=Integer.parseInt(afterNumStr);
//        // and check the number before delete and after delet, if the number before delete is bigger then the number
//        //after delete , your delete action is successful.
//        Assert.assertTrue(beforeNum>afterNum);
//
//        driver.get("http://34.220.250.213/web#view_type=list&model=crm.lead&menu_id=261&action=366");
//        SeleniumUtils.waitPlease(2);
//        //here I am using TakescreenShot interface and casting in order to use webdriver interface
//        //why screenshot: It helps me to understand the flow of application wjeter the program is working smootly or not
//        //it halps most of the time when we work cross browser testing
//        TakesScreenshot file=(TakesScreenshot)driver;
//        //here sending the screenshot
//        File source= file.getScreenshotAs(OutputType.FILE);
//        //Here I want to store it
//        String Event="Test3";
//        //here sending link and file name and show the address where to store it.
//        FileUtils.copyFile(source, new File("/Users/emraypala/IdeaProjects/TestSeleniumAutomation/src/test/java/Homeworks/" + Event + ".jpg"));
//
//
//
//
//    }
//
//
//
//
//    @AfterMethod//yeri onemli degil burda veya en sonda olabilir
//    public void teardown(){
//        driver.quit();
    }

}

