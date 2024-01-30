package Ocak29;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class C3 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        String actualSuccessMessage=driver.findElement(By.xpath("//p")).getText();
        Assertions.assertEquals("Congratulations! You must have the proper credentials",actualSuccessMessage);
        driver.findElement(By.xpath("//*[.='Elemental Selenium']")).click();
        switchToWindow(1);
        Assertions.assertTrue(driver.getTitle().contains("Elemental Selenium"));


    }
}
