package Ocak22;

import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_XPath {
    @Test
    public void test01() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
        Thread.sleep(10000);

        WebElement searchBox=driver.findElement(By.xpath("//input[@type='text']"));
        searchBox.sendKeys("city bike"+ Keys.ENTER);
        WebElement aramaSonucu= driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        System.out.println("aramaSonucu.getText() = " + aramaSonucu.getText());
        System.out.println("aramaSonucu.getText().split(\" \")[2] = " + aramaSonucu.getText().split(" ")[2]);
        driver.findElement(By.xpath("(//h2)[1]/a")).click();
        driver.quit();


    }
}
