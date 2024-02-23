package Subat23;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C9 extends TestBase {
    @Test
    public void test01() {
        System.out.println(System.getProperty("user.dir"));
        String yol="\\Masaüstü\\HSTLKLAR,.xlsx\"";
        String path=System.getProperty("user.home")+yol;
        Assertions.assertTrue(Files.exists(Paths.get(path)));
    }
}
