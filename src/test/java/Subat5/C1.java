package Subat5;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class C1 extends TestBase {
    @Test
    public void test01() {
        /*
        Cooki denildiginde aklimiza manage()methodu gelmelidir
        cookiler ile ilgili tum islemleri bu method sayesinde yapabiliriz

         */
        driver.get("https://amazon.com");
        driver.findElement(By.partialLinkText("Try different image")).click();
       Set<Cookie>cookiSet= driver.manage().getCookies();
        int counter=1;
       for (Cookie w:cookiSet){
           System.out.println(counter+" .cookie => " + w);
           System.out.println("==================");
           counter++;
       }
int actualSize=cookiSet.size();
        Assertions.assertTrue(actualSize>5);

    String actualCookieValue= driver.manage().getCookieNamed("i18n-prefs").getValue();
    Assertions.assertEquals("",actualCookieValue);
    Assertions.assertEquals("AUSD",actualCookieValue,"Value uyumlu degil");


    }
}
