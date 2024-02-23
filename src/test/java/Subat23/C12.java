package Subat23;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class C12 extends TestBase {
    @Test
    public void test01() throws AWTException {
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyRelease(KeyEvent.VK_WINDOWS);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);
        robot.delay(3000);


    }
}
