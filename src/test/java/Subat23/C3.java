package Subat23;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C3 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.partialLinkText("Try different image")).click();
        Actions actions=new Actions(driver);
        WebElement signIn=driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));

        actions.moveToElement(signIn).perform();
        driver.findElement(By.xpath("//*[@class='nav-line-2 ']")).click();
        Assertions.assertTrue(driver.getTitle().contains("Your Account"),"Title your account icermiyor");


    }
}
