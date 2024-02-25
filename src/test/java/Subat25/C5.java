package Subat25;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C5 extends TestBase {
    @Test
    public void test01() throws IOException {
        FileInputStream fis=new FileInputStream("src/test/java/resources/mysmoketestdata.xlsx");
        Workbook workbook= WorkbookFactory.create(fis);
        Sheet customer_infoSheet= workbook.getSheet("customer_info");
        customer_infoSheet.getRow(0).createCell(3).setCellValue("Name");
        customer_infoSheet.getRow(1).createCell(3).setCellValue("ayhan");
        customer_infoSheet.getRow(2).createCell(3).setCellValue("beyhan");
        customer_infoSheet.getRow(3).createCell(3).setCellValue("ceyhan");
        customer_infoSheet.getRow(4).createCell(3).setCellValue("ali");
        customer_infoSheet.getRow(5).createCell(3).setCellValue("veli");
        customer_infoSheet.getRow(6).createCell(3).setCellValue("ahmet");
        customer_infoSheet.getRow(7).createCell(3).setCellValue("can");
        customer_infoSheet.getRow(8).createCell(3).setCellValue("sam");
        customer_infoSheet.getRow(9).createCell(3).setCellValue("kate");
        customer_infoSheet.getRow(10).createCell(3).setCellValue("raj");
        customer_infoSheet.getRow(11).createCell(3).setCellValue("pam");
        FileOutputStream fos=new FileOutputStream("src/test/java/resources/mysmoketestdata.xlsx");
        workbook.write(fos);
        workbook.close();
        fis.close();
        fos.close();


    }
}
