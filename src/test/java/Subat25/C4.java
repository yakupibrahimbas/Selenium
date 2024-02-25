package Subat25;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.apache.poi.ss.usermodel.*;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C4 extends TestBase {
    @Test
    public void Test01() throws IOException {
        FileInputStream fis=new FileInputStream("src/test/java/resources/mysmoketestdata.xlsx");
        Workbook workbook= WorkbookFactory.create(fis);
        Sheet customer_infoSheet= workbook.getSheet("customer_info");
        Row firstRow=customer_infoSheet.getRow(0);
        Cell cell3=firstRow.createCell(2);
        cell3.setCellValue("STATUS");
        customer_infoSheet.getRow(1).createCell(2).setCellValue("valid");
        customer_infoSheet.getRow(2).createCell(2).setCellValue("valid");
        customer_infoSheet.getRow(3).createCell(2).setCellValue("invalid");
        String path="src/test/java/resources/mysmoketestdata.xlsx";
        FileOutputStream fos=new FileOutputStream(path);
        workbook.write(fos);
        workbook.close();
        fis.close();
        fos.close();

    }
}
