package Subat22;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.Set;

public class C4 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://demo.guru99.com/popup.php");
        String firstWin= driver.getWindowHandle();
        String firstWinUrl=driver.getCurrentUrl();
        System.out.println("baslangic penceresi"+firstWinUrl);
        driver.findElement(By.xpath("//a[.='Click Here']")).click();

        Set<String> windowAllWindows=driver.getWindowHandles();
        for (String window:windowAllWindows){
            driver.switchTo().window(window);
        }

        driver.findElement(By.xpath("//*[@name='emailid']")).sendKeys("ali@h.com", Keys.TAB,Keys.ENTER);
        System.out.println("2.pencerenin Urli"+ driver.getCurrentUrl());
        driver.close();
        //Set pencere değişimi icin kullanildi

    }
}
