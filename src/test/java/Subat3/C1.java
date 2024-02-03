package Subat3;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C1 extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//*[contains(text(),'Add E')]")).click();
        Thread.sleep(3000);
        WebElement deleteButton=driver.findElement(By.xpath("//*[.='Delete']"));
        Assertions.assertTrue(deleteButton.isDisplayed());
        deleteButton.click();
        WebElement addRemoveText=driver.findElement(By.xpath("/h3"));
        Assertions.assertTrue(addRemoveText.isDisplayed());
        driver.quit();

    }
}
