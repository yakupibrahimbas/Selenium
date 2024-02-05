package Subat5;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C9 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://jqueryui.com/droppable/");
       WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));
       WebElement drop= driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(drag,drop).perform();

    }

    @Test
    public void test02() {
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement drop= driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(drag).moveToElement(drop).release().perform();

    }
}
