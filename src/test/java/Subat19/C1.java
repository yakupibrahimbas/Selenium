package Subat19;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class C1 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://ebay.com");
        driver.findElement(By.xpath("(//*[.='Electronics'])[3]")).click();
        List<WebElement>pictures=driver.findElements(By.xpath("//img[@width='225' and @height='225']"));
        for (WebElement w:pictures){
            waitForSecond(1);
            w.click();
            waitForSecond(1);
            System.out.println(driver.getTitle());
            driver.navigate().back();
        }

    }
}
