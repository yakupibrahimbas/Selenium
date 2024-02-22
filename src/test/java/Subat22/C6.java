package Subat22;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C6 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://kitchen.applitools.com/ingredients/cookie");
      //Cookie cookie= driver.manage().getCookieNamed("protein");
      Cookie cookie=new Cookie("fruit","apple");
      driver.manage().addCookie(cookie);
      assertEquals(cookie.getValue(),driver.manage().getCookieNamed(cookie.getName()).getValue());
      Cookie originalCookie=new Cookie("fruit","apple");
      driver.manage().addCookie(originalCookie);
      Cookie editCookie=new Cookie(originalCookie.getName(),"mango");
      driver.manage().addCookie(editCookie);

    }
}
