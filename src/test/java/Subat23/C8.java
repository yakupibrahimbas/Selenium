package Subat23;

import com.github.javafaker.Faker;
import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C8 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://facebook.com");
        driver.findElement(By.xpath("//*[@rel='async']")).click();
        Faker faker=new Faker();
        driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys(faker.name().firstName());
        driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys(faker.name().lastName());
        driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("5343222222");
        driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys(faker.internet().password());
        driver.findElement(By.xpath("//*[@name='birthday_day']")).sendKeys("20");
        driver.findElement(By.xpath("//*[@name='birthday_month']")).sendKeys("Mar");
        driver.findElement(By.xpath("//*[@name='birthday_year']")).sendKeys("2000");
      WebElement radio= driver.findElement(By.xpath("(//*[@class='_8esa'])[2]"));
      radio.click();
        driver.findElement(By.xpath("//*[@name='websubmit']")).click();

     //   Assertions.assertTrue(radio.isSelected());










    }
}
