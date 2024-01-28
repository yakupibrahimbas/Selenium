package Ocak28;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C4 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/iframe");
        String actualText=driver.findElement(By.xpath("//h3")).getText();
        Assertions.assertTrue(actualText.contains("Editor"));
        driver.switchTo().frame("mce_0_ifr");
        WebElement textBox=driver.findElement(By.xpath("//p"));
        textBox.clear();
        textBox.sendKeys("Naberrrrr");
        driver.switchTo().parentFrame();
        WebElement elementalSelenium=driver.findElement(By.xpath("//*[.='Elemental Selenium']"));
        Assertions.assertEquals("Elemental Selenium",elementalSelenium.getText());

    }
}
