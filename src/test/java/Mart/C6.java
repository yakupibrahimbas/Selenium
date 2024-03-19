package Mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C6 {
    @Test
    public void test01() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        WebElement nyc = driver.findElement(By.id("pid3_thumb"));
        WebElement byArea = driver.findElement(By.id("pid8_thumb"));
        WebElement berlin = driver.findElement(with(By.tagName("img")).below(nyc).toLeftOf(byArea));
        String actualIDValue = berlin.getAttribute("id");
        String expectedIDvalue = "pid7_thumb";
        Assertions.assertEquals(expectedIDvalue, actualIDValue);
        driver.quit();
    }
}