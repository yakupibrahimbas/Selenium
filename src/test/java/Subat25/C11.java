package Subat25;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C11 extends TestBase {
    @Test
    public void test01() {

            driver.get("https://google.com");
            Actions actions=new Actions(driver);
            WebElement searchBox= driver.findElement(By.id("APjFqb"));
            actions.keyDown(searchBox, Keys.SHIFT).sendKeys("selenium").keyUp(Keys.SHIFT).sendKeys("java",Keys.ENTER).perform();
    }
}
