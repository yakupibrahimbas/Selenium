package Subat20;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C2 extends TestBase {
    @Test
    public void test01() {
        /*
         //===========Homework 4==========================
    //https://testpages.herokuapp.com/styled/challenges/growing-clickable.html adresine gidiniz
    //click me buttonu na tiklayiniz
    //"Event Triggered" yazisinin görüntülendigini dogrulayiniz
         */
        driver.get("https://testpages.herokuapp.com/styled/challenges/growing-clickable.html");
        waitForSecond(5);
        driver.findElement(By.xpath("//*[@onclick]")).click();
        waitForSecond(1);
       String text= driver.findElement(By.xpath("//*[.='Event Triggered']")).getText();
        Assertions.assertEquals("Event Triggered",text);

    }
}
