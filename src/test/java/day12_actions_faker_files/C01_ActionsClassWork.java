package day12_actions_faker_files;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C01_ActionsClassWork extends TestBase {
    @Test
    public void test01() {
        //Techproeducation sayfasina gidelim
        //Event yazisina kadar scroll yapalim
        driver.get("https://techproeducation.com");
        Actions actions=new Actions(driver);
        actions.scrollByAmount(0,2000).perform();
        waitForSecond(5);
        actions.scrollByAmount(0,-1000).perform();
        waitForSecond(5);
    }
    @Test
    public void test02() {
        //Techproeducation sayfasina gidelim
        //Event yazisina kadar scroll yapalim
        driver.get("https://techproeducation.com");
       WebElement eventText= driver.findElement(By.xpath("//h2[.='Events']"));

        Actions actions=new Actions(driver);
        actions.scrollByAmount(0,eventText.getLocation().getY()).perform();

        Assertions.assertTrue(eventText.isDisplayed());
    }

    @Test
    public void test03() {
        driver.get("https://techproeducation.com");
        WebElement eventText= driver.findElement(By.xpath("//h2[.='Events']"));
        Actions actions=new Actions(driver);
        actions.scrollToElement(eventText).perform();
    }
}
