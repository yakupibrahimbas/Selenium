package Ocak29;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C6 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://amazon.com");
        driver.findElement(By.partialLinkText("Try different image")).click();
        WebElement accountList=driver.findElement(By.id("nav-link-accountList"));
        Actions actions=new Actions(driver);
        actions.moveToElement(accountList).perform();
        driver.findElement(By.xpath("//span[.='Account']")).click();
        Assertions.assertTrue(driver.getTitle().contains("Your Account"));



    }
}
