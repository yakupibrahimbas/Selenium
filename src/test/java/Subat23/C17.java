package Subat23;

import com.github.javafaker.Faker;
import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class C17 extends TestBase {
    Faker faker=new Faker();
    WebDriver driver;
    @Test
    public void name(){
        driver.get("https://google.com");
        faker=new Faker();
        System.out.println(faker.name().fullName());


    }
}
