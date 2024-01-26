package day09_testbase_alert_iframe;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C04_Iframe extends TestBase {
    //https://the-internet.herokuapp.com/iframe sayfasına gidiniz
    //Kalın yazının "Editor" kelimesini içerdiğini doğrulayınız
    //Textbox içindeki yazıyı siliniz.
    //Sildiğiniz yazı yerine "Bu textbox iFrame içinde yer almaktadır" yazınız.
    //Sayfadaki "Elemental Selenium" yazısının olduğunu doğrulayınız.
    @Test
    public void test01() {
      driver.get("https://the-internet.herokuapp.com/iframe");
     String actualText= driver.findElement(By.xpath("//h3")).getText();
        Assertions.assertTrue(actualText.contains("Editor"));
        driver.switchTo().frame("mce_0_ifr");
        WebElement textBox=driver.findElement(By.xpath("//p"));
        textBox.clear();
        textBox.sendKeys("Bu textbox iFrame içinde yer almaktadır");
        driver.switchTo().parentFrame();
        WebElement elementalSelenium = driver.findElement(By.xpath("//*[.='Elemental Selenium']"));
        Assertions.assertEquals("Elemental Selenium",elementalSelenium.getText());


    }
}
