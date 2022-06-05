package tests.day18_pom;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FaceBookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02 {

  @Test
    public void test01(){
      FaceBookPage facebookPage=new FaceBookPage();
      //facebook anasayfaya gidin
       Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));

      //kullanıcı mail kutusuna yanlıs bir isim yazdırın
      facebookPage.mailKutusu.sendKeys(ConfigReader.getProperty("fbWrongUsername"));

      //kullanıcı şifre kutusuna rastgele bir password gönderin
      facebookPage.sifreKutusu.sendKeys(ConfigReader.getProperty("fbWrongPassword"));
      //login butonuna basın
      facebookPage.loginButonu.click();

      //giriş yapılamadığını test edin
      Assert.assertTrue(facebookPage.girilemediElementi.isDisplayed());

      System.out.println("girilemedi ELEMENTİ" +facebookPage.girilemediElementi.getText());
      Driver.closeDriver();

  }

}




