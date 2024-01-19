package day04_junit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C01_jUnitFirstTest {
    @Test
    public void test(){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://techproeducation.com");
        driver.close();//Driver in en son uzerinde islem yaptigi pencereyi kapatir
        //driver.quit(); bizim otomasyon ile actigimiz birden fazla sekme veya pencere kapatmak icin kullanilir


    }
    @Test
    public void test02() {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://facebook.com");
        driver.close();
    }
    @Test
    public void test03() {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://mynet.com");
        driver.close();
    }
}
