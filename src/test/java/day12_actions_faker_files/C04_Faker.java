package day12_actions_faker_files;

import com.github.javafaker.Faker;
import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;

public class C04_Faker {
    @Test
    public void test01() {

        Faker faker=new Faker();

        //faker objesi ile fake bir isim yazdırınız
        String firstName=faker.name().firstName();
        System.out.println("first name"+firstName);
        //faker objesi ile fake bir soyisim yazdırınız
        System.out.println(faker.name().lastName());
        //faker objesi ile fake bir adress yazdırınız
        System.out.println(faker.address().fullAddress());
        //faker objesi ile fake bir telefon No yazdırınız
        System.out.println(faker.phoneNumber().phoneNumber());
        //faker objesi ile fake bir email yazdırınız
        System.out.println("faker.internet().emailAddress() = " + faker.internet().emailAddress());
        //faker objesi ile fake bir rastgele 15 haneli bir sayi yazdırınız
        System.out.println("faker.number().digits(15) = " + faker.number().digits(15));
        //faker objesi ile fake bir isimsoyisim yazdırınız
        System.out.println("faker.name().fullName() = " + faker.name().fullName());


    }
}
