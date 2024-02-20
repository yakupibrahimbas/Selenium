package Subat20;

import com.github.javafaker.Faker;
import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class C4 extends TestBase {
    @Test
    public void test01() {
        /*

    // https://www.saucedemo.com/ adresine gidin
    // Kullanici adini "standard_user" olarak girin
    // Şifreyi "secret_sauce" olarak girin
    // Login buttonuna tiklayin
    // Tum urunleri sepete ekleyin
    // Sepete tiklayarak gidin
    // Checkout a tiklayin
    // FirstName-LastName ve posta code unu doldurun
    // continue butonuna tiklayin
    // Toplam fiyatın 140,34$ olduğunu dogrulayin
    // finish e tiklayin
    // Checkout: Complete! yazisinin görüntülendigini doğrulayiniz
         */
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        List<WebElement> products=driver.findElements(By.xpath("//button[.='Add to cart']"));
        for (WebElement w:products){
            w.click();
        }
        driver.findElement(By.xpath("//*[@class='shopping_cart_link']")).click();
        driver.findElement(By.cssSelector("#checkout#checkout")).click();
        Faker faker=new Faker();
        driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys(faker.name().firstName());
        driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys(faker.name().lastName());
        driver.findElement(By.id("postal-code")).sendKeys(faker.address().zipCode());
        driver.findElement(By.id("continue")).click();
        ////div[@class='summary_info_label summary_total_label']
       String price= driver.findElement(By.xpath("//*[@class='summary_info_label summary_total_label']")).getText();
        Assertions.assertTrue(price.contains("$140.34"));
        driver.findElement(By.cssSelector("#finish")).click();
        String textTitle=driver.findElement(By.xpath("//*[.='Checkout: Complete!']")).getText();
        Assertions.assertTrue(textTitle.equals("Checkout: Complete!"));


    }
}
