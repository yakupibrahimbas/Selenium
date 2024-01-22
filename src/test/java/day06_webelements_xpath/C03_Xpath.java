package day06_webelements_xpath;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Xpath {
    /*
    / -> Bu direkt bir childi secer
    // -> Bu belgenin herhangi bir yerindeki elementi secmek icin kullanilir
    @ -> Bir web elementin attribute unu secmek icin kullanilir
    [] -> Kosullar veya index belirtmek icin kullanilir
    * -> //* ==> ifadesi sayfadaki tum elementleri secer

    SYNTAX:
        tagName [@attributeName='attributeValue']
        //*[@*='attribute degeri']
        Not: Eger xpath ile birden fazla sonu gelirse o web elementin indexini asagidaki sekilde belirtebiliriz
        (tagName [@attributeName='attributeValue'])[index)
     */

    @Test
    public void test01() throws InterruptedException {
        //web sayfasına gidin. https://www.techproeducation.com/
        //Arama kutusunda "city bike" aratin (arama kutusunu xpath ile locate edin)
        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        //Sadece sonuc sayısını yazdırınız
        //Sonra karşınıza çıkan ilk sonucun metnine tıklayın.
        //sayfayi kapatınız

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com/");
        //WebElement searchBox=driver.findElement(By.xpath(""));
        //searchBox.sendKeys("city bike"+ Keys.ENTER);

    }
}
