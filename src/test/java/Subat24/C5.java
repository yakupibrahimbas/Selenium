package Subat24;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Date;

public class C5 extends TestBase {
    ExtentReports extentReports;
    ExtentHtmlReporter extentHtmlReporter;
    ExtentTest extentTest;
    @Test
    public void test01() {

        extentReports=new ExtentReports();
        String tarih=new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
        String dosyaYolu="target/extentReport"+tarih+".html";
        extentHtmlReporter=new ExtentHtmlReporter(dosyaYolu);
        extentReports.attachReporter(extentHtmlReporter);
        extentReports.setSystemInfo("Browser","Chrome");
        extentReports.setSystemInfo("Tester","Yakup");
        extentHtmlReporter.config().setDocumentTitle("Extent report");
        extentHtmlReporter.config().setReportName("Smoke test raporu");

        extentTest=extentReports.createTest("ebay test","test raporu");
        driver.get("https://ebay.com");
        extentTest.info("kullanici ebay sayfasina gider");
        WebElement searchBox=driver.findElement(By.cssSelector("input[type='text']"));
        searchBox.sendKeys("bisiklet", Keys.ENTER);
        extentTest.info("kullanici arama kutusuna bicycle yazar ve entera basar");

        extentTest.info("Kullanici ekran goruntusunu alir");
        extentReports.flush();



    }
}
