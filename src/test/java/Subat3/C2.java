package Subat3;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C2 extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://facebook.com");
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        Thread.sleep(3000);
       WebElement female= driver.findElement(By.xpath("//input[@value='1']"));
       WebElement male= driver.findElement(By.xpath("//input[@value='2']"));

       if (!male.isSelected()){
           male.click();
       }
    }

}
