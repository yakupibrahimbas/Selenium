package Subat14;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;

public class C7 extends TestBase {
  /*  @Test
    void loginTest() {

        // https://opensource-demo.orangehrmlive.com/ Sayfaya git
        orangeHRMlogin();

        // PIM Butonu tikla
        driver.findElement(By.partialLinkText("PIM")).click();

        // Add butonuna tikla
        driver.findElement(By.cssSelector(".oxd-icon.bi-plus.oxd-button-icon")).click();

        // Resim Ekle
        WebElement addPhoto = driver.findElement(By.cssSelector(".oxd-icon.bi-plus"));
        addPhoto.click();

        waitForSecond(4);

        String dosyaYolu = "C:\\Users\\murat\\IdeaProjects\\SeleniumPracticeDT\\src\\test\\resources\\resim.png";

        uploadFilePath(dosyaYolu);

        /*
        Resim eklenmeden once
        src="/web/images/default-photo.png"

        Resim eklendikten sonra
        src ="data:image/png"

        WebElement resimEkleme = driver.findElement(By.cssSelector(".employee-image"));

        // Resim Eklendiğini Dogrula
        Assertions.assertTrue(resimEkleme.getAttribute("src").contains("data:image/png"), "RESiM EKLENMEDİ");

*/
    }

