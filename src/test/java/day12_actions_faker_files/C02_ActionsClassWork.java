package day12_actions_faker_files;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C02_ActionsClassWork extends TestBase {
    //https://jqueryui.com/droppable/ adresine gidelim
    //Drag me to my target webelementini Drop here webelementi üzerine bıkalım

    @Test
    public void test01() {
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);//sayfada 1 tane iframe bulundugu icin calisma yapacagimiz web elementler burada bulundugu icin index ile gecis yaptik

        WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));
       WebElement drop= driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions actions=new Actions(driver);
        actions.dragAndDrop(drag,drop).perform();
    }
}
