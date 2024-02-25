package Subat25;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;

public class C8 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://techproeducation.com");
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        waitForSecond(2);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

    }

    @Test
    public void test02() {
        driver.get("https://techproeducation.com");
        jsScrollEnd();
        waitForSecond(2);
        jsScrollHome();

    }
}
