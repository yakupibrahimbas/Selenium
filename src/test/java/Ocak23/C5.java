package Ocak23;

import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C5 {
    @Test
    public void test01() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://zero.webappsecurity.com");
        driver.findElement(By.cssSelector("button[type='button']")).click();
       WebElement userTextBox= driver.findElement(By.cssSelector("input[type='text']"));
       userTextBox.sendKeys("username", Keys.TAB,"password",Keys.ENTER);
       Thread.sleep(3000);
       driver.navigate().back();
       driver.findElement(By.cssSelector("#onlineBankingMenu")).click();
    }
}
