package Subat25;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C3 extends TestBase {
    @Test
    public void Test01() throws IOException {
        driver.get("https://www.bluerentalcars.com/");
        driver.findElement(By.xpath("//a[.=' Login']")).click();
        FileInputStream fis=new FileInputStream("src/test/java/resources/mysmoketestdata.xlsx");
        Workbook workbook=WorkbookFactory.create(fis);
        String userEmail=workbook.getSheet("cystomer_info").getRow(1).getCell(0).toString();
        String userPassword=workbook.getSheet("customer_info").getRow(1).getCell(1).toString();
        WebElement emailWebElement=driver.findElement(By.cssSelector("#formBasicEmail"));
        WebElement passwordWebElement=driver.findElement(By.cssSelector("#formBasicPassword"));
        WebElement loginButton=driver.findElement(By.xpath("//*[@type='submit']"));
        emailWebElement.sendKeys(userEmail);
        passwordWebElement.sendKeys(userPassword);
        loginButton.click();
        WebElement login=driver.findElement(By.cssSelector("#dropdown-basic-button"));
        Assertions.assertEquals("ayhan can",login.getText());


    }
}
