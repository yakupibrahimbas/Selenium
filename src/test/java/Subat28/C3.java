package Subat28;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C3 extends TestBase {
    @Test
    public void test01() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testcenter.techproeducation.com/index.php");

        WebElement backToButton = driver.findElement(By.partialLinkText("Back to TechProEducation.com"));
        Assertions.assertTrue(backToButton.isEnabled());
        WebElement applicationsLists = driver.findElement(By.tagName("h1"));
        Assertions.assertTrue(applicationsLists.isDisplayed());
        driver.quit();
    }
}