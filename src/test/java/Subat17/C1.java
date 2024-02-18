package Subat17;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C1 extends TestBase {
    @Test
    public void test01() {
        driver.get("http://google.com");
        WebElement searchBox=driver.findElement(By.id("APjFqb"));
        searchBox.sendKeys("Selenium", Keys.ENTER);
        waitForSecond(3);
        Actions actions=new Actions(driver);
        searchBox=driver.findElement(By.id("APjFqb"));
        actions.doubleClick(searchBox).keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).perform();
        waitForSecond(5);

        driver.navigate().back();
        waitForSecond(5);
        searchBox=driver.findElement(By.id("APjFqb"));
        searchBox.sendKeys(Keys.CONTROL+"v");
        searchBox.submit();
        waitForSecond(5);


    }
}
