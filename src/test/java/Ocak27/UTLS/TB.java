package Ocak27.UTLS;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class TB {

    /**
     *
     */
    public abstract class tb {
       protected WebDriver driver;

        @BeforeEach
       public void setUp() {
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }

        @AfterEach
        public void tearDown() {
            driver.quit();
        }
public void waitForSecond(int second){
    try {
        Thread.sleep(second*1000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}
public void selectVisible(){
  //  Select select=new Select();
}

    }
}
