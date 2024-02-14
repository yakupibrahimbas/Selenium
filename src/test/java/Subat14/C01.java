package Subat14;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class C01 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://html.com/tags/iframe/");
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//button[@title='Oynat']")).click();
        waitForSecond(3);
    }
}
