package Subat5;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class C5 extends TestBase {
    @Test
    public void test01() {
       /*
https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
Add Element butonuna basin 100 kez basınız
Delete butonuna 90 kez basınız
Ve 90 kez basıldığını doğrulayınız
*/
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addElementButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        for (int i = 0; i < 99; i++) {
            addElementButton.click();
        }

        for (int i = 0; i < 90; i++) {
            WebElement deleteButton = driver.findElement(By.xpath("//button[@onclick='deleteElement()'][1]"));
            deleteButton.click();


        }
    }
}
