package Ocak31;

import com.github.javafaker.Faker;

public class C02 {
    public static void main(String[] args) {
        Faker faker=new Faker();
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        System.out.println("faker.internet().emailAddress() = " + faker.internet().emailAddress());

        System.out.println("faker.address().fullAddress() = " + faker.address().fullAddress());
        System.out.println("faker.address().country() = " + faker.address().country());
        System.out.println("faker.internet().password() = " + faker.internet().password());
    }
}
