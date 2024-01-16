package day02_driverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C01_Driver {

    public static void main(String[] args) {
        /*
        WebDriverManager sayesinde istedigimiz brovser icin setup yaparak otomasyonda kullanabiliriz
        Bu sayede browsera gore gerekli olan driveri bilgisayarimiza indirmek ve yapialndirmak zorunda kalmayiz
         */

        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver= new ChromeDriver();
        chromeDriver.get("https://google.com");
        chromeDriver.quit();

        WebDriverManager.edgedriver().setup();
        WebDriver edgeDriver=new EdgeDriver();
        edgeDriver.get("https://google.com");
        edgeDriver.quit();




    }
}
