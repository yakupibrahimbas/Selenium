package Subat1;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class C3 extends TestBase {
    /*
    XPath
    direk bir child secilir.
    Bir web elementin attributeunu secmek icin kullanilir
    Bir webelementin attributeunu secmek icin kullanilir

    tagName [attributeName='attributeValue']
    //*[@*='attributet degeri']
     */

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://amazon.com");
        Thread.sleep(15000);
        WebElement searchBox=driver.findElement(By.xpath("//input[@type='text']"));
        searchBox.sendKeys("city bike"+ Keys.ENTER);
       WebElement aramaSonucu= driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        System.out.println("arama sonucu.getText"+aramaSonucu.getText());
        System.out.println("aramaSonucu.getText().split(\" \")[2] = " + aramaSonucu.getText().split(" ")[2]);
        driver.findElement(By.xpath("(//h2)[2]/a")).click();
        driver.quit();

    }
}
