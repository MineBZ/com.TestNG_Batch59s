package tests.day16_notations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

public class C06_SofAssert extends TestBase {
    @Test(groups = "grup2")
    public void test01() {
        SoftAssert softAssert=new SoftAssert();
        // 1- amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        // 2- title'in Amazon icerdigini test edin
        String expectedTitle="amazon";
        String actualTitle= driver.getTitle();
        softAssert.assertTrue(actualTitle.contains(expectedTitle),"Title amazon içermiyor");
        // 3- Arama kutusunun erisilebilir oldugunu test edin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue(aramaKutusu.isEnabled());
        // 4- arama kutusuna nutella yazip aratin
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        // 5- arama yapildigini test edin
        WebElement sonucYaziElementi= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(sonucYaziElementi.isDisplayed());
        // 6- arama sonucunun Nutella icerdigini test edin
        softAssert.assertTrue(sonucYaziElementi.getText().contains("Nutella"));
        softAssert.assertAll();
    }
}

