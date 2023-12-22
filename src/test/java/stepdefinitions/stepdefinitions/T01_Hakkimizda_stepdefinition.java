package stepdefinitions.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.getDriver;

public class T01_Hakkimizda_stepdefinition {
    HomePage homePage = new HomePage();
    Actions actions=new Actions(Driver.getDriver());

    @Given("MS Kullanici ana sayfaya  gider")
    public void kullaniciAnaSayfayaGider() {
        getDriver().get(ConfigReader.getProperty("aras_url"));
        ReusableMethods.waitFor(1);
        ReusableMethods.clickWithTimeOut(homePage.popupCloseHome, 1);
    }


    @When("MS Ana sayfayi dogrular")
    public void msanaSayfayiDogrular() {
        assertTrue(getDriver().getCurrentUrl().contains("https://www.araskargo.com.tr/"));

    }

    @And("MS Hakkimizda butonuna tiklar")
    public void mshakkimizdaButonunaTiklar() {
        ReusableMethods.clickByJS(homePage.hakkimizdaButon);


    }


    @And("MS Hakkimizda sayfanin acildigini dogrular")
    public void mshakkimizdaSayfaninAcildiginiDogrular() {

        Assert.assertTrue(homePage.hakkimizdaText.isDisplayed());


    }


    @Then("Ms Kullanici sayfayi kapatir")
    public void msKullaniciSayfayiKapatir() {
        Driver.quitDriver();
    }
}



