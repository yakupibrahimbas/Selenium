package Ocak16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class P01_Driver {
    public static void main(String[] args) {
        /*
        Web Drivermanager sayesinde istedigimiz browser icin setup yaparak otomasyonda kullanabiliriz
        Bu sayede browsera gerekli olan deriveri bilgisayarimiza indirnek zorunda kalmayiz
         */

        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://google.com");
        chromeDriver.quit();

        WebDriverManager.edgedriver().setup();
        WebDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://google.com");
        edgeDriver.quit();

        WebDriverManager.firefoxdriver().setup();
        WebDriver fireFoxDriver = new FirefoxDriver();
        fireFoxDriver.get("https://google.com");
        fireFoxDriver.quit();

        WebDriverManager.safaridriver().setup();
        WebDriver safariDriver = new SafariDriver();
        safariDriver.get("https://google.com");
        safariDriver.quit();
        //apache maven bir yazilim proje yonetimi aracidir
        //maven gelistiricileri bircok ayrintidan korur
        //proje nesne modeli pom project object model konseptinbe dayalidir
        //maven bir java derleme aracidir(build tool)
        //maven proje otomasyon ve yonetim aracidir
        //maven konfigrasyon icin pom.xml dosyasini kullanir. bu dosya projenin insasi ,raporlamasi ve dokumantasyonu icin gerekli

    }
}
