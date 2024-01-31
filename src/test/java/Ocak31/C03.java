package Ocak31;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class C03 extends TestBase {

// 1) 'http://automationexercise.com' adresine gidin

// 2) Sayfaya girildigini dogrulayin
// 3) "Signup / Login" butonuna TIKLAYIN
// 4) "Signup / Login" sayfasina girildigini dogrulayin
// 5) "New User Signup!" Name ve Email Address gir
// 6) "Signup" buttonuna TIKLA
// 7) "ENTER ACCOUNT INFORMATION" bilgilerini gir
// 8) "Sign up for our newsletter!" onay kutusunu seçin.
// 9) "Receive special offers from our partners!" onay kutusunu seçin.
// 10) "ADDRESS INFORMATION" bilgilerini gir
// 11) Hesap olusturuldugunu dogrula

    @Test
    public void test01() {
        driver.get("http://automationexercise.com");
        Assertions.assertTrue(driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed());
    }
}
