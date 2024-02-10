package day18_excel_jsexecutor;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class C04_JSExecutorClick extends TestBase {
    @Test
    public void test01() {
        //amazon sayfasina gidelim
        //sayfadaki sell linkine tikalayalim
        driver.get("https://amazon.com");
       WebElement sellLinki= driver.findElement(By.xpath("//*[.='Sell']"));
       sellLinki.click();
    }

    @Test
    public void test02() {
        driver.get("https://amazon.com");
        WebElement sellLinki= driver.findElement(By.xpath("//*[.='Sell']"));

       JavascriptExecutor jse= (JavascriptExecutor) driver;
       jse.executeScript("arguments[0].click();",sellLinki);

    }

    @Test
    public void test03() {

    }
}
