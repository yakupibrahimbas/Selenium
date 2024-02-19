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
        Actions actions = new Actions(driver);
        driver.get("https://google.com");
        WebElement searchBox = driver.findElement(By.id("APjFqb"));
        searchBox.sendKeys("Selenium", Keys.ENTER);
        waitForSecond(3);
        WebElement searchBox2= driver.findElement(By.xpath("//div[@jscontroller='vZr2rb']"));
        actions.doubleClick(searchBox2);
        actions.keyDown(searchBox2,Keys.COMMAND).sendKeys("x").keyUp(Keys.COMMAND).perform();
        waitForSecond(3);
        actions.keyDown(searchBox2,Keys.COMMAND).sendKeys("v",Keys.ENTER).keyUp(Keys.COMMAND).perform();
        waitForSecond(3);



    }
}
