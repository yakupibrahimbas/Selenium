package Subat19;

import com.github.javafaker.Faker;
import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class C4 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://facebook.com");

      driver.findElement(By.xpath("//*[@ajaxify='/reg/spotlight/']")).click();
        Faker faker=new Faker();
       WebElement name= driver.findElement(By.xpath("//*[@name='firstname']"));
       name.sendKeys(faker.name().firstName());
        WebElement lastName= driver.findElement(By.xpath("//*[@name='lastname']"));
        lastName.sendKeys(faker.name().lastName());
        WebElement phoneNumber= driver.findElement(By.xpath("//*[@name='reg_email__']"));
        phoneNumber.sendKeys("5463111111");
        WebElement password= driver.findElement(By.xpath("//*[@name='reg_passwd__']"));
        password.sendKeys("Yakup.34");
       WebElement birthday= driver.findElement(By.xpath("//*[@aria-label='Gün']"));
       birthday.sendKeys("15");
        WebElement month= driver.findElement(By.xpath("//*[@aria-label='Ay']"));
        month.sendKeys("Mar");
        WebElement year= driver.findElement(By.xpath("//*[@aria-label='Yıl']"));
        year.sendKeys("1992");
        WebElement gender=driver.findElement(By.xpath("(//*[@name='sex'])[2]"));
        gender.click();
        Assertions.assertTrue(gender.isSelected());
        WebElement button=driver.findElement(By.xpath("(//*[@type='submit'])[2]"));
        button.click();






    }
}
