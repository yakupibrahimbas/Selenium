package Subat28;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C1 extends TestBase {
    @Test
    public void test01() {

            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.get("https://testpages.herokuapp.com/styled/calculator");
            driver.findElement(By.id("number1")).sendKeys("20");
            driver.findElement(By.id("number2")).sendKeys("15");
            driver.findElement(By.id("calculate")).click();
            String sonuc=driver.findElement(By.id("answer")).getText();
            System.out.println("Sonuc:"+sonuc);
            driver.quit();
    }
}
