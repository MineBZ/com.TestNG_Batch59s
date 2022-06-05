package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FaceBookPage {
    public FaceBookPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//input[@id='email']")
    public WebElement mailKutusu;

    @FindBy(xpath = "//input[@id='pass']")
    public WebElement sifreKutusu;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement loginButonu;

    @FindBy(className = "_9ay7")
    public WebElement girilemediElementi;
}
