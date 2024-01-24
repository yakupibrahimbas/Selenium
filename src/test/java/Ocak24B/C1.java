package Ocak24B;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C1 {
    @Test
    public void test01() {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://google.com");
        String pageTitle=driver.getTitle();
        System.out.println(pageTitle);
        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);
        driver.get("https://techproeducation.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());


    }
}
