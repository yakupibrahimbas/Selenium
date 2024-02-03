package Subat3;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
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

public class C5  {
    WebDriver driver;
    @BeforeEach
    public void setUp() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
    }




    @Test
    public void test01() {
        /*
        Dropdown wwebelementini locate etmeliyiz
        select objecti olusturulur
        Select objecti uzerinden cesitli methodlar kullanarak dropdown seceneklerine erisim saglariz
        SYNTAX
        select select=new Select(ddm webelement);
        selectbyvisibleText()--> DD menu deki gorunur metin ile secmek icin kullanilir
        selectByIndex()-> index ile secmek icin kullanilir(index 0 dan baslar)
        selectByValue-> value attribute degeri ile secmek icin kullanilir(option tagi ile baslar)
        getoption()-> locatini aldigimiz DD menudeki tum secenekleri bize verir
        getFirstSelectedOption()->Dropdown menudeki secili olan secenegi bize verir
                 */


WebElement year=driver.findElement(By.id("year"));
WebElement month=driver.findElement(By.id("month"));
WebElement day=driver.findElement(By.id("day"));
        Select selectYear=new Select(year);
        Select selectMonth=new Select(month);
        Select selectDay=new Select(day);

        selectYear.selectByIndex(0);
        selectMonth.selectByValue("0");
        selectDay.selectByVisibleText("15");



    }



    @Test
    public void test02() {
        WebElement eyaletler=driver.findElement(By.cssSelector("#state"));
        Select select=new Select(eyaletler);
        List<WebElement>eyaletlerlistesi=select.getOptions();
        for (WebElement w:eyaletlerlistesi){
            System.out.println(w.getText());
        }



    }
    @Test
    public void test03() {
        
    }
    @AfterEach
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
