package Subat24;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.apache.poi.ss.usermodel.*;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C10 extends TestBase {
    @Test
    public void test01() throws IOException {
            String dosyaYolu="src/test/java/resources/Capitals.xlsx";
        FileInputStream fis=new FileInputStream(dosyaYolu);
        Workbook workbook= WorkbookFactory.create(fis);
        Sheet sheet=workbook.getSheet("Sheet1");
        Row row=sheet.getRow(0);
        Cell cell= row.getCell(0);
        System.out.println(cell);

    }

    @Test
    public void test02() throws IOException {
        String dosyaYolu ="src\\test\\java\\resources\\Capitals.xlsx";
        FileInputStream fis=new FileInputStream(dosyaYolu);
        Workbook workbook=WorkbookFactory.create(fis);
        System.out.println(workbook.getSheet("Sheet1").getRow(0).getCell(0));

    }
}
