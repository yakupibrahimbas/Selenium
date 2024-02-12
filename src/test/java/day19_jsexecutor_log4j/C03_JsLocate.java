package day19_jsexecutor_log4j;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class C03_JsLocate extends TestBase {
    /*
    js executor ile bir webelementin locateni document.getElementById('twotabsearchtextbox') methodu ile alabiliriz
     */

    @Test
    public void test01() {

        //amazona gidelim
        driver.get("https://amazon.com");
        waitForSecond(3);

        //jsexecutor ile aramakutusunu locate edelim
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement searchBox = (WebElement) js.executeScript("return document.getElementById('twotabsearchtextbox')");
        searchBox.sendKeys("selenium");

         /*
       <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off"
       placeholder="Search Amazon" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0"
       aria-label="Search Amazon" spellcheck="false">
        */

        String searchBoxValue =js.executeScript("return document.getElementById('twotabsearchtextbox').value").toString();
        System.out.println("searchBoxValue = " + searchBoxValue);
        String searchBoxTypeAttriubuteDegeri =js.executeScript("return document.getElementById('twotabsearchtextbox').type").toString();
        System.out.println("searchBoxTypeAttriubuteDegeri = " + searchBoxTypeAttriubuteDegeri);
        String searchBoxNameAttriubuteDegeri =js.executeScript("return document.getElementById('twotabsearchtextbox').name").toString();
        System.out.println("searchBoxNameAttriubuteDegeri = " + searchBoxNameAttriubuteDegeri);

    }

}