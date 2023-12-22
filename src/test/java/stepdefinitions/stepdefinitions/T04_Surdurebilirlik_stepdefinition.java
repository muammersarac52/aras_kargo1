package stepdefinitions.stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class T04_Surdurebilirlik_stepdefinition {
    HomePage homePage = new HomePage();


    @And("MS Surdurebilirlik butonuna tiklar")
    public void msSurdurebilirlikButonunaTiklar() throws InterruptedException {
        ReusableMethods.clickWithTimeOut(homePage.surdurebilirlikButon,2);
        Thread.sleep(2000);
    }

    @And("MS Surdurebilirlik sayfanin acildigini dogrular")
    public void msSurdurebilirlikSayfaninAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("https://www.araskargo.com.tr/surdurulebilirlik");
    }
}


