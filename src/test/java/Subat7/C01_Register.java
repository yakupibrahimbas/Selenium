package Subat7;

import com.github.javafaker.Faker;
import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C01_Register extends TestBase {
    @Test
    void registerTest() {

        Faker faker = new Faker();

        // Title: TrvlCar | Premium Car Rental
        // URL: https://www.trvlcar.com/
        driver.get("https://www.trvlcar.com/");
        Assertions.assertEquals("https://www.trvlcar.com/", driver.getCurrentUrl(), "Sayfa Testi Failed");
        Assertions.assertEquals("TrvlCar | Premium Car Rental",driver.getTitle(), "Sayfa Testi Failed");

        // Login Register Button
        WebElement loginRegisterButton = driver.findElement(By.xpath("//a[@href='/auth']"));
        loginRegisterButton.click();

        // Register Button
        WebElement registerButton = driver.findElement(By.xpath("//button[@data-rr-ui-event-key='register']"));
        registerButton.click();

        // First Name
        WebElement firstNameTextBox = driver.findElement(By.cssSelector("input[name='firstName']"));
        firstNameTextBox.sendKeys(faker.name().firstName());

        // Last Name
        WebElement lastNameTextBox = driver.findElement(By.cssSelector("input[name='lastName']"));
        lastNameTextBox.sendKeys(faker.name().lastName());

        //Phone Number
        WebElement phoneNumberTextBox = driver.findElement(By.cssSelector("input[name='phoneNumber']"));
        phoneNumberTextBox.click();
        phoneNumberTextBox.sendKeys("1234567890");

        // address
        WebElement addressTextBox = driver.findElement(By.cssSelector("input[name='address']"));
        addressTextBox.sendKeys(faker.address().fullAddress());

        // Zip Code
        WebElement zipCodeTextBox = driver.findElement(By.cssSelector("input[name='zipCode']"));
        zipCodeTextBox.sendKeys(faker.address().zipCode());

        // e-Mail
        WebElement emailTextBox = driver.findElement(By.xpath("(//input[@name='email'])[2]"));
        emailTextBox.sendKeys("alican6@ali.com");

        // Password
        WebElement passwordTextBox = driver.findElement(By.xpath("(//input[@name='password'])[2]"));
        passwordTextBox.sendKeys("Deneme1?");

        // Confirm Password
        WebElement confirmPasswordTextBox = driver.findElement(By.cssSelector("input[name='confirmPassword']"));
        confirmPasswordTextBox.sendKeys("Deneme1?");

        // Register Save Button
        WebElement registerSaveButton = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
        registerSaveButton.click();

        waitForSecond(5);

        WebElement onayMesaji = driver.findElement(By.xpath("//div[contains( text(), 'You are registered successfully')]"));

        System.out.println(onayMesaji.getText());

        Assertions.assertTrue(onayMesaji.getText().contains("You are registered successfully"));

    }
}