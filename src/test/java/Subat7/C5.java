package Subat7;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C5 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");
        driver.findElement(By.partialLinkText("b10 all test cases")).click();
        waitForSecond(5);
        //"C:\Users\yakup\Downloads\b10 all test cases, code (3).docx"
        String dosyaYolu=System.getProperty("user.home")+"Downloads\\b10 all test cases, code (5).docx";
        Assertions.assertTrue(Files.exists(Paths.get(dosyaYolu)));

    }
}
