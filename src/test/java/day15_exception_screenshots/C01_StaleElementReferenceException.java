package day15_exception_screenshots;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C01_StaleElementReferenceException extends TestBase {
        /*
    StaleElementReferenceException nasil alinir?
    ==> bir sayfadaki bir webelementi locate ettikten ve bunu bir webelement seklinde sakladiktan sonra o sayfada herhangi bir yenileme islemi yapildiginda(navigate.refresh) o web elementi
    tekrar kullanmak istersek bu exception aliriz
    Bu hatayi nasil handle ederiz
    Bu exceptionu handle etmek icin locatei (navigate.refresh back forward) methodlari kullanildiginda tekrar almaliyiz.

         */
    @Test
    public void test01() {

        driver.get("https://techproeducation.com");
        WebElement searchBox=driver.findElement(By.id("searchHeaderInput"));

        driver.navigate().refresh();

        searchBox=driver.findElement(By.id("searchHeaderInput"));

        searchBox.sendKeys("su an bu webelement fresh");

    }

    @Test
    public void illegalArgument() {
        //invalidargumentexception-> bir method parametresine gecersiz bir arguman gonderirsek aliriz
        driver.get("12345");
    }

    @Test
    public void invalidSelector() {
        //Belirtilen bir locator gecersiz oldugunda ortaya cikar
        WebElement searchBox=driver.findElement(By.cssSelector("searchHeaderInput"));
    }
    //webdriverexception ->webdriver ile ilgili kurulum yada versiyon uyumsuzluklari yada internet kesnitisi vs...
    //ElementClickInterceptedException-> bir webelementin baska bir webelement tarafindan engellenmesi durumunda alinir.


}
