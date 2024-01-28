package Ocak28;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class C2 extends TestBase {
    /*
    Alert
    Eger bir sayfadaki butona tikladigimizda bir uyari penceresi aciliyorsa ve bu acilan pencereye sag tiklayarak inspect yapamiyorsak bu javascript alerttir
    JavaScript alerti handle yapabilmek icin driverimizi o acilan pencereye gecirmemiz gerekecek
    Bunu switchTo() methodu ile alert()methodunu secerek yapariz
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
    public void dismissAlert() {
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        driver.switchTo().alert().dismiss();//cancel butonuna basar
        String actualResultMessage=driver.findElement(By.cssSelector("#result")).getText();
        String unExpectedResultMessage="successfuly";
        Assertions.assertFalse(actualResultMessage.contains(unExpectedResultMessage));



    }
}
