package Subat23;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C5 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://techproeducation.com");
        WebElement events=driver.findElement(By.xpath("//h2[.='Events']"));
        Actions actions=new Actions(driver);
        actions.scrollToElement(events).perform();
        Assertions.assertTrue(events.isDisplayed());
    }
}
