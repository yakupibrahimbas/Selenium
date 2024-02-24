package Subat24;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class C3 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://amazon.com");
        driver.findElement(By.xpath("//*[@title='Search For']")).sendKeys("laptop", Keys.ENTER);
        screenShot();
        WebElement result=driver.findElement(By.xpath("//*[.='1-16 of over 4,000 results for']"));
        screenShotOfWebElement(result);

    }
}
