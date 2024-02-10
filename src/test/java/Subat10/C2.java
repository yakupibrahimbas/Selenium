package Subat10;

import org.apache.poi.ss.usermodel.*;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C2 {
    @Test
    public void test01() throws IOException {
        //Projemizde resources package altina koydugumuz excell dosyamizin yolunu almaliyiz
        String dosyaYolu="src\\test\\java\\resources\\Capitals.xlsx";
        FileInputStream fis=new FileInputStream(dosyaYolu);
        Workbook workbook= WorkbookFactory.create(fis);
        Sheet sheet=workbook.getSheet("Sheet1");
        System.out.println(workbook.getSheet("Sheet1").getRow(0).getCell(0));
    }
}
