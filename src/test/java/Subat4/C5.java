package Subat4;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WindowType;

public class C5 extends TestBase {
    /*
    Eger bir sayfaya gittikten sonra yeni sekme yada yeni bir pencere acmak istersek bunun icin driver.switchTo().newWindow() methodu kullanmaliyiz
    Bu method sizden method parantezi icinde yeni acilacak olan sayfanin bir sekmemi yeni bir penceremi oldugunu belirtmek icin yapariz
    driver.switvhTo().newWindow(windowType.Window) yeni bir pencere acar ve driveri buraya gecis yaptirir
    eger handle degeri ile bir sayfaya gecis yapmak istersek bu defada driver.switchTo().window () methodunu kullanşiriz ve parantez icinde gecis yapmak istedihimiz sayfanin handle degerini belirtiriz

     */
    @Test
    public void test01() {
    driver.get("https://techproeducation.com");
    String techProWindowHandle=driver.getWindowHandle();
    Assertions.assertTrue(driver.getTitle().contains("TechPro Education"));
    driver.switchTo().newWindow(WindowType.WINDOW);
    driver.get("https://youtube.com");
    String youtubeWindowHandle=driver.getWindowHandle();
    driver.switchTo().newWindow(WindowType.WINDOW);
    driver.get("https://linkedin.com");
    waitForSecond(2);
    String linkedinWindowHandle=driver.getWindowHandle();
    driver.switchTo().window(techProWindowHandle);
        waitForSecond(2);
    driver.switchTo().window(youtubeWindowHandle);
        waitForSecond(2);
    driver.switchTo().window(linkedinWindowHandle);

    }
}
/*
acilmis olan tum pencerelerin window handle degerlerini getwindowhandles methodu ile aldik
Bu method bir set return eder, ancak setlerde index kullanarak istedigimiz bir elemani secmek mumkun degildir
Bu nedenle bizde bu seti kullanarak bir tane list olusturduk
Listlerde get() methodu saysenimde index kullanarak istedigimiz pencereye rahatlikla gecis yapabiliriz
Listlerde get () methodu saysende index kullanarak index kullanarak
 */