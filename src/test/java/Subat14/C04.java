package Subat14;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class C04 extends TestBase {
    @Test
     void test01() {
        driver.get("https://books-pwakit.appspot.com/");

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        WebElement searchTextBox = (WebElement) jse
                .executeScript("return document.querySelector(\"body > book-app\").shadowRoot.querySelector(\"#input\")");

        waitForSecond(4);

        searchTextBox.sendKeys("BU KADAR");
    }
}
