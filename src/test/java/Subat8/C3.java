package Subat8;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C3 extends TestBase {
    /*
    StaleElementReferenceException nasil alinir?
    ==> bir sayfadaki bir web elementi locate ettikten sonra
     */

    @Test
    public void test01() {
        driver.get("https://techproeducation.com");
       WebElement searchBox= driver.findElement(By.id("searchHeaderInput"));
       driver.navigate().refresh();
       searchBox=driver.findElement(By.id("searchHeaderInput"));
       searchBox.sendKeys("suan bu webelement fresh");
    }

    @Test
    public void test02() {
        //illegalArgumentException-> bir method parametresine gecersiz bir arguman gonderirsek aliriz
        driver.get("https://1231313");

    }

    @Test
    public void test03() {
        //belirtilen bir locator gecersiz oldugunda ortaya cikar
        driver.get("https://techproeducation.com");
        WebElement searchBox=driver.findElement(By.cssSelector("/*searchHeaderInput"));

        //WebDriverException -> WebDriver ile ilgili kurulum yada versiyon uyumsuzlukları yada internet kesntisi vs.
        //ElementClickInterceptedException -> Bir webelementin baska bir webelement(pop-up, reklam) tarafindan engellenmesi durumunda alinir

    }
}
