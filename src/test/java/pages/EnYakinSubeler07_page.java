package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EnYakinSubeler07_page {
    public WebElement ililceSec;

    public EnYakinSubeler07_page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "EnYakinSubeler07")
    public WebElement enYakinSubeler;

    @FindBy(id = "mat-select-value-1")
    public WebElement arasBurasi;


    @FindBy(id ="mat-input-9")
    public WebElement ilIlceSec;

    @FindBy(xpath = "//*[@class='popup-close']")
    public WebElement popupCloseHome;

    @FindBy(xpath = "//div[text()='Ara']")
    public WebElement araButonu;

    @FindBy(xpath = "//*[@id='cdk-overlay-4']")
    public WebElement dropdown;

}

