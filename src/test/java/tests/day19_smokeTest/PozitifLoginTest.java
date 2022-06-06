package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PozitifLoginTest {

    BrcPage brcPage=new BrcPage();

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
         brcPage.ilkLoginButonu.click();
         brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
         brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));
         brcPage.ikinciLoginButonu.click();

        String actualUsername=brcPage.kullanıcıProfilİsmi.getText();
        String expectedUsername=ConfigReader.getProperty("brcValidUsername");
        Assert.assertEquals(actualUsername,expectedUsername);
         Driver.closeDriver();
    }
}
