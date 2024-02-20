package Subat20;

import com.github.javafaker.Faker;
import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class C3 extends TestBase {
    @Test
    public void test01() {
        /*
https://testpages.herokuapp.com/styled/basic-html-form-test.html adresine gidin.
Username adını, Password ve textArea bolumlerini faker ile doldurun
Bir dosya seçin ve yükleyin
Tüm checkbox lari secin
Radio button da radio 1 i secin
Dropdown menü den 2'yi seçin
submit'e tıklayın
Yüklenen dosyanin Form bilgilerinde yer aldığını doğrulayın
         */
        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
        Faker faker=new Faker();
        WebElement username=driver.findElement(By.xpath("//*[@name='username']"));
        username.sendKeys(faker.name().username());
        WebElement password=driver.findElement(By.xpath("//*[@name='password']"));
        password.sendKeys(faker.number().digits(10));
        WebElement textera=driver.findElement(By.xpath("//*[@name='comments']"));
        textera.sendKeys(faker.lorem().paragraph());
    //  String filePath=System.getProperty("user.home")+"\\Masaüstü\\ONE MORE\\referans.txt";
    // WebElement x= driver.findElement(By.xpath("//*[@name='filename']"));
    //   x.sendKeys(filePath);
        driver.findElement(By.xpath("//*[@value='cb1']")).click();
        driver.findElement(By.xpath("//*[@value='cb2']")).click();
        driver.findElement(By.xpath("//*[@value='cb3']")).click();
        driver.findElement(By.xpath("//*[@value='rd1']")).click();
        driver.findElement(By.xpath("//*[@name='dropdown']")).sendKeys("Drop Down Item 3");
        driver.findElement(By.xpath("//*[@value='submit']")).click();


    }
}
