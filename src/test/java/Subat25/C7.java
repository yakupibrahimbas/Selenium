package Subat25;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C7 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://testpages.herokuapp.com/");
    //  WebElement challenges= driver.findElement(By.xpath("(//h2)[3]"));
    // Actions actions=new Actions(driver);
    // actions.scrollToElement(challenges).perfor

    WebElement challenges= driver.findElement(By.xpath("//h2[.='Challenges']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",challenges);

    }
}
