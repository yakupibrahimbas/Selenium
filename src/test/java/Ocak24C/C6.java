package Ocak24C;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C6 {
 /*   @Test
    public void test01() throws InterruptedException {

        driver.findElement(By.id("APjFqb")).sendKeys("Java");
        driver.findElement(By.id("APjFqb")).submit();
*/

    @Test
    public void test02() {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://google.com");
        WebElement searchBox=driver.findElement(By.id("APjFqb"));
        searchBox.sendKeys("java", Keys.ENTER);


    }
}
