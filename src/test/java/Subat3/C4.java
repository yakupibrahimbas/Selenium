package Subat3;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C4 extends TestBase {
    @Test
    public void test01() {

    driver.get("https://diemol.com/selenium-4-demo/relative-locators-demo.html");
    WebElement nyc=driver.findElement(By.id("pid3_thumb"));
    WebElement byArea=driver.findElement(By.id("pid8_thumb"));
    WebElement berlin=driver.findElement(with(By.tagName("img")).below(nyc).toLeftOf(byArea));
    String actualIDvalue=berlin.getAttribute("id");
    String expectedID="pid7_thumb";
        Assertions.assertEquals(expectedID,actualIDvalue);



    }
}
