package day14_seleniumWaits_exceptions;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C03_NoSuchelementException extends TestBase {
    /*
    NoSuchElementexception aliyorsak;
    1-yanlis locate almis olabiliriz
    2-wait/syncronization problemi olabilir, implicity waitte yeterli sure kadar bekledigimizden emin oluruz, yeterli degilse o sureyi artiririz
    3-Locateini aldigimiz webelement iframe icindeyse ve iframe e gecis yapmazsak bu hatayi aliriz
    4-Bazi sayfalarda locate etmek istedigimiz webelement sayfasinin altinda olabilir ve driver bunu goremeyebilir
    Dolayisiyla scroll yaparak drivera bu webelementi gostererek hatayi handle edebiliriz
    5-Sayfadaki bir butona tiklama sonucunda yeni bir sayfa yada sekme acildiysa ve yeni acilan sayfaya driveri gecis yaptirmazsak bu sayfadaki webelementi bulamaz ve bu hatayi aliriz

     */

    @Test
    public void test01() {
        driver.get("https://techproeducation.com");
        WebElement searhBox=driver.findElement(By.id("serachHeaderInput"));
        searhBox.sendKeys("Batch210");

    }
}
