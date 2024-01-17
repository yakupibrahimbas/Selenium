package day03_driverMethods_junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {

        // techproeducation ana sayfasina gidelim . https://www.techproeducation.com/
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.techproeducation.com/"); //driver.get() methodu ile ayni isi yapar.
        Thread.sleep(3000);

        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.ibm.com/");

        //Tekrar techproeducation sayfasina donelim
        driver.navigate().back(); //sayfaya geri donme islemi yapar <-
        Thread.sleep(3000);

        //Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
        Thread.sleep(3000);

        //Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();
        Thread.sleep(3000);

        //Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.quit();

        /*
        Thread.sleep javadan gelen bir bekletme ozelligidir. seleniumdan gelmiyor
        Test uzmanlari Thread.sleep kullanmaktan mumkun oldugunca kacinmalidir cunku gereksiz beklemelere neden olur
        Hard wait olarak adlandirilir,onumuzdeki derslerde dynamic waitleri ogrenecegiz onlari kullanmaliyiz
         */
    }
}
