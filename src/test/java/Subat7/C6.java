package Subat7;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C6 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement chooseFile= driver.findElement(By.id("file-upload"));
        String dosyaYolu=System.getProperty("user.home")+"Downloads\\b10 all test cases, code (5).docx";
        chooseFile.sendKeys(dosyaYolu);
        waitForSecond(2);
        driver.findElement(By.id("file-submit")).click();
        waitForSecond(3);

    }
}
