package Subat11;

import com.github.javafaker.Faker;
import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C2 extends TestBase {
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
    @Test
    public void test01() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();

        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        driver.findElement(By.xpath("//*[@name='checkout']")).click();
        Faker faker = new Faker();
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys(faker.name().firstName());
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys(faker.name().lastName());
        WebElement zipCode = driver.findElement(By.id("postal-code"));
        zipCode.sendKeys(faker.address().zipCode());
        driver.findElement(By.xpath("//input[@name='continue']")).click();
        driver.findElement(By.cssSelector("#finish")).click();
       WebElement summary= driver.findElement(By.xpath("//*[.='Checkout: Complete!']"));



    }
}
