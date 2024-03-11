package Subat28;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C10 extends TestBase {
    @Test
    public void Test01() {
        /*
        Yeni bir class olusturalim (Homework)
        ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “Facebook” icerdigini dogrulayin (verify), degilse dogru basligi yazdirin.
        Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i  yazdirin.
        https://www.walmart.com/ sayfasina gidin.
        Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        Tekrar “facebook” sayfasina donun
        Sayfayi yenileyin
        sayfayi tam sayfa (maximize) yapin  
        Sayfayi kapatin
         */


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.facebook.com");
        if (driver.getTitle().contains("Facebook")){
            System.out.println("Sayfa basligi 'Facebook' kelimesini iceriyor");
        }else {
            System.out.println("Sayfa basligi 'Facebook' kelimesini icermiyor");
        }

        if (driver.getCurrentUrl().contains("facebook")){
            System.out.println("Sayfa URL'si facebook iceriyor");
        }else {
            System.out.println(driver.getCurrentUrl());
        }
        driver.get("https://www.walmart.com/");
        if (driver.getTitle().contains("Walmart.com")){
            System.out.println("Sayfa basligi 'Walmart.com' iceriyor");
        }else {
            System.out.println("Sayfa basligi 'Walmart.com' icermiyor");
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.quit();
    }
}
