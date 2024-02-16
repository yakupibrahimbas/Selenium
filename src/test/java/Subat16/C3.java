package Subat16;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class C3 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("//*[@onclick='alertbox()']")).click();
        String alertYazi= driver.switchTo().alert().getText();
        System.out.println("alertYazi="+alertYazi);
        waitForSecond(3);
        driver.switchTo().alert().accept();
        waitForSecond(3);
        driver.findElement(By.xpath("//*[.='Alert with OK & Cancel ']")).click();

    }
}
