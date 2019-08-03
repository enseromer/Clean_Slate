package OfficeHourNotes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//  import static com.cybertek.OfficeHours.library.*;
public class MethodLib {
    public static void main(){

       //its one of my beginning automation scripts. it'll open an app page and auto input user credewntial and run a test case
        //i need to create the other script where itll run a "truck driver" credential and see if all their capabilities are accessible

            main( new String[]{"A"} );

        }

        public static void main( String[] args )  {

            //   System.setProperty("Webdrivername","path");

            WebDriverManager.chromedriver().setup();   // sets System properties

            WebDriver driver = new ChromeDriver();  // opens the browser
            // webdriver is an interface implemnted by chromedriver class


            driver.get("http://www.google.com");  // protocol must be provided
            // http : hypertext transfer protocol
            // https:  hypertext transfer protocol secure

            String  PageTitle = driver.getTitle();


            // expected condition: titile should contain "Google"


// verify title
            if(PageTitle.contains("Amazon")){

                System.out.println("Page titile is verified");

            } else{

                System.err.println("Page title is not verified");
                System.exit(0);
            }

            // Assert.assertrue(condition);


            // new Actions(driver).pause(3000).perform();
//        try {
//            Thread.sleep(3000);    // Checked exceptions needs to be handled immidietly. because they occure during compile time
//        } catch (Exception e){
//
//        }

            Library.sleep(1);

// manage window:

            // maximize window:
            driver.manage().window().maximize();

            Library.sleep(1 );

            // fullscreen:
            driver.manage().window().fullscreen();


            Library.sleep(1 );


            //   driver.manage().window().setSize( new Dimension(6,7));


            // Navigate: refresh, go back, go forward, open URL.

            // refresh():
            driver.navigate().refresh();
            Library.sleep(0.5 );

            // goback:
            driver.navigate().back();
            Library.sleep(1 );

            // forward:
            driver.navigate().forward();
            Library.sleep(1 );

            driver.navigate().to("https://www.amazon.com");
            Library.sleep(1 );

            String PageURL =  driver.getCurrentUrl();

            // excepted: URL should contain "www.amazon.com"

            if(!PageURL.contains("www.amazon.com")){
                System.out.println("URL is verified");
            } else{
                System.err.println("URL is not verified");
                System.exit(0);
            }




        /*
            differences between navigate().to()  and get():
                        get() wait for webpage fully uploaded.
                        nevigate.to() does not have to wait (faster)

         */

            driver.navigate().back();


            System.out.println("Test completed");

            //   driver.close();
            driver.quit();


          /*
                differences between quite() and close();
                            close(): closes the one single tab.
                            quite(): closes the entire tabs and browser

           */




            //      method1();  // throws

            method2();   // try& catch


        }


        public static void method1() throws  Exception{


            Thread.sleep(1000);

        }

        public static void method2() {


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }


        }



    }