package Ocak23;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C2 {
    WebDriver driver;
    @BeforeEach
    void setUp() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test01() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkBox1=driver.findElement(By.xpath("//input[@type='checkbox']"));
        WebElement checkBox2=driver.findElement(By.xpath("//input[@type='checkbox']"));

        Thread.sleep(3000);

        if (!checkBox1.isSelected()){
            checkBox2.click();
        }
    }

    @AfterEach
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
