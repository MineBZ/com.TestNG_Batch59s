package tests.day17_pom;

import org.testng.annotations.Test;
import utilities.Driver;

public class C01_YeniDriverIlkClass {
    @Test(groups = "grup1")
    public void Test01(){
        Driver.getDriver().get("https://www.amazon.com");
        Driver.closeDriver();

        Driver.getDriver().get("https://www.bestbuy.com");
        Driver.getDriver().get("https://www.facebook.com");
        Driver.closeDriver();
    }

}
