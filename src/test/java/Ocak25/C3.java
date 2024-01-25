package Ocak25;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C3 {
    @Test
    public void test01() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com/");
        Thread.sleep(15000);
        WebElement searchBox=driver.findElement(By.xpath("//input[@type='text']"));
        searchBox.sendKeys("city bike"+ Keys.ENTER);
        WebElement aramaSonucu=driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        System.out.println("arama sonucu.getText()="+aramaSonucu.getText());
        System.out.println("saddece sonuc sayisi"+ aramaSonucu.getText().split(" ")[2]);
        driver.findElement(By.xpath("(//h2)[1]/a")).click();
        driver.quit();


    }
}
