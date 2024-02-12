package Subat11;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class C3 extends TestBase {
    @Test
    public void test01() throws IOException {
        FileInputStream fis=new FileInputStream("src/test/java/resources/mysmoketestdata.xlsx");
        Workbook workbook= WorkbookFactory.create(fis);
        List<String>userinfo= Arrays.asList("Name", "ayhan", "beyhan", "ceyhan", "ali", "veli", "ahmet", "can", "sam", "kate", "raj", "pam");
        userinfo.forEach(t->workbook.getSheet("customer_info").getRow(userinfo.indexOf(t)).createCell(3).setCellValue(t));
        FileOutputStream fos=new FileOutputStream("src/test/java/resources/mysmoketestdata.xlsx");
        workbook.write(fos);
        workbook.close();
        fis.close();
        fos.close();
    }

    @Test
    public void test02() {
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement drop=driver.findElement(By.xpath("//select[@id='dropdown']"));
        WebElement option1=driver.findElement(By.xpath("//option[.='Option 1']"));
        selectIndex(drop,1);
        waitForSecond(5);

    }
}
