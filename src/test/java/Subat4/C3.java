package Subat4;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C3 extends TestBase {
    /*
    sayfadaki bir webelementi locate ettigimizde eger no suchelementexception aliyorsak once locate i kontrol ederiz
    buna ragmen ayni hatayi aliyorsak locate etmek istedigimiz web element iframe icinde olabilir
    iframe icindeki bir webelementi locate edebilmek icin driveri iframe gecis yaptirmak gerekir
    1)driver.switchTo.frame(safyadaki iframe indexi) 0 dan baslar
    2)driver.switchTo.frame(iframe tragindaki id/name attribute degeri ile)
    3)driver.switchTo.frame(iframe in locateini alaral)
    eger
     */
    @Test
    public void test01() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=iframe");
        String actualText=driver.findElement(By.xpath("//*[.='An iframe with a thin black border:']")).getText();
        Assertions.assertTrue(actualText.contains("black border"));
        WebElement applicationList =driver.findElement(By.xpath(" //*[.='Applications lists']"));
        Assertions.assertTrue(applicationList.isDisplayed());
        driver.switchTo().defaultContent();//anasayfaya gecis yap
        String iframeText=driver.findElement(By.xpath("//h3")).getText();
        Assertions.assertEquals("iframe",iframeText);


    }
}
