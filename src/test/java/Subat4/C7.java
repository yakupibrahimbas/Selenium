package Subat4;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class C7 extends TestBase {
    @Test
    public void test01() {
        driver.get("http://the-internet.herokuapp.com/basic_auth");
        String actualsuccessMessage= driver.findElement(By.xpath("//p")).getText();
        Assertions.assertEquals("Congratulations! You must have the proper credentials.",actualsuccessMessage);
        driver.findElement(By.xpath("//*[.='Elemental Selenium']")).click();
        switchToWindow(1);
        Assertions.assertTrue(driver.getTitle().contains("Elemental Selenium"));
    }
}
