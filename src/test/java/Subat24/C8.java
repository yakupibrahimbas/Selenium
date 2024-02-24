package Subat24;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class C8 extends TestBase {
    @Test
    public void test01() {
        createExtentReport("Amazon Title Test");
        driver.get("https://amazon.com");
        extentTest.info("Kullainici amazon sayfasina gider");
        screenShot();
        waitForSecond(1);
        WebElement searchBox=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        screenShotOfWebElement(searchBox);
        searchBox.sendKeys("selenium", Keys.ENTER);
        extentTest.info("Arama kutusuna selenium yazilarak aratildi");

        waitForSecond(1);
        Assertions.assertTrue(driver.getTitle().contains("selenium"));
        extentTest.pass("sayfa basliginin selenium oldugu dogrulandi");
        screenShot();
        extentReports.flush();

    }
}
