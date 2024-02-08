package Subat8;

import com.github.javafaker.Faker;
import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class C1 extends TestBase {
    @Test
    public void test01() {
        Faker faker=new Faker();
        driver.get("https://trvlcar.com");
        String trvlcarHandle=driver.getWindowHandle();
        Assertions.assertEquals("https://www.trvlcar.com/",driver.getCurrentUrl(),"HATA VAR");
        Assertions.assertEquals("TrvlCar | Premium Car Rental",driver.getTitle(),"HATA VAR");
        WebElement registerButton=driver.findElement(By.xpath("//*[.=' Login/Register']"));
        registerButton.click();
        driver.findElement(By.xpath("//button[@data-rr-ui-event-key=\"register\"]")).click();
        WebElement firstName=driver.findElement(By.xpath("//input[@name='firstName']"));
        firstName.sendKeys(faker.name().firstName());
        WebElement lastName=driver.findElement(By.xpath("//input[@name='lastName']"));
        lastName.sendKeys(faker.name().lastName());
        WebElement telephoneNumber=driver.findElement(By.xpath("//input[@name='phoneNumber']"));
        telephoneNumber.click();
        telephoneNumber.sendKeys(faker.phoneNumber().cellPhone());
        WebElement adress= driver.findElement(By.xpath("//input[@name='address']"));
        adress.sendKeys(faker.address().fullAddress());
        WebElement zipCode= driver.findElement(By.xpath("//input[@name='zipCode']"));
        zipCode.sendKeys(faker.address().zipCode());

        waitForSecond(3);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.fakemail.net/");
        String fakeMailHandle=driver.getWindowHandle();
        driver.findElement(By.xpath("(//a[@href='#copy'])[3]")).click();
        String myMail=driver.findElement(By.xpath("//*[@class='animace']")).getText();

        System.out.println(myMail);
        waitForSecond(2);
        driver.switchTo().window(trvlcarHandle);
        waitForSecond(2);
        driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys(myMail);
        waitForSecond(3);
       WebElement password= driver.findElement(By.xpath("(//input[@name='password'])[2]"));
        password.sendKeys("Yakup.?10");
       WebElement confirmPassword=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
       confirmPassword.sendKeys("Yakup.?10",Keys.TAB,Keys.ENTER);
       WebElement enter= driver.findElement(By.xpath("(//input[@name='email'])[1]"));
       enter.sendKeys(myMail);
       WebElement password2=driver.findElement(By.xpath("(//input[@name='password'])[1]"));
       password2.sendKeys("Yakup.?10",Keys.TAB,Keys.ENTER);





    }
}
