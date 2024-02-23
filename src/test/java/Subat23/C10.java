package Subat23;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class C10 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");
        driver.findElement(By.xpath("//*[.='b10 all test cases, code.docx']")).click();
        waitForSecond(3);
        //"C:\Users\yakup\Downloads\b10 all test cases, code (6).docx"
        String dosyaYolu=System.getProperty("user.home")+"\\Downloads\\b10 all test cases, code (6).docx";
        Assertions.assertTrue(Files.exists(Paths.get(dosyaYolu)));

    }

    @Test
    public void test02() {
        String dosyaYolu=System.getProperty("user.home")+"\\Downloads\\b10 all test cases, code (6).docx";
        try {
            Files.delete(Paths.get(dosyaYolu));
        }catch (IOException e){
            System.err.println("Dosya Silinemedi");
        }
    }
}
