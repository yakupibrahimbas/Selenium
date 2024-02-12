package day19_jsexecutor_log4j;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class C06 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://google.com");
       String title= driver.getTitle();
        Assertions.assertTrue(driver.getTitle().contains(title),"Title is not contain google");
        driver.findElement(By.id("APjFqb")).sendKeys("selenium", Keys.ENTER);
      String result= driver.findElement(By.id("result-stats")).getText();
        int resultInt=Integer.parseInt(result.split(" ")[1].replaceAll(",",""));
        Assertions.assertTrue(resultInt>10000000);
    }
}
