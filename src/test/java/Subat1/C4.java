package Subat1;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class C4 extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//*[contains(text(),'Add E')]")).click();
        Thread.sleep(3000);

    }
}
