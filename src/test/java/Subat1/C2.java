package Subat1;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C2 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://techproeducation.com");
       WebElement searchBox= driver.findElement(By.id("searchHeaderInput"));
       String actualTagName=searchBox.getTagName();
       String expectedTagName="input";
        Assertions.assertEquals(actualTagName,expectedTagName);

       String actualAttributeValue= searchBox.getAttribute("class");
        String expectedAttributeValues="form-input";
        Assertions.assertEquals(expectedAttributeValues,actualAttributeValue);


    }
}
