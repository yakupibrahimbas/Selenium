package day01_DriverIlkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C01_Driver {
    public static void main(String[] args) {
        /*
        ChromeDriver, selenium'dan gelen komutlari alir ve chrome'un anlayacagi sekilde cevirir
        Bunun icin javadan System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");kodu ile SEleniuma chromeDriver in konumu bildirerek
        chrome browserin dogru bir sekilde baslatilmasini saglayabiliriz
         */

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();//bos bir chrome browser acar
        driver.get("https://www.google.com");//get methodu ile string olarak belirttigimiz urle gideriz
        driver.quit();//oturumu sonlandirir


    }


}
