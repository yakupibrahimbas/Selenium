package Subat24;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C1 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://techproeducation.com");
        WebElement searchBox = driver.findElement(By.id("searchHeaderInput"));
        driver.navigate().refresh();
        searchBox = driver.findElement(By.id("searchHeaderInput"));
        searchBox.sendKeys("bu webeelement fresh");

    }

    @Test
    public void test02() {
        driver.get("https://techproeducation.com");
        WebElement searchBox = driver.findElement(By.cssSelector("//*searchHeaderInput"));

    }

}
