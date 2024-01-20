package Ocak20;

import org.junit.jupiter.api.*;

public class C02_BeforeAfter {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("@BeforeAll notasyonuna sahip olan bir method classtaki test methodlarindan once calisir");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("@BeforeEach notasyonuna sahip olan bir method her test methodundan once calistirilir");
    }

    @Test @Disabled
    public void test01() {
        System.out.println("Test 01 calisti");
    }
    @Test
    public void test02() {
        System.out.println("Test 02 calisti");
    }
    @Test
    public void test03() {
        System.out.println("Test 03 calisti");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("@Aftereach notasyonuna sahip olan bir method her test methodundan sonra calistirilir");

    }

    @AfterAll
    public static void afterAll() {
        System.out.println("@AfteAll notasyonuna sahip olan bir method tum test methodundan sonra calistirilir");


    }
}
