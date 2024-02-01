package Subat1;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class C1 extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://google.com");
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("Java", Keys.ENTER);
        Thread.sleep(3000);
        List<WebElement>links=driver.findElements(By.tagName("a"));
        System.out.println("linksayisi:"+links.size());
        for (WebElement w:links){
          if (!w.getText().isEmpty()){
              System.out.println(w.getText());
          }
        }

    }
}
