package Subat24;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.nio.file.WatchEvent;
import java.util.List;

public class C9 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/tables");
        WebElement table1=driver.findElement(By.xpath("//table[1]"));
        System.out.println(table1.getText());
        System.out.println("================");

        WebElement thirdRow=driver.findElement(By.xpath("//table[1]/tbody/tr[3]"));
        System.out.println(thirdRow.getText());
        System.out.println("==========");
        WebElement lastRow=driver.findElement(By.xpath("//table[1]/tbody/tr[  last()  ]"));
        System.out.println(lastRow.getText());
        System.out.println("===============");
        List<WebElement>fifthColumn=driver.findElements(By.xpath("//table[1]/tbody/tr/td[5]"));
        fifthColumn.forEach(t-> System.out.println(t.getText()));
        System.out.println("================");
        printData(2,3);
        printData(3,3);
        printData(1,2);

    }

    private void printData(int satir, int sutun) {
        WebElement webElement=driver.findElement(By.xpath("//table[1]/tbody/tr[\"+satir+\"]/td[\"+sutun+\"]"));
        System.out.println(webElement.getText());
    }
}
