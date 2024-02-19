package Subat19;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C03 extends TestBase {
    @Test
    public void test01() {

        driver.get("https://google.com");
        waitForSecond(5);
        WebElement searchBox = driver.findElement(By.id("APjFqb"));
        searchBox.sendKeys("Selenium", Keys.ENTER);
        waitForSecond(3);
        WebElement searchBox2= driver.findElement(By.xpath("//div[@jscontroller='vZr2rb']"));

        Actions actions = new Actions(driver);
        actions.doubleClick(searchBox2);
        actions.keyDown(searchBox2,Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).perform();
        waitForSecond(2);

        actions.keyDown(searchBox2, Keys.CONTROL).sendKeys("v", Keys.ENTER).keyUp(Keys.CONTROL).perform();
        waitForSecond(2);
    }
}
