package day18_excel_jsexecutor;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.apache.poi.ss.usermodel.*;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C02_WriteExcel{
    //mysmoketestdata.xlsx dosyasina STATUS adinda ucuncu bir sutun olusturunuz,
    //Bu sutun altinda satirlara sirasiyla valid valid ve invalid degerlerini yaziniz

    @Test
    public void writeExcel() throws IOException {

        //mysmoketestdata.xlsx dosyasina STATUS adinda ucuncu bir sutun olusturunuz,
        //Bu sutun altinda satirlara sirasiyla valid valid ve invalid degerlerini yaziniz

        FileInputStream fis = new FileInputStream("src\\test\\java\\resources\\mysmoketestdata.xlsx");
        Workbook workbook = WorkbookFactory.create(fis);

        Sheet customer_infoSheet = workbook.getSheet("customer_info");

        //Hangi satirda yazma islemi yapacaksak bunu belirtmemiz gerekir
        Row firstRow = customer_infoSheet.getRow(0);

        //ucuncu cell (sütun basligi) olusturduk
        Cell cell3 = firstRow.createCell(2);

        //ucuncu cell e status basligini atadik
        cell3.setCellValue("STATUS");

        //ikinci satirin ucuncu hucresini olusturduk ve degerini valid olarak atadik
        customer_infoSheet.getRow(1).createCell(2).setCellValue("valid");
        customer_infoSheet.getRow(2).createCell(2).setCellValue("valid");
        customer_infoSheet.getRow(3).createCell(2).setCellValue("invalid");

        //Classimizdan belirttigimiz path de bulunan dokumana aktarilmak uzere bir akis objecti olusturur
        String path ="src\\test\\java\\resources\\mysmoketestdata.xlsx";
        FileInputStream fos = new FileInputStream(path);

        //workbook a akis objecti uzerinden yazar
      //  workbook.write();

        workbook.close();
        fis.close();
        fos.close();

    }
}