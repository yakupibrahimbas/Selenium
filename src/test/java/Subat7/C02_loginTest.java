package Subat7;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C02_loginTest extends TestBase {

    @Test
    void test01() {

        driver.get("https://www.trvlcar.com/");
        Assertions.assertEquals("https://www.trvlcar.com/", driver.getCurrentUrl(), "Sayfa Testi Failed");
        Assertions.assertEquals("TrvlCar | Premium Car Rental",driver.getTitle(), "Sayfa Testi Failed");

        // Login Register Button
        WebElement loginRegisterButton = driver.findElement(By.xpath("//a[@href='/auth']"));
        loginRegisterButton.click();

        // Email
        WebElement loginEmailTextBox = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
        loginEmailTextBox.sendKeys("alican@ali.com");

        // Password
        WebElement loginPasswordTextBox = driver.findElement(By.xpath("(//input[@name='password'])[1]"));
        loginPasswordTextBox.sendKeys("Deneme1?");

        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

        String userName = driver.findElement(By.cssSelector(".dropdown-toggle.nav-link")).getText();
        System.out.println(userName);

        Assertions.assertEquals("Brittany Simonis", userName, "HATA VAR");
    }
}
