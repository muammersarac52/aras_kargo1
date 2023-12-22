package stepdefinitions.stepdefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class T02_Hizmetlerimiz_stepdefinition {
    HomePage homePage = new HomePage();

    @When("MS Hizmetlerimiz butonuna tiklar")
    public void hizmetlerimiz_butonuna_tiklar() {
        ReusableMethods.clickByJS(homePage.hizmetlerimizButon);
    }

    @When("MS Hizmetlerimiz sayfanin acildigini dogrular")
    public void hizmetlerimiz_sayfanin_acildigini_dogrular() {
        Assert.assertTrue(homePage.hizmetlerimizText.isDisplayed());


    }
}


