package Subat14;

import com.google.j2objc.annotations.Weak;
import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class C05 extends TestBase {
    @Test
     void test01() {
        driver.get("https://shop.polymer-project.org/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement loginButton = (WebElement) jse.executeScript("return document.querySelector(\"body > shop-app\")." +
                "shadowRoot.querySelector(\"iron-pages > shop-home\")." +
                "shadowRoot.querySelector(\"div:nth-child(2) > shop-button > a\")");
        loginButton.click();

        //document.querySelector("body > shop-app").shadowRoot.querySelector("iron-pages > shop-home").
        // shadowRoot.querySelector("div:nth-child(2) > shop-button > a")
    }
}
