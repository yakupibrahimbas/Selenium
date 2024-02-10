package day18_excel_jsexecutor;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class C05_JSExecutorScroll extends TestBase {
    @Test
    public void test01() {
        //https://testpages.herokuapp.com/ adresine gidiniz
        //Challenges a kadar scroll yapiniz
        driver.get("https://testpages.herokuapp.com/ ");
       WebElement challenges= driver.findElement(By.xpath("//h2[.='Challenges']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)",challenges);


    }
}
