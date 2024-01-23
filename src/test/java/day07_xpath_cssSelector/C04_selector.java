package day07_xpath_cssSelector;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_selector {
    /*
    Syntax:
    tagname [attribute='attributeValue']
    eger id ile css locate almak istersek #idAttributeValue
    eger class ile css locate almak isersek. classAttributeValue
    xpath ile cssselector arasindaki fark
    cssSelector x pathe gore daha hizli calisir
    X path ile bir webelement icin birden fazla sonu verirse index ile bunu teke dusurebiliriz
    Fakat cssSelector ile index kullanamayiz
    x path ile bir webelementi sadece text i ile locate edebilirsiniz
     */
    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://www.facebook.com");
    }
}