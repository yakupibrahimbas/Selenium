package Subat23;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class C13 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://www.ilovepdf.com/compress_pdf");
        driver.findElement(By.id("pickfiles")).click();
        waitForSecond(2);
        String dosyaYolu=System.getProperty("user.home")+"\\Downloads\\İADE TALEP FORMU.pdf";
        uploadFilePath(dosyaYolu);

    }
}
