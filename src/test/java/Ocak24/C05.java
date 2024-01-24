package Ocak24;

import Ocak24.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C05 extends TestBase {
    // https://demo.guru99.com/test/radio.html
// checkbox1 ve checkbox3 seçili değilse seçin
// checkbox1 ve checkbox3 seçili olduğunu test edein
// checkbox2 elementinin seçili olmadığını test edin

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://demo.guru99.com/test/radio.html");

        WebElement checkBox1=driver.findElement(By.id("vfb-6-0"));
        WebElement checkBox2=driver.findElement(By.id("vfb-6-1"));
        WebElement checkBox3=driver.findElement(By.id("vfb-6-2"));

        if (!checkBox1.isSelected()){
            checkBox1.click();
        }
        if (!checkBox3.isSelected()){
            checkBox3.click();
            Thread.sleep(3000);
        }
        Assertions.assertTrue(checkBox1.isSelected(),"CheckBox1 secili degil");
        Assertions.assertTrue(checkBox3.isSelected(),"CheckBox2 secili degil");
        Assertions.assertFalse(checkBox2.isSelected(),"CheckBox1 e tiklanmadi");

    }
}
