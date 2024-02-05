package Subat5;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.apache.hc.core5.http.Message;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class C3 extends TestBase {
    @Test
    public void test01() {
        /*
        ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “Facebook” icerdigini dogrulayin (verify), degilse dogru basligi yazdirin.
        Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i  yazdirin.
        https://www.walmart.com/ sayfasina gidin.
        Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        Tekrar “facebook” sayfasina donun
        Sayfayi yenileyin
        sayfayi tam sayfa (maximize) yapin
        Sayfayi kapatin
     */
        driver.get("https://facebook.com");
        String expectedData="facebook";
        String actualData=driver.getCurrentUrl();

        Assertions.assertTrue(driver.getCurrentUrl().contains(expectedData));
        System.out.println(actualData);

        driver.get("https://www.walmart.com");
        Assertions.assertTrue(driver.getTitle().contains("Walmart.com"));
        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.quit();

    }
}
