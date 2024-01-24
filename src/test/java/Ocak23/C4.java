package Ocak23;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C4 {
    @Test
    public void test01() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addElementButton=driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        addElementButton.click();
        Thread.sleep(3000);
        WebElement deleteButton=driver.findElement(By.cssSelector("button[class='added-manually']"));
        Assertions.assertTrue(deleteButton.isDisplayed());
        Thread.sleep(3000);
        deleteButton.click();
        WebElement addRemoveText=driver.findElement(By.cssSelector("h3"));
        Assertions.assertTrue(addRemoveText.isDisplayed());
        driver.quit();

    }
}
