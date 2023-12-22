package stepdefinitions.stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class T08_BizeUlasin_stepdefinition {
    HomePage homePage = new HomePage();
    @And("MS BizeUlasin butonuna tiklar")
    public void msBizeUlasinButonunaTiklar() throws InterruptedException {
        ReusableMethods.clickWithTimeOut(homePage.bizeUlasinButon, 2);
        Thread.sleep(3000);
    }

    @And("MS BizeUlasin sayfanin acildigini dogrular")
    public void msBizeUlasinSayfaninAcildiginiDogrular() {
        Assert.assertEquals("https://www.araskargo.com.tr/genel-mudurluk", Driver.getDriver().getCurrentUrl());
    }
}
