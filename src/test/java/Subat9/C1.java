package Subat9;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C1 extends TestBase {
    ExtentReports extentReports;
    ExtentHtmlReporter extentHtmlReporter;
    ExtentTest extentTest;

    @Test
    public void test01() {
        extentReports=new ExtentReports();
       String date= DateTimeFormatter.ofPattern("ddMMyyyy*HHmmss").format(LocalDateTime.now());
        String path="target/extentReport/"+date+"htmlreport.html";
        extentHtmlReporter=new ExtentHtmlReporter(path);

        //ExtentReportsa html raporlayiciyi ceker, raporun html formatinda olusturulmasini saglar
        extentReports.attachReporter(extentHtmlReporter);
        extentHtmlReporter.config().setDocumentTitle("Batch 210 Test Reports");
        extentHtmlReporter.config().setReportName("My Extent Report");

        //Html raporunda gormek isteyebilecegimiz bilgileri asagidaki formatta belirtebiliyoruz
        extentReports.setSystemInfo("Enviroment","QA");
        extentReports.setSystemInfo("Browser","Chrome");
        extentReports.setSystemInfo("Test Automation Engineer","Jacob");

        extentReports.createTest("AmazonTest","TestSteps");

        //=============================================================
        extentTest.pass("Pass");
        extentTest.info("Bilgilendirme Notu");
        extentTest.fail("Fail mesaji");
        extentTest.fatal("Ciddi hata mesaji");
        extentReports.flush();

    }
}
