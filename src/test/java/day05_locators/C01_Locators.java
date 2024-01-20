package day05_locators;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    //Google sayfasına gidiniz
    @Test
    public void test01() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://google.com");

        //Arama kutusunu locate ediniz ve java yazdırıp aratınız
       WebElement searchBox=driver.findElement(By.id("APjFqb"));//Eger bir web elementi tekrar kullanacaksak bir web elemente assign edebiliriz.
        searchBox.sendKeys("Java");
        searchBox.submit();
        Thread.sleep(3000);
      //  driver.findElement(By.id("APjFqb")).sendKeys("Java", Keys.ENTER);

        //sayfayı kapatınız
        driver.quit();

    }
}
