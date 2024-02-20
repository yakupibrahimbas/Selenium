package Subat20;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class C1 extends TestBase {
    @Test
    public void test01() {
        /*
===========Homework 3==========================
https://testpages.herokuapp.com/ adresine gidiniz
File Downloads a tiklayiniz
Acilan sayfada Server Download a tiklayiniz
Dosyanin basariyla indirildigini test ediniz

===========Homework 4==========================
https://testpages.herokuapp.com/styled/challenges/growing-clickable.html adresine gidiniz
click me buttonu na tiklayiniz
"Event Triggered" yazisinin görüntülendigini dogrulayiniz
         */
        driver.get("https://testpages.herokuapp.com/");
        Actions actions=new Actions(driver);
        WebElement fileDownloads=driver.findElement(By.xpath("//a[@id='download']"));
        actions.scrollToElement(fileDownloads).perform();
        fileDownloads.click();
        waitForSecond(2);
        String filePath=System.getProperty("user.home")+"\\Downloads\\textfile.txt";
        try{
            Files.delete(Paths.get(filePath));
        }catch (IOException e){
            System.err.println("Dosya silinmedi!");

        }
        waitForSecond(2);
        WebElement serverDownload=driver.findElement(By.xpath("//button[@id='server-download']"));
        actions.scrollToElement(serverDownload);
        serverDownload.click();
        waitForSecond(2);
        Assertions.assertTrue(Files.exists(Paths.get(filePath)));



    }
}
