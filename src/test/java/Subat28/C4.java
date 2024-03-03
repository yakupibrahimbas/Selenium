package Subat28;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C4 extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //Add Element butonuna basin
        WebElement addElementButton = driver.findElement(By.cssSelector("button[onclick='addElement()' ]"));
        addElementButton.click();
        Thread.sleep(3000);

        //Delete butonu'nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.cssSelector("button[class='added-manually' ]"));
        Assertions.assertTrue(deleteButton.isDisplayed());

        //Delete tusuna basin
        Thread.sleep(3000);
        deleteButton.click();

        //"Add/Remove Elements" yazisinin gorunur oldugunu test edin
        WebElement addRemoveText = driver.findElement(By.cssSelector("h3"));
        Assertions.assertTrue(addRemoveText.isDisplayed());

        //sayfayı kapatınız
        driver.quit();
    }
}