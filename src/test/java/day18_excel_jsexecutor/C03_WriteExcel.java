package day18_excel_jsexecutor;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_WriteExcel extends TestBase {

    /*
     Bir "Name" sütunu oluşturup isimlerini excel doyasına yazınız:
     ("ayhan","beyhan","ceyhan","ali","veli","ahmet","can","sam","kate","raj","pam")
 */
    @Test
    public void test01() throws IOException {
        FileInputStream fis = new FileInputStream("src\\test\\java\\resources\\mysmoketestdata.xlsx");
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet customer_infoSheet = workbook.getSheet("customer_info");
        customer_infoSheet.getRow(0).createCell(3).setCellValue("Name");
        customer_infoSheet.getRow(1).createCell(3).setCellValue("ayhan");
        customer_infoSheet.getRow(1).createCell(3).setCellValue("ayhan");
        customer_infoSheet.getRow(1).createCell(3).setCellValue("ayhan");
        customer_infoSheet.getRow(1).createCell(3).setCellValue("ayhan");
        customer_infoSheet.getRow(1).createCell(3).setCellValue("ayhan");
        customer_infoSheet.getRow(1).createCell(3).setCellValue("ayhan");
        customer_infoSheet.getRow(1).createCell(3).setCellValue("ayhan");
        customer_infoSheet.getRow(1).createCell(3).setCellValue("ayhan");
    }
}
