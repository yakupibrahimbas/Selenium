package day17_webtables_excell;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_Excel {
    @Test
    public void test01() throws IOException {

        //Örnek 1: Capitals.xlsx dosyasından 1. satır 2. sütundaki hücreyi yazdırın
        //Örnek 2: 3. Satır 1. sütun değerini yazdırın ve "France" olduğunu test edin
        //Örnek 3: Kullanılan satır sayısın bulun
        //Örnek 4: Sayfadaki son satırin index ini yazdırınız
        //Örnek 5: Excel sayfasindaki datalari COUNTRY,CAPITALS (Ülke-Başkent) key-value şeklinde console a yazdiriniz
        // {{USA,D.C},{FRANCE,PARIS}....}

        String dosyaYolu="src\\test\\java\\resources\\Capitals.xlsx";
        FileInputStream fis=new FileInputStream(dosyaYolu);
        Workbook workbook= WorkbookFactory.create(fis);
       Cell cell= workbook.getSheet("Sheet1").getRow(0).getCell(1);
        System.out.println(cell);
       String actualCell= workbook.getSheet("Sheet1").getRow(2).getCell(0).toString();
        Assertions.assertEquals("France",actualCell);
        System.out.println(workbook.getSheet("Sheet1").getPhysicalNumberOfRows());
        //getPhysicalNumberOfRows()methodu ici dolu olan satirlarin sayisini verir
        //sayi verdigi icin index 0 dan baslamaz
        //kullanilan satir sayisini bulun
        workbook.getSheet("Sheet1").getLastRowNum();
    }
}
