package Subat24;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C7 extends TestBase {
    ExtentReports extentReports;
    ExtentHtmlReporter extentHtmlReporter;
    ExtentTest extentTest;
    @Test
    public void Test01() {

        extentReports=new ExtentReports();
        String date = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss").format(LocalDateTime.now());
        String path="target/extentReport/"+date+"htmlReport.html";
        extentHtmlReporter =new ExtentHtmlReporter(path);
        extentReports.attachReporter(extentHtmlReporter);
        extentHtmlReporter.config().setDocumentTitle("Batch 210 Test");
        extentReports.setSystemInfo("Environment","QA");
        extentReports.setSystemInfo("Browser","Chrome");
        extentReports.setSystemInfo("Test Automation Engineer","Ali");
        extentTest=extentReports.createTest("TechProEducation","Test Steps");
        driver.get("https://techproeducation.com/");
        extentTest.info("Kullanici TechproEducation sayfasina gider");
        Assertions.assertEquals("https://techproeducation.com/",driver.getCurrentUrl());
        extentTest.info("Kullanici ana sayfada oldugunu dogrular");
        extentTest.pass("Ana sayfa url testi basarili");
        WebElement icons = driver.findElement(By.xpath("//*[@class='toolbar-sl-share']"));
        Assertions.assertTrue(icons.isDisplayed());
        extentTest.pass("Kullanici ana sayfadaki sosyal medya ikonlarinin goruntulendigini dogrular");
        extentReports.flush();



    }
}
