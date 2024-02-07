package Subat7;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C4 extends TestBase {
    //"C:\Users\yakup\OneDrive\Masaüstü\batch.txt"

    @Test
    public void test01() {
        String ortakYol="\\Masaüstü\\batch.txt";
        String dynamicPath=System.getProperty("user.home")+ortakYol;
        Assertions.assertTrue(Files.exists(Paths.get(dynamicPath)));
    }
}
