package Subat16;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class C2 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/windows");
        String ilkSayfaHandleDegeri= driver.getWindowHandle();
        String actualText= driver.findElement(By.xpath("//h3")).getText();
        Assertions.assertEquals("Opening a new window",actualText);
        String firstPageTitle= driver.getTitle();
        Assertions.assertEquals("The Internet",driver.getTitle());
        driver.findElement(By.partialLinkText("Click He")).click();



    }
}
