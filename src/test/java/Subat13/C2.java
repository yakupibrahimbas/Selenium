package Subat13;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class C2 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://facebook.com");
        String title=driver.getTitle();
        Assertions.assertTrue(title.contains("Facebok"),title);
        String url=driver.getCurrentUrl();
        Assertions.assertTrue(url.contains("facebook"),url);
        driver.get("https://www.walmart.com/");
       String title2= driver.getTitle();



    }
}
