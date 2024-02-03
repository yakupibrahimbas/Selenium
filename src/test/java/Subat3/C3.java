package Subat3;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C3 extends TestBase {
    //cssSelector X pathe gore daha hizli calisir

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addElementButton=driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        WebElement deleteButton=driver.findElement(By.cssSelector("button[class='added-manually']"));
        Assertions.assertTrue(deleteButton.isDisplayed());
        Thread.sleep(3000);



    }
}
