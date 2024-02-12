package day19_jsexecutor_log4j;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class C05 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement button=driver.findElement(By.xpath("//button"));
        for (int i = 1; i <= 100; i++) {
            button.click();
        }
        List<WebElement> deleteButtonElements = driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
        for (int i = 1; i <=90 ; i++) {
            deleteButtonElements.get(i).click();
        }
        List<WebElement>deleteButtonElements2=driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
        Assertions.assertEquals(10,deleteButtonElements2.size());
    }
}
