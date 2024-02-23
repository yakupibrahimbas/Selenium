package Subat23;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C7 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://google.com");
        WebElement searchbox=driver.findElement(By.id("APjFqb"));
        Actions actions=new Actions(driver);
        actions.keyDown(searchbox,Keys.SHIFT).sendKeys("selenium").keyUp(Keys.SHIFT).sendKeys("-java",Keys.ENTER).perform();
    }

    @Test
    public void test02() {
        driver.get("https://google.com");
        WebElement searchBox=driver.findElement(By.id("APjFqb"));
        searchBox.sendKeys(Keys.SHIFT,"selenium",Keys.SHIFT,"-java",Keys.ENTER);


    }
}
