package Subat4;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.Set;

public class C6 extends TestBase {

    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/windows");
        String ilkSayfaHandleDegeri=driver.getWindowHandle();
        String actualText=driver.findElement(By.xpath("//h3")).getText();
        Assertions.assertEquals("Opening a new window",actualText);
        Assertions.assertEquals("The Internet",driver.getTitle());
        driver.findElement(By.partialLinkText("Click Her")).click();
        waitForSecond(5);
        Set<String >windows=driver.getWindowHandles();
             for (String w:windows){
           if (!w.equals(ilkSayfaHandleDegeri)){
               driver.switchTo().window(w);
           }
       }

    }
}
