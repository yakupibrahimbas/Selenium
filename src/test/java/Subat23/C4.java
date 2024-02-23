package Subat23;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class C4 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://techproeducation.com");
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        waitForSecond(2);
        actions.sendKeys(Keys.PAGE_UP).perform();
        waitForSecond(2);
        for (int i=0;i<5;i++){
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            waitForSecond(1);

        }
        for (int i=0;i<5;i++){
            actions.sendKeys(Keys.PAGE_UP).perform();
            waitForSecond(1);

        }

    }

    @Test
    public void test02() {
        driver.get("https://techproeducation.com");
        Actions actions=new Actions(driver);
        waitForSecond(1);
        actions.sendKeys(Keys.END).perform();
        waitForSecond(1);
        actions.sendKeys(Keys.HOME).perform();

    }
}
