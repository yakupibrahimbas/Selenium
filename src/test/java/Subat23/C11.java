package Subat23;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C11 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement chooseFile=driver.findElement(By.id("file-upload"));
        String dosyaYolu=System.getProperty("user.home")+"\\Downloads\\C01_ActionsClassWork.java";
        chooseFile.sendKeys(dosyaYolu);
        waitForSecond(2);
        driver.findElement(By.id("file-submit")).click();
        waitForSecond(3);
        String text=driver.findElement(By.xpath("//h3")).getText();
        Assertions.assertEquals("File Uploaded!",text);




    }
}
