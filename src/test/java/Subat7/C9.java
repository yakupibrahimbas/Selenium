package Subat7;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C9 extends TestBase {
    @Test
    public void test01() {
        /*
        NoSuchElementException aliyorsak;
        -yanlis locate almis olabiliriz dolayisiyla locateyi kontrol etmemiz gerekiyor
         */
        driver.get("https://techproeducation.com");
       WebElement searchBox= driver.findElement(By.id("searchHeaderInput"));
       searchBox.sendKeys("Batch210");
    }
}
