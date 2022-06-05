package tests.day17_pom;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FaceBookPage;
import utilities.Driver;

public class C03_PageClassKullanımı {
    @Test
    public void test01(){
        FaceBookPage faceBookPage=new FaceBookPage();

        //facebook anasayfaya gidin
        Driver.getDriver().get("https://www.facebook.com");

        //kullanıcı mail kutusuna rastgele bir isim yazdırın
        Faker faker=new Faker();
        faceBookPage.mailKutusu.sendKeys(faker.internet().emailAddress());
        //kullanıcı şifre kutusuna rastgele bir password gönderin
        faceBookPage.sifreKutusu.sendKeys(faker.internet().password());
        //login butonuna basın
        faceBookPage.loginButonu.click();
        //giriş yapılamadığını test edin
        Assert.assertTrue(faceBookPage.girilemediElementi.isDisplayed());
        Driver.closeDriver();
    }
}
