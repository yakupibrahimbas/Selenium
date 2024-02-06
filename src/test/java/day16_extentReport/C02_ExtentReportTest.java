package day16_extentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C02_ExtentReportTest extends TestBase {
    ExtentReports extentReports;
    ExtentHtmlReporter extentHtmlReporter;
    ExtentTest extentTest;

    //==rapor oncesi sablon ayarlamalari yapmaliyiz
    @Test
    public void extentReportTest() {
        //TechproEducation sayfasina gidelim
        driver.get("https://techproeducation.com");
        extentTest.info("Kullanici Techpro sayfasina gider");
        //TechproEducation ana sayfada oldugunuzu dogrulayin
        Assertions.assertEquals("https://techproeducation.com/",driver.getCurrentUrl());
        extentTest.info("Kullanici anasayfada oldugunu dogrular");
        WebElement icons=driver.findElement(By.xpath("//*[@class='toolbar-sl-share']"));
        Assertions.assertTrue(icons.isDisplayed());
        //Ana Sayfada sosyal medya iconlarinin goruntulendigini dogrulayin


    }
}
