package stepdefinitions.stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class T05_isOrtagimizOlun_stepdefinition {

    HomePage homePage = new HomePage();

    @And("MS isOrtagimizOlun butonuna tiklar")
    public void msisOrtagimizOlunButonunaTiklar() {

        ReusableMethods.clickWithTimeOut(homePage.isOrtagimizOlunButon, 2);
    }

    @And("MS isOrtagimizOlun sayfanin acildigini dogrular")
    public void msisOrtagimizOlunSayfaninAcildiginiDogrular() throws InterruptedException {
        Thread.sleep(2000);
        assert Driver.getDriver().getCurrentUrl().contains("https://www.araskargo.com.tr/is-ortakligi-sss");

    }
}




