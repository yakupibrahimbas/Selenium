package Subat14;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class C6 extends TestBase {
    @Test
    void test() {

        driver.get("https://www.facebook.com/");

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("document.getElementById('email').value='deneme@abc.com';");
        jse.executeScript("document.getElementById('pass').value='123456';");

        waitForSecond(5);
    }
}
