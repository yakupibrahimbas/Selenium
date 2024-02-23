package Subat23;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class C1 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://amazon.com");
        driver.findElement(By.partialLinkText("Try different image")).click();

        Set<Cookie>cookieSet=driver.manage().getCookies();
        int counter=1;
        for (Cookie w:cookieSet){
            System.out.println(counter+".cookie==>"+w);
            System.out.println(counter+".cookie Name==>"+w.getName());
            System.out.println(counter+".cookie Value==>"+w.getValue());
            System.out.println("=============");
            counter++;
        }

        int actualSize=cookieSet.size();
        Assertions.assertTrue(actualSize>5);

        String actualCookieValue=driver.manage().getCookieNamed("i18n-prefs").getValue();
        Assertions.assertEquals("USD",actualCookieValue,"Value uyumlu degil");

        Cookie cookie=new Cookie("en sevdigim cookie","cikolatali");
        driver.manage().addCookie(cookie);
        cookieSet=driver.manage().getCookies();
        int counter2=1;
        for (Cookie w:cookieSet){
            System.out.println(counter2+"cookie==>"+w);
            System.out.println(counter2+"cookie==>"+w);
            System.out.println(counter2+"cookie==>"+w);
        }





    }
}
