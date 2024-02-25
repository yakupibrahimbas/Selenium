package Subat25;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C2 extends TestBase {
    @Test
    public void Test01() throws IOException {
        String dosyaYolu ="src\\test\\java\\resources\\Capitals.xlsx";
        FileInputStream fis=new FileInputStream(dosyaYolu);
        Workbook workbook= WorkbookFactory.create(fis);
        Cell cell=workbook.getSheet("Sheet1").getRow(0).getCell(1);
        System.out.println(cell);
        String actualCell=workbook.getSheet("Sheet1").getRow(2).getCell(0).toString();
        Assertions.assertEquals("France",actualCell);
        System.out.println(workbook.getSheet("Sheet1").getPhysicalNumberOfRows());
        System.out.println(workbook.getSheet("Sheet1").getLastRowNum());

    }
}
