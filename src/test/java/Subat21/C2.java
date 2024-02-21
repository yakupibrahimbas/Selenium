package Subat21;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class C2 extends TestBase {
    /*
     //Bir "Name" sütunu oluşturup isimlerini excel doyasına yazınız:
    //("ayhan","beyhan","ceyhan","ali","veli","ahmet","can","sam","kate","raj","pam")
    FileInputStream fis = new FileInputStream("src/test/java/resources/mysmoketestdata.xlsx");
    Workbook workbook = WorkbookFactory.create(fis);

    List<String> userinfo = Arrays.asList("Name", "ayhan", "beyhan", "ceyhan", "ali", "veli", "ahmet", "can", "sam", "kate", "raj", "pam");

    userinfo.forEach(t -> workbook.getSheet("customer_info").getRow(userinfo.indexOf(t)).createCell(3).setCellValue(t));

    FileOutputStream fos = new FileOutputStream("src/test/java/resources/mysmoketestdata.xlsx");
    workbook.write(fos);

    workbook.close();
    fis.close();
    fos.close();


     */

 /*
  @Test
  void homework() throws IOException {
    Bir "Name" sütunu oluşturup isimlerini excel doyasına yazınız:
    ("ayhan","beyhan","ceyhan","ali","veli","ahmet","can","sam","kate","raj","pam")

    FileInputStream fis=new FileInputStream("src/test/java/resources/mysmoketestdata.xlsx");
    Workbook work= WorkbookFactory.create(fis);
    Sheet ınfo= work.getSheet("customer_info");
    List<String> name= Arrays.asList("ayhan","bayhan","ceyhan","ali","veli","ahmet","can","sam","kate","raj","pam");
    int i = 0;
     for (String w : name) {
        ınfo.getRow(i).createCell(3).setCellValue(w);
        i++;
    }
    FileOutputStream fos = new FileOutputStream("src\\test\\java\\resources\\mysmoketestdata.xlsx");
   work.write(fos);
   work.close();
   fis.close();
   fos.close();
}

    */



}
