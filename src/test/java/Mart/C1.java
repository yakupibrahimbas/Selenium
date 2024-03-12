package Mart;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C1 extends TestBase {
    @Test
    public void test01() {
        //https://the-internet.herokuapp.com/context_menu sitesine gidin
        driver.get("https://the-internet.herokuapp.com/context_menu");

        //Kutuya sag tıklayın
        WebElement box = driver.findElement(By.id("hot-spot"));
        Actions actions = new Actions(driver);
        actions.contextClick(box);
        //Alert'te cikan yazinin"You selected a context menu"oldugunu test edin
        String actualResult = driver.switchTo().alert().getText();
        String expectedResult = "You selected a context menu";
        Assertions.assertEquals(expectedResult, actualResult);
        //Tamam diyerek alert'i kapatın
        driver.switchTo().alert().accept();
    }
}
