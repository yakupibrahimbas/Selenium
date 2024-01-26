package Ocak26;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03 {
    WebDriver driver;
    @BeforeEach
    public void setUp() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        Thread.sleep(3000);
       WebElement female= driver.findElement(By.xpath("//input[@value='1']"));
       WebElement male= driver.findElement(By.xpath("//input[@value='2']"));
       if (!male.isSelected()){
           male.click();
       }

    }

    @AfterEach
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
    }
}
