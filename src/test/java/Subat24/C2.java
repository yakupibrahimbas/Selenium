package Subat24;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C2 extends TestBase {
    @Test
    public void test01() throws IOException {
        driver.get("https://techproeducation.com");
        String dosyaYolu="src/test/java/screenShots/atp.png";
        TakesScreenshot ts=(TakesScreenshot) driver;
        Files.write(Paths.get(dosyaYolu),ts.getScreenshotAs(OutputType.BYTES));
    }

    @Test
    public void test02() throws IOException {
        driver.get("https://google.com");
        String dosyaYolu="src/test/java/screenShots/googleScreenShots.jpeg";
        TakesScreenshot ts=(TakesScreenshot) driver;
        Files.write(Paths.get(dosyaYolu),ts.getScreenshotAs(OutputType.BYTES));

    }

    @Test
    public void test03() {
        driver.get("https://facebook.com");
        String date= DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss").format(LocalDateTime.now());
        String dosyaYolu="src/test/java/screenShots/fbss"+date+".png";
        TakesScreenshot ts=(TakesScreenshot) driver;
        try {
            Files.write(Paths.get(dosyaYolu),ts.getScreenshotAs(OutputType.BYTES));

        }catch (IOException e){
            throw new RuntimeException(e);
        }



    }
}
