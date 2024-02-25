package Subat25;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class C6 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://amazon.com");
        driver.findElement(By.xpath("//*[@data-action-type='DISMISS']")).click();
       WebElement sellLinki= driver.findElement(By.xpath("(//*[@class='nav-a  '])[5]"));
      JavascriptExecutor jse=(JavascriptExecutor) driver;
      jse.executeScript("argument[0].click();",sellLinki);

    }

    @Test
    public void test02() {
        driver.get("https://amazon.com");
        WebElement sellLinki = driver.findElement(By.xpath("//*[.='Sell']"));
        jsClick(sellLinki);



    }
}
