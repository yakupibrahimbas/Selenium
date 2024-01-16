package Ocak16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_Driver {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://ibm.com");
        String googleBaslik=driver.getTitle();
        System.out.println("googleBaslik = " + googleBaslik);
       if (googleBaslik.contains("Amazon")){
           System.out.println("Test Passed");
       }else {
           System.out.println("Test failed");
       }
       String actualUrl=driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);
        if (actualUrl.contains("Amazon")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test failed");
        }
        String amazonHandleDegeri=driver.getWindowHandle();
        System.out.println("amazonHandleDegeri = " + amazonHandleDegeri);
        if (driver.getPageSource().contains("Gateway")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test failed");
        }

    }
}
