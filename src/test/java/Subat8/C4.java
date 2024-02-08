package Subat8;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C4 extends TestBase {
   /*
   Ekran goruntulerini kaydetmek icin bir klasor olusturup yolunu aliriz
   TakseScreenShot tipinde obje
    */
    @Test
    public void test01() throws IOException {
        driver.get("https://mynet.com");
        String dosyaYolu="src\\test\\java\\screenShots\\mynet.png";
        TakesScreenshot ts= (TakesScreenshot) driver;
        Files.write(Paths.get(dosyaYolu),ts.getScreenshotAs(OutputType.BYTES));

    }

    @Test
    public void test02() throws IOException {
        driver.get("https://google.com");
        String dosyaYolu="src\\test\\java\\screenShots\\google.jpeg";
        TakesScreenshot ts=(TakesScreenshot) driver;
        Files.write(Paths.get(dosyaYolu),ts.getScreenshotAs(OutputType.BYTES));
    }

    @Test
    public void test03() throws IOException {
        driver.get("https://facebook.com");

       String date= DateTimeFormatter.ofPattern("ddMMyyyy_HH").format(LocalDateTime.now());
        String dosyaYolu="src\\test\\java\\screenShots\\facebook"+date+".jpeg";
        TakesScreenshot ts=(TakesScreenshot) driver;
        Files.write(Paths.get(dosyaYolu),ts.getScreenshotAs(OutputType.BYTES));
    }

    @Test
    public void test04() {
        driver.get("https://facebook.com");
        screenShot();
    }
}
