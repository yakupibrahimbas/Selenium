package Ocak16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02_Driver {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        String googleTitle = driver.getTitle();
        System.out.println("googleTitle = " + googleTitle);

        String actuaGooglelUrl = driver.getCurrentUrl();
        System.out.println("actuaGooglelUrl = " + actuaGooglelUrl);

        driver.get("https://ibm.com");
        String actualGetTitle = driver.getTitle();
        System.out.println("actualGetTitle = " + actualGetTitle);

        String currentIbmUrl=driver.getCurrentUrl();
        System.out.println("currentIbmUrl = " + currentIbmUrl);



    }
}
