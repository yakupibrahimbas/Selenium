package Subat21;

import com.github.javafaker.Faker;
import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class C3 extends TestBase {
    @Test
    public void test01() {

        /*
// https://gleeful-lamington-a9d9de.netlify.app/ adresine gidiniz
//Sayfa başlığının "Batch 210 Selenium" olarak görüntülenip görüntülenmediğini test edin
"Kullanıcı Adı" ve "Şifre" alanlarına faker ile değer girin ve formu gönderin.
// Başarılı mesajının ("Merhaba [Kullanıcı Adı]! İşlem başarılı.") olarak girilen bilgilerin
// görüntülenip görüntülenmediğini kontrol edin.
//"Kullanıcı Adı" ve "Şifre" alanlarını boş bırakın ve formu göndermeye çalışın. İslemin basarili
// bir sekilde gerceklesmedigini dogrulayin.
//Cinsiyet radio buttonlarından birini seçin ve Seçimin başarılı bir şekilde yapıldığını doğrulayın.
//"Ülke" drop-down menüsünden bir ülkeyi seçin. Seçimin başarılı bir şekilde yapıldığını doğrulayın.



//"Dersler" bölümünden birden fazla ders seçin. Seçimlerin başarılı bir şekilde yapıldığını doğrulayın.
//Sayfadaki Videoyu baslatin, daha sonra durdurun, daha sonra gönder butonunun etkilesime acik oldugunu doğrulayın.
//"Yorumlar" alanına bir yorum yazin ve yazinin basarili bir sekilde gönderildigini doğrulayin(JSEXECUTOR)
//8inci maddede belirtilen test senaryosunun extent html reporter kullanarak html raporunu alin
//Extent html reportunuzun sayfa basliginin ve test isminin sizin belirttiginiz isimler oldugunu
//otomasyon ile test edin

    */
        driver.get("https://gleeful-lamington-a9d9de.netlify.app/");
        Assertions.assertEquals("Batch 210 Selenium",driver.getTitle());
        Faker faker=new Faker();
        driver.findElement(By.cssSelector("#username")).sendKeys(faker.name().username());
        driver.findElement(By.cssSelector("#password")).sendKeys(faker.internet().password());
        driver.findElement(By.xpath("//*[@value='Gönder']")).click();
        WebElement messageBox=driver.findElement(By.cssSelector("#messageBox"));
        Assertions.assertTrue(messageBox.isDisplayed());

    }

    @Test
    public void test02() {
        driver.get("https://gleeful-lamington-a9d9de.netlify.app/");
        driver.findElement(By.xpath("//*[@value='Gönder']")).click();
        JavascriptExecutor js=(JavascriptExecutor) driver;

        String alertText=(String)js.executeScript("return document.querySelector('#username').validationMessage;");
        System.out.println(alertText);
        WebElement alertElement=(WebElement) js.executeScript("return document.querySelector('#username');");
        WebElement countryDropdown= driver.findElement(By.xpath("//select[@id='country']"));
        selectVisibleText(countryDropdown,"İngiltere");
        String selectedOption = new Select(countryDropdown).getFirstSelectedOption().getText();
        Assertions.assertEquals("İngiltere", selectedOption);
        WebElement radio=driver.findElement(By.cssSelector("#male"));
        radio.click();
        Assertions.assertTrue(radio.isSelected());
        WebElement checkBox1=driver.findElement(By.cssSelector("#java"));
        checkBox1.click();
        WebElement checkBox2=driver.findElement(By.cssSelector("#html-css"));
        checkBox2.click();
        Assertions.assertTrue(checkBox1.isSelected());
        Assertions.assertTrue(checkBox2.isSelected());
        Actions actions = new Actions(driver);
        actions.scrollToElement(driver.findElement(By.xpath("//iframe"))).perform();
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//button[@title='Play']")).click();
        driver.findElement(By.xpath("//button[@title='Pause (k)']")).click();
        driver.switchTo().parentFrame();//gonder butonu parant framede o yuzden geciyorum aksi halde goremeyecek
        WebElement submitButton= driver.findElement(By.xpath("//input[@type='submit']"));
        Assertions.assertTrue(submitButton.isEnabled());

    }
}
