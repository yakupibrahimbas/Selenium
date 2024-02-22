package Subat22;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

public class C1 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
       WebElement Boston= driver.findElement(By.id("pid6_thumb"));
       WebElement nyc= driver.findElement(By.id("pid3_thumb"));
       WebElement sailor= driver.findElement(By.id("pid8_thumb"));
       WebElement sailorElement= driver.findElement(By.id("pid11_thumb"));

       WebElement berlinElemet1=driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(Boston));
       WebElement berlinElement2=driver.findElement(RelativeLocator.with(By.id("pid7_thumb")).toLeftOf(sailorElement));
       String text1=berlinElemet1.getAttribute("id");
       String text2=berlinElemet1.getAttribute("id");
       String text3=berlinElemet1.getAttribute("id");



    }
}
