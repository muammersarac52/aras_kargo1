package stepdefinitions.stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class T06_Musteriiliskileri_stepdefinition {
        HomePage homePage = new HomePage();

        @And("MS Musteriliskileri butonuna tiklar")
        public void msMusteriliskileriButonunaTiklar() {
            ReusableMethods.clickWithTimeOut(homePage.musteriIliskileriButon,2);
        }

        @And("MS Musteriliskileri sayfanin acildigini dogrular")
        public void msMusteriliskileriSayfaninAcildiginiDogrular() throws InterruptedException {
            Thread.sleep(3000);
            homePage.musteriIliskileriText.isDisplayed();
        }
    }




