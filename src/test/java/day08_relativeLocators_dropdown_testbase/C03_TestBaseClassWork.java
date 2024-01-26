package day08_relativeLocators_dropdown_testbase;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C03_TestBaseClassWork extends TestBase {
    public abstract class TestBase {

        protected WebDriver driver;

        @BeforeEach
        public void setUp() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }

        @AfterEach
        public void tearDown() {
            driver.quit();
        }

        //Hard wait
        public void waitForSecond(int second) {
            try {
                Thread.sleep(second * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        //DDM den visible text ile secim
        public void selectVisibleText(WebElement ddm, String option) {
            Select select = new Select(ddm);
            select.selectByVisibleText(option);
        }

        //DDM den index ile secim
        public void selectIndex(WebElement ddm, int idx) {
            Select select = new Select(ddm);
            select.selectByIndex(idx);
        }
    }



    }