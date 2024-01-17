package day03_driverMethods_junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ImplicityWait {
    public static void main(String[] args) {
        /*
        Nasilki bir web sayfasinin manuel olarak actigimizda maximize yapiyorsak otomasyon ilede maximize yapmaliyiz.
        Cunku driver tum web elementleri net bir şekilde
        Bir web sayfasina gittigimizde internet yada baska sebeplerle web elementler hemen olusmayabilir. dolayisiyla islem yapilmak istenen web element bulunamayacagi icin hata aliriz.
        Bu nedenle implicitly wait kullanarak isimizin cogunu hallederiz.
        Bazi extra dinamik beklemeler icin explicit wait kullanmayi ogrenecegiz.
        Implicity wait sayfadaki web elementlerin olusturulmasini maximum olarak belirttigimiz sure kadar
        eger bu sure dolmadan yukleme gerceklesirse driver beklemeye devam etmez yoluna devam eder
         */


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //techpro sayfasına gidiniz
        driver.get("https://www.techproeducation.com");

        //sayfa başlığının TechPro Education olduğunu test ediniz
       String expectionData="TechPro Education";
       String actualData=driver.getTitle();
       if (actualData.equals(expectionData)){
           System.out.println("Test Passed");
       }else {
           System.out.println("Test Failed");
       }

        //facebook sayfasına gidiniz

        driver.get("https://facebook.com");
        //sayfa url'inin facebook içerdiğini test ediniz
        if (driver.getCurrentUrl().contains("facebook")){
            System.out.println("Sayfa urlsi facebook icerir");
        }else {
            System.out.println("Sayfa urlsi facebook icermez");
        }

        //techpro sayfasına geri dönününüz
        driver.navigate().back();
        //Geri döndüğünüzü test ediniz
        actualData=driver.getTitle();
        if (actualData.contains(expectionData)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        //sayfayı kapatınız
        driver.quit();




          }

}
