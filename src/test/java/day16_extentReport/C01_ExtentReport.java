package day16_extentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_ExtentReport {
    /*
    Extent Report kullanabilmek icin 3 tane classa ihtiyac var
    1)ExtentReport classi==> raporlamayi baslatmasi icin bir object olustururuz
    2)ExtentHtmlReporter classi==> raporu html formatinda olusturmasi icin bir object olustururuz
    3)ExtentTest classindan test adimlarina bilgi ekleyebilmek icin bir object olustururuz

     */

    ExtentReports extentReports;
    ExtentHtmlReporter extentHtmlReporter;
    ExtentTest extentTest;

    @Test
    public void extentHtmlReportTemplate() {
        //bu objecti raporlari olusturmak ve yonetmek icin kullanacagiz
        extentReports=new ExtentReports();

        /*
        oncelikle olusturmak istedigimiz html reportu projemizde nerede saklamak istiyorsak bir
        dosya yolu olusturmaliyiz, cunku bu pathi kullanarak bir tane html report olusturacagiz
        bunun icin ExtentHtmlReporter classsindan object olusturmaliyiz
         */
        String date= DateTimeFormatter.ofPattern("ddMMyyyy__HHmmss").format(LocalDateTime.now());
        String path="target/extentReport/"+date+"htmlReport.html";
        extentHtmlReporter=new ExtentHtmlReporter(path);

        //ExtentReports a Html raporlayiciyi ekler
        //Bu raporun html formatinda olusmasini saglar

        extentReports.attachReporter(extentHtmlReporter);

        //Html raporun browser sekmesinde title kisminda goruntulenir
        extentHtmlReporter.config().setDocumentTitle("Batch 210 Test");
        //Raporun adini ayarlar, bu raporda goruntulenecek genel basliktir
        extentHtmlReporter.config().setReportName("My Extent Report");

        //raporun sistem
        extentReports.setSystemInfo("Environment","QA");
        extentReports.setSystemInfo("Browser","Chrome");
        extentReports.setSystemInfo("Test Automation Engineer","Ali");

        //amazon test adinda yeni bir test olusturur ve bu teste TestSteps aciklamasini ekler
       extentTest= extentReports.createTest("AmazonTest","Test Steps");

       //=============Sablon ayarlamalari burada bitti====================================

        //testin basarili oldugunu belirtir ve rapora pass notu ekler
        extentTest.pass("PASS");

        //testle ilgili bilgilendirici not ekler
        extentTest.info("Bilgilendirme notu");

        //testin basarisiz oldugunu belirtir ve rapora fail mesaji notu ekler
        extentTest.fail("fail mesaji");

        //Testle ilhili dikkat edilmesi gereken onemli bir konu oldugunu isaret eder
        extentTest.warning("uyari mesaji");

        //test sirasinda ciddi bir hata mesaji oldugunu belirtir ve rapora bu notu ekler
        extentTest.fatal("ciddi hata mesaji");

        //Tum test verilerini kaydeder ve html rapor olusturmasini tamamlar
        extentReports.flush();
    }
}
