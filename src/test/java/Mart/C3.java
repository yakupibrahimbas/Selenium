package Mart;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class C3 extends TestBase {
    @Test
    public void sendKeys() {

        //amazona gidelim
        driver.get("https://amazon.com");

        waitForSecond(3);

        //jsexecutor ile arama kutusuna selenium yazdiralim
        WebElement searchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));

       /*
       <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off"
       placeholder="Search Amazon" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0"
       aria-label="Search Amazon" spellcheck="false">
        */
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='selenium'",searchBox);

    }

    @Test
    public void test03() {
        driver.get("https://amazon.com");
        waitForSecond(3);
        WebElement searchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        jsSendKeys(searchBox,"selenium");

    }
    /*
           <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off"
           placeholder="Search Amazon" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0"
           aria-label="Search Amazon" spellcheck="false">
            */
    @Test
    public void test04() {
        //amazona gidelim
        driver.get("https://amazon.com");
        waitForSecond(3);

            /*
       <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off"
       placeholder="Search Amazon" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0"
       aria-label="Search Amazon" spellcheck="false">
        */


        //arama kutusunun id attribute degerini ismimiz ile degistirelim
        WebElement searchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('id','mehmet')", searchBox);

        waitForSecond(2);
        //degistirmis oldugumuz id ile arama kutusunu locate ederek java aratalim
        driver.findElement(By.id("mehmet")).sendKeys("java");
    }
}
