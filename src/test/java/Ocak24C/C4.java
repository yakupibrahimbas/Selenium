package Ocak24C;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class C4 {
    @Test
    public void test01() {
        String expectedData="selenium";
        String actualData="selenium";
        Assertions.assertEquals(expectedData,actualData);
    }

    @Test
    public void test02() {
        Assertions.assertTrue("junit".contains("u"));
    }

    @Test
    public void test03() {
        Assertions.assertFalse(13<5);
    }

    @Test
    public void test04() {
        Assertions.assertNotEquals("junit","testing");
        Assertions.assertNotEquals("junit","junit");
    }

    @Test
    public void test05() {
        char[]expectedArray={'j','a','v','a'};
        char[]actualArray={'j','a','v','a'};
        Assertions.assertArrayEquals(expectedArray,actualArray);

    }

    @Test
    public void test06() {
        String str="junit";
        Assertions.assertNotNull(str);
    }
}
