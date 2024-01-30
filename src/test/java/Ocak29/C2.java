package Ocak29;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.Set;

public class C2 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/windows");
        String ilkSayfaHandleDeger=driver.getWindowHandle();
        String actualText=driver.findElement(By.xpath("//h3")).getText();
        Assertions.assertEquals("Opening a new window",actualText);
        Assertions.assertEquals("The Internet",driver.getTitle());
        driver.findElement(By.partialLinkText("Click Her")).click();
        waitForSecond(5);
        Set<String > windows=driver.getWindowHandles();
        for (String  w:windows){
            if (!w.equals(ilkSayfaHandleDeger)){
                driver.switchTo().window(w);
            }
        }
        String ikinciSayfaHandleDegeri=driver.getWindowHandle();
        Assertions.assertEquals("",driver.getTitle());
        waitForSecond(2);

    }
}
