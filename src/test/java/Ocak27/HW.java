package Ocak27;

import Ocak24.utilities.TestBase;
import Ocak27.UTLS.TB;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class HW extends TestBase {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://html.com/tags/iframe/");
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//button[@title='Oynat']")).click();
        driver.switchTo().defaultContent();

    }
}
