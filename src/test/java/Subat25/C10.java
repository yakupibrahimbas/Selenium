package Subat25;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import day19_jsexecutor_log4j.C04_Log4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

public class C10 extends TestBase {
    @Test
    public void test01() {


            //LogManager classindan getLogger methodunu kullanarak parantez icinde belirtilen class icin
            // bir logger (loglayici) olusturur

            Logger logger = LogManager.getLogger(C04_Log4j.class);
            logger.info("Amazon web sayfasina gidildi");
            logger.info("arama kutusu locate edildi");
            logger.info("arama kutusunda selenium aratildi");



        }
    }

