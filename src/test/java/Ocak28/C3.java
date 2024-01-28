package Ocak28;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C3 extends TestBase {
    /*
    sayfadaki bir webelementi locate ettigimizde eger no such exception aliyorsak once locateyi kontrol ederiz
    Buna ragmen ayni hatayi aliyorsak locate etmek istedigimiz web element iframe icinde olabilir
    Dolayisiyla iframe icindeki bir web elementi locate edebilmek icin driveri iframe gecis yaptirmak gerekir.
    1)driver.switchTo.frame(sayfadaki iframe indexini index 0 dan baslar
    2)driver.switchTo.frame)
     */
    @Test
    public void test01() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=iframe");
        String actualText=driver.findElement(By.xpath("//*[.='An iframe with a thin black border:']")).getText();
        Assertions.assertTrue(actualText.contains("black border"));
        driver.switchTo().frame(0);
        WebElement applicationList=driver.findElement(By.xpath("//*[.='Applications lists']"));
        Assertions.assertTrue(applicationList.isDisplayed());
        driver.switchTo().defaultContent();
       String iframeText= driver.findElement(By.xpath("//h3")).getText();
        Assertions.assertEquals("iframe",iframeText);
    }
}
