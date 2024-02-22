package Subat22;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class C2 extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://amazon.com");
        WebElement dropdownElement= driver.findElement(By.cssSelector("#searchDropdownBox"));
        Select select=new Select(dropdownElement);
        //3 türlü secim yapabiliriz
        select.selectByIndex(3);
        System.out.println("3.index"+select.getFirstSelectedOption().getText());
        select.selectByValue("search-alias=stripbooks-intl-ship");
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByVisibleText("Digital Music");
        System.out.println("visible text"+select.getFirstSelectedOption().getText());
        Thread.sleep(3);
        List<WebElement > optionList=select.getOptions();
        int sayac=0;
        System.out.println("Tum liste");
        for (WebElement w:optionList){
            System.out.println(sayac);
            sayac++;
        }
    }
}
