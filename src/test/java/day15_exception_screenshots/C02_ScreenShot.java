package day15_exception_screenshots;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C02_ScreenShot extends TestBase {
    /*
    Seleniumda bir sayfanin ekran goruntusunu almak istiyorsak;
    1-ekran goruntulerini projemizde kaydetmek icin bir klasor olusturup yolunu aliriz
    2-TakeScreenShot tipinde object deklare ederiz ve driveri bu objeye assign edecegiz.
        TakeScreenShot ts=driver;
    3-Files classindan write() methodu kullanarak icine parametre olarak aldigimiz ekran goruntusunu nereye kaydedecegimizi belirtiriz
    getScreenShotAs() methodu ile ekran goruntusunu alarak kaydetmek icin almis oldugumuz dosya yolunu belirtiriz
     */

    @Test
    public void test01() throws IOException {
        driver.get("https://techproeducation.com");

        String dosyaYolu="src\\test\\java\\screenShots\\techpro.png";
        TakesScreenshot ts= (TakesScreenshot) driver;
        Files.write(Paths.get(dosyaYolu),ts.getScreenshotAs(OutputType.BYTES));

    }

    @Test
    public void test02() throws IOException {
        //google sayfasina gidelim ve ekran goruntusunu alalim
        driver.get("https://google.com");
        String dosyaYolu="src\\test\\java\\screenShots\\google.jpg";
        TakesScreenshot ts= (TakesScreenshot) driver;
        Files.write(Paths.get(dosyaYolu),ts.getScreenshotAs(OutputType.BYTES));

    }

    @Test
    public void test03() throws IOException {
        driver.get("https://facebook.com");
        LocalDateTime.now();
       String date= DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss").format(LocalDateTime.now());
        String dosyaYolu="src\\test\\java\\screenShots\\facebook"+date+".jpg";
        TakesScreenshot ts= (TakesScreenshot) driver;

        Files.write(Paths.get(dosyaYolu),ts.getScreenshotAs(OutputType.BYTES));
    }

    @Test
    public void test04() {
        driver.get("https://facebook.com");
        screenShot();//TestBase clasina koymus oldugumuz reuasable method ile ekran goruntusu aldik
    }
}
