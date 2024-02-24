package Subat24;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C6 extends TestBase {
    ExtentReports extentReports;
    ExtentHtmlReporter extentHtmlReporter;
    ExtentTest extentTest;

    @Test
    public void Test01() {
        extentReports =new ExtentReports();
        String date= DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss").format(LocalDateTime.now());
        String path="target/extentReport/"+date+"htmlReportt.html";
        extentHtmlReporter=new ExtentHtmlReporter(path);
        extentReports.attachReporter(extentHtmlReporter);
        extentHtmlReporter.config().setDocumentTitle("Batch 210 Test");
        extentHtmlReporter.config().setReportName("My Extent Report");
        extentReports.setSystemInfo("Enviroment","QA");
        extentReports.setSystemInfo("Browser","Chrome");
        extentReports.setSystemInfo("Tester","Yakup ");
        extentTest=extentReports.createTest("AmazonTest","Test Steps");
        extentTest.pass("PASS");
        extentTest.info("Bilgilendirme Notu");
        extentTest.fail("fail mesaji");
        extentTest.warning("uyari mesaji");
        extentTest.fatal("ciddi hata mesaji");
        extentReports.flush();






    }
}
