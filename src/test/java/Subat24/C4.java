package Subat24;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C4 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://techproeducation.com/");
        Assertions.assertEquals("https://techproeducation.com/",driver.getCurrentUrl());
        screenShot();
        WebElement phone= driver.findElement(By.xpath("(//a[.='+1 585 304 29 59'])[1]"));
        Assertions.assertEquals("+1 585 304 29 59",phone.getText());
        screenShotOfWebElement(phone);
        waitForSecond(1);
        WebElement searchBox=driver.findElement(By.id("searchHeaderInput"));
        searchBox.sendKeys("selenium");
        screenShotOfWebElement(searchBox);

    }
}
