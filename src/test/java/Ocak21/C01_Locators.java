package Ocak21;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    @Test
    public void test01() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://google.com");
        WebElement searchBox=driver.findElement(By.id("APjFqb"));
       // searchBox.sendKeys("java");
        driver.findElement(By.id("APjFqb")).sendKeys("java", Keys.ENTER);
      // searchBox.submit();
        Thread.sleep(3000);
        //submit methodu, keys.enter ile enter yapilabiliyor
        driver.close();
    }
}
