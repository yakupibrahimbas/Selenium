package Subat4;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C1 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        WebElement year=driver.findElement(By.id("year"));
        WebElement month=driver.findElement(By.id("month"));
        WebElement day=driver.findElement(By.id("day"));

        selectIndex(year,1);
        waitForSecond(2);
        selectIndex(month,2);
        waitForSecond(2);
        selectIndex(day,3);
        waitForSecond(2);

        selectVisibleText(year,"1999");
        waitForSecond(2);
        selectVisibleText(month,"August");
        waitForSecond(2);
        selectVisibleText(day,"10");
    }
}
