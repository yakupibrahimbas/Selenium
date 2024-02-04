package Subat4;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class C2 extends TestBase {

    /*
    Eger bir sayfada bir butona tikladigimnizda uyari aliyorsak ve inspect yapaiyorsak js alerrttir
    Js yi handle edenbilmek icin drivermizi acilan pencereye switch to methodu ile gecirmemiz gerekir
     */
    @Test
    public void acceptAlert() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        driver.switchTo().alert().accept();
        String actualResultMessage=driver.findElement(By.cssSelector("#result")).getText();
        String expectedResultMessage="You successfully clicked an alert";
        Assertions.assertEquals(expectedResultMessage,actualResultMessage);



    }

    @Test
    public void test02() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

        driver.switchTo().alert().dismiss();
        String actualResultMessage=driver.findElement(By.cssSelector("#result")).getText();
        String unExpectedResultMessage="successfuly";
        Assertions.assertFalse(actualResultMessage.contains(unExpectedResultMessage));
        //icerir kodunun false oldugunu dogrulamaliyiz


    }

    @Test
    public void test03() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        driver.switchTo().alert().sendKeys("Yakup");
        driver.switchTo().alert().accept();
        String actualResultMessage=driver.findElement(By.cssSelector("#result")).getText();
        Assertions.assertTrue(actualResultMessage.contains("Yakup"));

    }
}
