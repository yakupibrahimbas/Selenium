package day08_relativeLocators_dropdown_testbase;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C02_DropDownMenu {
    /*
    DropDown menuyu automate etmek icin
    1-Dropdown webelementini locate etmeliyiz
    2-select objecti olusturulur
    3-select objecti uzerinden cesitli methodlar kullanarak dropdown seceneklerine3 erisim saglariz
    SYNTAX
    Select select=new Select(DDM Webelementi);
    a)selectByVisible()->DD MEnu deki gorunur metin ile secmek icin kullanilir
    b)selectByIndex()->index ile secmek icin kullanilir(index sifirdan baslar)
    c)selectByValue()->value attribute degeri ile secmek icin kullanilir(option tag i ile baslar)
    d)getOptions()-> Locatini aldigimiz DD menudeki tum secenekleri bize verir
    e)getFirstSelectedOptions()->Dropdown menudeki secili olan secenegi bbize verir
     */
    /*
   Given kullanici https://testcenter.techproeducation.com/index.php?page=dropdown sayfasindayken
   -3 farklı test methodu oluşturalım
       1.Method:
           a. Yil,ay,gün dropdown menu'leri locate ediniz
           b. Select objesi olustur
           c. Select object i kullaarak 3 farkli sekilde secim yapiniz
       2.Method:
           a. Tüm eyalet isimlerini yazdıralım
       3.Method:
           a. State dropdownindaki varsayilan secili secenegin 'Select a State' oldugunu verify edelim

    */ WebDriver driver;

    @BeforeEach
    public void setUp() {
       driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
    }

    @Test
    public void test01() throws InterruptedException {
        WebElement year=driver.findElement(By.id("year"));
        WebElement month=driver.findElement(By.id("month"));
        WebElement day=driver.findElement(By.id("day"));

        Select selectYear=new Select(year);
        Select selectMonth=new Select(month);
        Select selectDay=new Select(day);
        selectYear.selectByIndex(0);//index 0 dan basladigi icin birinci elementi secmis olduk
        Thread.sleep(3000);
        selectMonth.selectByValue("4");//value degerine secer
        Thread.sleep(3000);
        selectDay.selectByVisibleText("15");//->ekranda gorulen degere gore secilir

    }



    @Test
    public void test02() {
        WebElement eyaletler = driver.findElement(By.cssSelector("#state"));
        Select select = new Select(eyaletler);
        List<WebElement> eyaletlerListesi = select.getOptions();
        for (WebElement w : eyaletlerListesi) {
            System.out.println("w.getText() = " + w.getText());
            //2.yol
            //   eyaletlerListesi.forEach(t-> System.out.println(t.getText())); //lambda
        }

    }

    @AfterEach
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }
}
