package Ocak24B;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C2 {
    @Test
    public void test01() {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
        System.out.println("Amazon Sayfasinin Basligi" + driver.getTitle());
        String pageTitle=driver.getTitle();
        if (pageTitle.contains("Amazon")){
            System.out.println("Sayfa basligi Amazon iceriyor");
        }else {
            System.out.println("Sayfa basligi Amazon icermiyor");
        }
        System.out.println("Amazon sayfasinin Adresi = " + driver.getCurrentUrl());
        String urlAmazon=driver.getCurrentUrl();
        if (urlAmazon.contains("amazon")){
            System.out.println("Sayfa URL'si amazon iceriyor");
        }else {
            System.out.println("Sayfa URL'si amazon icermiyor");
        }
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());
        System.out.println("driver.getWindowHandles() = " + driver.getWindowHandles());
        String pageSource=driver.getPageSource();
        if (pageSource.contains("Gateway")){
            System.out.println("Sayfa kaynak kodlarinda Gateway iceriyor");
        }else {
            System.out.println("Sayfa kaynak kodlarinda Gateway icermiyor");
        }
        driver.quit();

    }
}
