package Subat28;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.awt.*;
import java.awt.event.KeyEvent;

public class C7 extends TestBase {
    @Test
    public void test01() throws AWTException {
        /*
        Upload file yaparken sendKeys() methodu islemedigi durumlarda TestBase classinda olusturdugumuz
        uploadFilePath() methodu ile dosya yi yukleyebiliriz
        Bu method kullanilirken manual olarak klavye yada mouse u kullanmamamiz gerekir
         */
        //Robot classi java nin yerel kütüphanesinde bulunur ve seleniumdaki actions class gibi mouse ve
        //klavye islemlerini simule eder

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyRelease(KeyEvent.VK_WINDOWS);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);
        robot.delay(3000);
    }

    @Test
    public void robotTest() {

        //"https://www.ilovepdf.com/compress_pdf" sayfasina gidilir
        driver.get("https://www.ilovepdf.com/compress_pdf");

        //   yuklenmek istenen dosya yuklenir
        driver.findElement(By.id("pickfiles")).click();
        waitForSecond(2);

        String dosyaYolu = System.getProperty("user.home")+"\\Desktop\\Batch 210upload.pdf";

        //   dosyanin basariyla yuklendigini test edilir




    }
}

