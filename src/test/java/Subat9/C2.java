package Subat9;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C2 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://techproeducation.com");
        Assertions.assertEquals("https://techproeducation.com/",driver.getCurrentUrl());
        WebElement icons=driver.findElement(By.xpath("//*[@class='toolbar-sl-share']"));
        Assertions.assertTrue(icons.isDisplayed());
        extentTest.pass("Ana sayfa url testi basarili");

       // WebElement icons=driver.findElement(By.xpath("//*[@class='toolbar-sl-share']"));
        Assertions.assertTrue(icons.isDisplayed());
        extentTest.pass("Kullanici ana sayfadaki sosyal medya ikonlarinin goruntulendigini dogrular");
        extentReports.flush();


    }
}
