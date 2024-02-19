package Subat19;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class C2 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://wwww.ebay.com");
        driver.findElement(By.xpath("//a[@_sp='p4375194.m1379.l3250']")).click();
        List<WebElement>resimler=driver.findElements(By.xpath("//img[@width='225' and @height='225']"));
        for (WebElement w:resimler){
            waitForSecond(1);
            w.click();
            waitForSecond(1);
            System.out.println(driver.getTitle());
            driver.navigate().back();
        }

    }
}