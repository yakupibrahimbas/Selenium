package Subat10;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class C1 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/tables");
       WebElement table1= driver.findElement(By.xpath("//table[1]"));
        System.out.println(table1.getText());
       WebElement thirdRow= driver.findElement(By.xpath("//table[1]/tbody/tr[3]"));
        System.out.println(thirdRow);
        /*
        Xpath kullaniminda eger bir webtabledan son satiri dynamic olarak almak istersek index yerine last() function kullanabiliriz

         */
        List<WebElement>fifthColumn=driver.findElements(By.xpath("//table[1]/tbody/tr/td[5]"));
        for (WebElement w:fifthColumn){
            System.out.println(w.getText());

        }
        fifthColumn.forEach(t-> System.out.println(t.getText()));
        System.out.println("============");
        printData(2,3);

    }

    private void printData(int satir, int sutun) {
        WebElement webElement=driver.findElement(By.xpath("//table[1]/tbody/tr["+satir+"]/td["+sutun+"]"));
        System.out.println(webElement.getText());
    }
}
