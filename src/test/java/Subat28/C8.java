package Subat28;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.Arrays;

public class C8 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://google.com");
        String title = driver.getTitle();
        Assertions.assertTrue(title.contains("Google"));
        driver.findElement(By.id("APjFqb")).sendKeys("Selenium", Keys.ENTER);
        String sonuc = driver.findElement(By.id("result-stats")).getText();
        System.out.println(sonuc);
        String[] net = sonuc.split("\\.");
        System.out.println(Arrays.toString(net));
    }
}
