package Ocak27;

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

public class C3 {
    /*
    DropDown menuyu automate etmek icin
    1-dropdown webelementini locate etmeliyiz.
    2-select objecti olusturulur
    3-Select objecti uzerinden cesitli methodlar kullarak dropdown seceneklerine erisim saglariz

     */
    WebDriver driver;
    @BeforeEach
    public void setUp() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

    }

    @Test
    public void test01() throws InterruptedException {
      WebElement year= driver.findElement(By.id("year"));
      WebElement month= driver.findElement(By.id("month"));
      WebElement day= driver.findElement(By.id("day"));
        Select selectYear=new Select(year);
        Select selectMonth=new Select(month);
        Select selectDay=new Select(day);
        selectYear.selectByIndex(0);
        Thread.sleep(3000);
        selectMonth.selectByValue("4");
        Thread.sleep(3000);
        selectDay.selectByVisibleText("15");

    }



    @Test
    public void test02() {
       WebElement eyaletler= driver.findElement(By.cssSelector("#state"));
       Select select=new Select(eyaletler);
       List<WebElement>eyaletlerListesi= select.getOptions();
       for (WebElement w:eyaletlerListesi){
           System.out.println(w.getText());
       }
     //  eyaletlerListesi.forEach(t-> System.out.println(t.getText()));


    }

    @Test
    public void test03() {
       // List<WebElement>eyaletlerListesi= driver.findElement(By.xpath("//select[@id='state']/option"));

    }

    @AfterEach
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
       // driver.quit();
    }
}
