package day15_exception_screenshots;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C01_StaleElementReferenceException extends TestBase {
         /*
    StaleElementReferenceException nasil alinir?
    => Bir sayfadaki bir webelementi locate ettikten ve bunu bir webelemenet seklinde sakladiktan sonra o sayfada herhangi bir yenileme islemi
    (navigate.refresh(), back(), forward()) yapildiginda locate ni aldiginimiz webelementi tekrar kullanmak istersek bu exceptionu aliriz

    Bu hatayi nasil handle ederiz?
    => Bu exceptionu handle etmek icin locate i (navigate.refresh(), back(), forward()) methodlari kullanildiginda tekrar almaliyiz
     */

    @Test
    public void name() {
        driver.get("https://techproeducation.com");
        WebElement searchBox = driver.findElement(By.id("searchHeaderInput"));
        driver.navigate().refresh();
        searchBox = driver.findElement(By.id("searchHeaderInput"));
        searchBox.sendKeys("suan bu webelemenet fresh");
    }


    @Test
    public void illegalArgument() {
        //InvalidArgumentException -> Bir method parametresine gecersiz bir arguman gonderirsek aliriz
        driver.get("123454654");
    }

    @Test
    public void invalidSelector() {
        //Belirtilen bir locator gecersiz oldugunda ortaya cikar
        driver.get("https://techproeducation.com");
        WebElement searchBox = driver.findElement(By.cssSelector("//*searchHeaderInput"));
    }

    //WebDriverException -> WebDriver ile ilglii kurulum, yada versiyon uyumsuzluklari yada internet kesintisi vs..
    //ElementClickInterceptedException -> Bir webelementin baska bir webelement (pop-up, reklam) tarafindan engellenmesi durumunda alinir

}