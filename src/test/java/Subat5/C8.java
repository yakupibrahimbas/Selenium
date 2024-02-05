package Subat5;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C8 extends TestBase {
    @Test
    public void test01() {

        driver.get("https://www.techproeducation.com");
        Actions actions=new Actions(driver);
        actions.scrollByAmount(0,2000).perform();
        waitForSecond(5);
        actions.scrollByAmount(0,-1000).perform();



    }

    @Test
    public void test02() {
        driver.get("https://www.techproeducation.com");
        WebElement eventText=driver.findElement(By.xpath("//h2[.='Events']"));
        Actions actions=new Actions(driver);
        actions.scrollByAmount(0,eventText.getLocation().getY()).perform();
        waitForSecond(5);
    }
}
