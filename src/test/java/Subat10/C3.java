package Subat10;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;

public class C3 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://techproeducation.com");
        String techPro=driver.getWindowHandle();

        driver.findElement(By.xpath("//a[@href='https://twitter.com/techproedu']")).click();
        String x=driver.getWindowHandle();
        waitForSecond(3);
        driver.findElement(By.xpath("//*[.='Kaydol']")).click();

    }
}
