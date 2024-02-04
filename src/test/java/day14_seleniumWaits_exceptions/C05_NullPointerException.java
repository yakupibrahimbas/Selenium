package day14_seleniumWaits_exceptions;

import com.github.javafaker.Faker;
import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;

public class C05_NullPointerException extends TestBase {
    Faker faker;
    @Test
    public void test01() {
        /*
        NullPointerException
        Eger bir object olusturulup assignment yapilmadan kullanilmak istenirse bu exceptionu aliriz
         */
        System.out.println(faker.name().fullName());
    }
}
