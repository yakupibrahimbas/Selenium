package Subat5;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class C4 extends TestBase {
    @Test
    public void test01() {
          /*
            homework
       https://www.google.com/ adresine gidin
       cookies uyarisi cikarsa kabul ederek kapatin
       Sayfa basliginin “Google” ifadesi icerdigini test edin
       Arama cubuguna “Selenium” yazip aratin
       Bulunan sonuc sayisini yazdirin
       sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
       Sayfayi kapatin
     */
        driver.get("https://google.com");
        String pageTitle= driver.getTitle();
        Assertions.assertTrue(driver.getTitle().contains("Google"));
        driver.findElement(By.cssSelector("#APjFqb")).sendKeys("selenium", Keys.ENTER);
        WebElement sonuc=driver.findElement(By.id("result-stats"));
        System.out.println(sonuc);
        String sonucDegeri=sonuc.getText().split(" ")[1];
        sonucDegeri.replace(".","");
        System.out.println(sonucDegeri);



    }
}
