package Ocak24C;

import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C7 {
    @Test
    public void test01() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://google.com");
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("selenium");
        searchBox.submit();
        Thread.sleep(3000);
        String actualTitle= driver.getTitle();
        String expectedTitle="selenium";
        Assertions.assertTrue(actualTitle.contains(expectedTitle));

        List<WebElement>links=driver.findElements(By.tagName("a"));
        System.out.println("link sayisi"+links.size());
        for (WebElement w:links){
            if (!w.getText().isEmpty()){
                System.out.println(w.getText());
            }

        }
        driver.close();


    }
}
