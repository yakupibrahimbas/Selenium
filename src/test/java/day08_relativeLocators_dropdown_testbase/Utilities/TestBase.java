package day08_relativeLocators_dropdown_testbase.Utilities;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

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
public void waitForSecond(int second) throws InterruptedException {
        Thread.sleep(second*1000);
}
//select VisibleText DDM
public void selectVisible(WebElement ddm,String opt){
    Select select=new Select(ddm);
    select.selectByVisibleText(opt);
}

}
