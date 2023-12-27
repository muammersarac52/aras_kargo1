package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US02 {
    public US02(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='popup-close']")
    public WebElement popupCloseHome;

    @FindBy(xpath = "(//*[.='Hizmetlerimiz'])[1]")
    public WebElement hizmetlerimizLinkHome;

    @FindBy(xpath = "(//a[@href='/hizmetlerimiz/ambalaj-urunlerimiz'])[1]")
    public WebElement ambalajUrunlerimizHizmetlerimizLinkHome;

    @FindBy(xpath = "(//div[@class='packaging-products-tabbed__button-title'])[1]")
    public WebElement kutuKoliButonAmbalajUrunleri;

    @FindBy(xpath = "(//div[@class='packaging-products-tabbed__button-title'])[2]")
    public WebElement dosyaEvrakButonAmbalajUrunleri;

    @FindBy(xpath = "//div[@class='row px-xl-2']")
    public WebElement kutuKoliSecenekleriAmbalajUrunleri;

    @FindBy(xpath = "//div[@class='row px-xl-2']")
    public WebElement dosyaEvrakSecenekleriAmbalajUrunleri;

    @FindBy(xpath = "//*[@class='aras-pdf-button-href']")
    public WebElement ambalajFiyatlariButonAmbalajUrunleri;

    @FindBy(xpath = "//div[@id='sizer']")
    public WebElement arasKargoHizmetlerFiyatListesiPDF;
}
