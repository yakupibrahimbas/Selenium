package Subat6;

import com.github.javafaker.Faker;
import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class C2 {
    @Test
    public void test01() {
        Faker faker=new Faker();
       String firstName= faker.name().firstName();
        System.out.println("firstName = " + firstName);
        String lastName=faker.name().lastName();
        System.out.println("lastName = " + lastName);
        System.out.println("faker.address() = " + faker.address());
        System.out.println("faker.address().fullAddress() = " + faker.address().fullAddress());
        System.out.println("faker.number().randomNumber() = " + faker.number().randomNumber());
        System.out.println("faker.internet().emailAddress() = " + faker.internet().emailAddress());

    }

    @Test
    public void test02() {
        Locale locale=new Locale("TR");
        Faker faker=new Faker();
        String firstName= faker.name().firstName();
        System.out.println("firstName = " + firstName);
        String lastName=faker.name().lastName();
        System.out.println("lastName = " + lastName);
        System.out.println("faker.address() = " + faker.address());
        System.out.println("faker.address().fullAddress() = " + faker.address().fullAddress());
        System.out.println("faker.number().randomNumber() = " + faker.number().randomNumber());
        System.out.println("faker.internet().emailAddress() = " + faker.internet().emailAddress());
    }
}
