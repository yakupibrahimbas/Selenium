package Subat25;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class C9 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://amazon.com");
        waitForSecond(3);
        WebElement searchBox=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("argument[0].value='selenium'",searchBox);



    }
}
