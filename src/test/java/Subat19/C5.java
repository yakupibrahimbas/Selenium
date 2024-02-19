package Subat19;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C5 extends TestBase {
    @Test
    public void test01() {
        driver.get("http://szimek.github.io/signature_pad/");
        WebElement touch=driver.findElement(By.xpath("//canvas"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(touch).moveByOffset(0,100).moveByOffset(200,20).
                moveByOffset(20,200).moveByOffset(500,10).release().perform();
        driver.findElement(By.xpath("//*[@class='button clear']")).click();
    }
}
