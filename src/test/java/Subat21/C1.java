package Subat21;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C1 extends TestBase {
    @Test
    public void test01() {
        /*
        ===========Homework 7==========================
     https://demo.guru99.com/test/drag_drop.html adresine gidin
     Sayfayi kesfederek turuncu webelementleri uygun kutulara sürükleyin
     Perfect! yazisinin görüntülendigini test edin
         */
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        Actions actions=new Actions(driver);

        WebElement drag1=driver.findElement(By.xpath("//li[@data-id='2'][1]"));
        WebElement drop1=driver.findElement(By.id("amt7"));
        actions.dragAndDrop(drag1,drop1).perform();

        WebElement drag2= driver.findElement(By.xpath("//li[@data-id='2'][2]"));
        WebElement drop2=driver.findElement(By.id("amt8"));
        actions.dragAndDrop(drag2,drop2).perform();

        WebElement dragBank=driver.findElement(By.xpath("//li[@data-id='5']"));
        WebElement dropBank=driver.findElement(By.xpath("//ol[@id='bank']"));
        actions.dragAndDrop(dragBank,dropBank).perform();

        WebElement dragSales=driver.findElement(By.xpath("//li[@data-id='6']"));
        WebElement dropSales=driver.findElement(By.xpath("//ol[@id='loan']"));
        actions.dragAndDrop(dragSales,dropSales).perform();

        WebElement bank=driver.findElement(By.xpath("//*[.=' BANK ']"));
        WebElement bankdrop=driver.findElement(By.xpath("//*[@class='placeholder']"));
        actions.dragAndDrop(bank,bankdrop).perform();













       //Actions actions=new Actions(driver);
       //WebElement drag1=driver.findElement(By.xpath("//li[@data-id='2'][1]"));
       //WebElement drop1=driver.findElement(By.id("amt7"));
       //actions.dragAndDrop(drag1,drop1).perform();












      // WebElement drag2= driver.findElement(By.xpath("//li[@data-id='2'][2]"));
      // WebElement drop2=driver.findElement(By.id("amt8"));
      // actions.dragAndDrop(drag2,drop2).perform();
      // WebElement dragBank=driver.findElement(By.xpath("//li[@data-id='5']"));
      // WebElement dropBank=driver.findElement(By.xpath("//ol[@id='bank']"));
      // actions.dragAndDrop(dragBank,dropBank).perform();
      // WebElement dragSales=driver.findElement(By.xpath("//li[@data-id='6']"));
      // WebElement dropSales=driver.findElement(By.xpath("//ol[@id='loan']"));
      // waitForSecond(2);
      // WebElement perfectText=driver.findElement(By.xpath("//a[@class='button button-green']"));
      // actions.scrollToElement(perfectText).click();
      // waitForSecond(2);
      // Assertions.assertTrue(perfectText.isDisplayed());

    }
}
