package Subat14;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class C02 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/windows");
        String firstPageHandle=driver.getWindowHandle();
        String pageText=driver.findElement(By.xpath("//h3")).getText();
        Assertions.assertEquals("Opening a new window",pageText);

    }
}
