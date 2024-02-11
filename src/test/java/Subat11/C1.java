package Subat11;

import com.github.javafaker.Faker;
import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class C1 extends TestBase {

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
    void test01() {


        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        List<WebElement> urunsec = driver.findElements(By.xpath("//button[.='Add to cart']"));
        urunsec.forEach(t->t.click());
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        driver.findElement(By.cssSelector("#checkout")).click();
        Faker faker=new Faker();
        WebElement firstName= driver.findElement(By.id("first-name"));
        firstName.sendKeys(faker.name().firstName(), Keys.TAB,faker.name().lastName(),Keys.TAB,faker.address().zipCode());
        driver.findElement(By.id("continue")).click();

        WebElement summary = driver.findElement(By.xpath("//div[@class='summary_info_label summary_total_label']"));
        Actions actions = new Actions(driver);
        actions.scrollToElement(summary).perform();
        Assertions.assertEquals("Total: $140.34",summary.getText());


    }
}