package Subat8;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class C2 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://www.hepsiburada.com");
        String hepsi=driver.getWindowHandle();

        driver.findElement(By.xpath("(//*[.='Giriş Yap'])[1]")).click();
        driver.findElement(By.id("register")).click();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://fakemail.net");
        String fake=driver.getWindowHandle();
        waitForSecond(5);
        driver.findElement(By.xpath("(//a[@href='#copy'])[3]")).click();
        String myMail=driver.findElement(By.xpath("//*[@class='animace']")).getText();
        driver.switchTo().window(hepsi);
        waitForSecond(5);
        WebElement lastScreen=driver.findElement(By.xpath("//input"));
        lastScreen.sendKeys(myMail);
        waitForSecond(5);
        driver.findElement(By.xpath("//button[.='Devam et']")).click();
        driver.switchTo().window(fake);
        driver.navigate().refresh();
     // driver.findElement(By.xpath("//*[@class='ns-m46kq-e-5 close-button']")).click();


        driver.findElement(By.xpath("(//td)[1]")).click();
        driver.findElement(By.xpath("//*[.='Doğrula']")).click();






    }
}
