package Subat14;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class C03 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement usernameTextBox=driver.findElement(By.cssSelector("input[name='username']"));
        usernameTextBox.sendKeys("Admin");

        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@name='password']"));
        passwordTextBox.sendKeys("admin123");

        // Typecasting: Veri türünü başka bir türe dönüştürmek.
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        WebElement button = driver.findElement(By.tagName("button"));
        waitForSecond(5);

        jse.executeScript("arguments[0].style.backgroundColor = 'black';" , button);
        waitForSecond(5);

        jse.executeScript("arguments[0].style.backgroundColor = 'red';" , button);
        waitForSecond(5);
        jse.executeScript("arguments[0].click();", button);

    }
}
