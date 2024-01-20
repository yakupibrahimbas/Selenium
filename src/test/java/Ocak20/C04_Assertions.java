package Ocak20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class C04_Assertions {
    @Test
    public void test01() {
        String expectedData="selenium";
        String actualData="selenium";
        Assertions.assertEquals(expectedData,actualData);// parantez icinde belirtilen 2 deger esitse basarili olur, degilse basarisiz olur


    }
    @Test
    public void test02() {
        Assertions.assertTrue("junit".contains("u")); //parantez icinde belirtilen kosul eger true ise basarili olur degilse basarisiz olur

    }

    @Test
    public void test03() {
        Assertions.assertFalse(3>5);
    }

    @Test
    public void test04() {
        Assertions.assertNotEquals("junit","testing");
    }

    @Test
    public void test05() {
        char[]expectedArray={'j','a','v','a'};
        char[]actualArray={'j','a','v','a'};
        Assertions.assertArrayEquals(expectedArray,actualArray);//iki arrayin esit oabilmesi icin ayni indexte ayni elemanlar olmasi gerekiyor
    }

    @Test
    public void test06() {
        String str=null;
        Assertions.assertNull(str);//parantez icinde belirtilen deger null ise basarili olur degilse basarisiz olur
    }
}
