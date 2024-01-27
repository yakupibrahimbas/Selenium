package day10__windowHandle_basicAuthentication;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class C03_BasicAuthentication extends TestBase {
    @Test
    public void test01() {
        //Aşağıdaki bilgileri kullanarak authentication yapınız:
        //    Url: https://the-internet.herokuapp.com/basic_auth
        //    Username: admin
        //    Password: admin
driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        //    Congratulations! You must have the proper credentials. yazının çıktığını doğrulayın
        String actualSuccesMessage=driver.findElement(By.xpath("//p")).getText();
        Assertions.assertEquals("Congratulations! You must have the proper credentials.",actualSuccesMessage);
        //Elemental Selenium linkine tıklayınız
        driver.findElement(By.xpath("//*[.='Elemental Selenium']")).click();

        //Başlığın Elemental Selenium içerdiğini test edelim
        switchToWindow(1);
        Assertions.assertTrue(driver.getTitle().contains("Elemental Selenium"));
    }




}
