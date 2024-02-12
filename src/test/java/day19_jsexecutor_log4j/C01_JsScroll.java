package day19_jsexecutor_log4j;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;

public class C01_JsScroll extends TestBase {
    @Test
    public void test01() {
        //techproya gidin
        //sayfanin en altina kadar scroll yapin

        driver.get("https://techproeducation.com");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        //sayfanin toplam yuksekligini dynamic olarak aldik ve y coordinati olarak belirttik
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
