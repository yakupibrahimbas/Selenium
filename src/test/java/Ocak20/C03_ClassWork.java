package Ocak20;

import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ClassWork {
    WebDriver driver;

    @BeforeAll
   public static void beforeAll() {
        System.out.println("Testler calismaya basladi");

    }

    @BeforeEach
    public void setUp() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void test01() {
        driver.get("https://google.com");
    }
    @Test
    public void test02() {
        driver.get("https://facebook.com");
    }
    @Test
    public void test03() {
        driver.get("https://mynet.com");
    }

    @AfterEach
    public void tearDown() {
        driver.close();

    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Testlerin calismasi tamamlandi");
    }
}
