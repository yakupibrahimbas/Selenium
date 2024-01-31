package Ocak29;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C5 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement box=driver.findElement(By.id("hot-spot"));
        Actions actions=new Actions(driver);
        actions.contextClick(box).perform();
        String actualResult=driver.switchTo().alert().getText();
        String expectedResult="You selected a context menu";
        Assertions.assertEquals(expectedResult,actualResult);
        driver.switchTo().alert().accept();
    }
}