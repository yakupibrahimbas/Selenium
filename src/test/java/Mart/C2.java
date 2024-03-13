package Mart;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WindowType;

public class C2 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://www.techproeducation.com");

        Assertions.assertTrue(driver.getTitle().contains("TechPro Education"));
        String techProWindowHandle = driver.getWindowHandle();
        Assertions.assertTrue(driver.getTitle().contains("TechPro Education"));
        driver.switchTo().newWindow(WindowType.WINDOW);//yeni bir pencere actik
        driver.get("https://www.youtube.com");
        String youtubeWindowHandle = driver.getWindowHandle();
        waitForSecond(2);
        driver.switchTo().newWindow(WindowType.WINDOW);//yeni bir pencere actik
        driver.get("https://www.linkedin.com");
        String linkedinWindowHandle = driver.getWindowHandle();
        waitForSecond(2);
        driver.switchTo().window(techProWindowHandle);
        waitForSecond(2);
        driver.switchTo().window(youtubeWindowHandle);
        waitForSecond(2);
        /*
        Acilms olan tum pencerelerin window handle degerlerini getWindowHandles methodu ile aldik
        Bu set bir set return eder. ancak setlerde index kullanarak istedigimiz bir elemani secmek mumkun degildir
        Lislerde get() methodu saysende index kullanarak istedigimiz pencereye rahatlikla gecis yapabiliriz
         */

    }
}