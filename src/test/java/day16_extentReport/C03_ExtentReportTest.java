package day16_extentReport;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class C03_ExtentReportTest extends TestBase {
    @Test
    public void test01() {

        createExtentReport("Amazon Title Test");

        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");
        extentTest.info("Kullanici amazon sayfasina gider");


        //Arama kutusunda selenium aratalim
        WebElement searchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        searchBox.sendKeys("selenium", Keys.ENTER);
        extentTest.info("Arama kutusunda selenium yazilarak aratildi");
        screenShot();

        //Sayfa basliginin selenium icerdigini doğrulayalim
        Assertions.assertTrue(driver.getTitle().contains("selenium"));
        extentTest.pass("Sayfa basliginin selenium icerdigi dogrulandi");
        screenShot();


        extentReports.flush();

    }
}