package stepdefinitions.stepdefinitions;

import com.beust.ah.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getDriver;

public class T07_ArasKargoSporKulubu_stepdefinition {
    HomePage homePage = new HomePage();


    @And("MS ArasKargoSporKulubu butonuna tiklar")
    public void msArasKargoSporKulubuButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(homePage.arasKargaSporKulbuButon, 2);

    }

    @And("MS ArasKargoSporKulubu sayfanin acildigini dogrular")
    public void msArasKargoSporKulubuSayfaninAcildiginiDogrular() {
        Assert.assertEquals("https://www.araskargo.com.tr/aras-kargo-spor-kulubu", Driver.getDriver().getCurrentUrl());
    }
}



