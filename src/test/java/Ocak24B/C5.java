package Ocak24B;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C5 {
    @Test
    public void test01() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.techproeducation.com");
        String pageTitle = driver.getTitle();
        if (pageTitle.contains("TechPro Education")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        driver.get("https://facebook.com");
        if (pageTitle.contains("Facebook")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");

        }

        driver.navigate().back();
        driver.quit();
    }
}