package Subat7;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C8 extends TestBase {
    /*
    1)Implicity wait
    2)Explicit wait
     */
    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//button")).click();
        FluentWait<WebDriver>wait=new FluentWait<>(driver);

        WebElement helloWorld=driver.findElement(By.xpath("//*[.='Hello World!']"));
        wait.withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofMillis(200)).withMessage("webelementi ve sureyi kontrol et").
                until(ExpectedConditions.visibilityOf(helloWorld));
        Assertions.assertEquals("Hello World!",helloWorld.getText());



    }

}
