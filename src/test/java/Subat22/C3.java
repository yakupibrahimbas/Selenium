package Subat22;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C3 extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement baslikText=driver.findElement(By.xpath("//div//h3"));
        String expectedResult="An iFrame containing the TinyMCE WYSIWYG Editor";
        String actualResult=baslikText.getText();
        if (actualResult.equals(expectedResult)){
            System.out.println("Baslik Testi:Passed");
            System.out.println(actualResult);
        }
        WebElement iframe=driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(iframe);
        WebElement textElement=driver.findElement(By.tagName("p"));
        Thread.sleep(3);
        textElement.click();
        textElement.sendKeys("Merhaba dunya");
    }
}
