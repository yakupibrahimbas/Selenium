package Ocak22;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03 {

    /*
        /  -> Bir alt childi secer
        // -> Sayfadaki herhangi bir webelementi secer  //div
        @  -> Bir webelementin attributunu secmek icin kullanilir
        [] -> Index veya kosul belirtmek icin kullanilir
        D.O.M. -> Document Object Model ->> Web browserlar ile entegre olarak UI da görmüs oldugumuz webelementlerin html dilindeki temisilini icerir
        * -> Herhangi bir webelementi secer (farketmeksizin)
        //tagName [ @ attribute ismi = 'attribute degeri' ]
        //*[@*='attribute degeri']
       (//tagName [ @ attribute ismi = 'attribute degeri' ]) [ index]

     */

    @Test
    public void test01() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        Thread.sleep(15000);

        //Arama kutusunda "city bike" aratin (arama kutusunu xpath ile locate edin)
        //tagName [ @ attribute ismi = 'attribute degeri' ]
        WebElement searchBox =driver.findElement(By.xpath("//input[@type='text']"));
        searchBox.sendKeys("city bike", Keys.ENTER);


        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement aramaSonucu = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        System.out.println("aramaSonucu.getText() = " + aramaSonucu.getText());
        System.out.println("aramaSonucu.getText().split(\" \")[2] = " + aramaSonucu.getText().split(" ")[2]);

        //Sadece sonuc sayısını yazdırınız


        //Sonra karşınıza çıkan ilk sonucun metnine tıklayın.
        //sayfayi kapatınız
    }
}