package stepdefinitions.stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class T12_Reklamlarimiz_Stepdefinition {
    HomePage homePage = new HomePage();
    @And("MS Acilan Drapdawn menude Reklamlarimiz butonuna tiklar")
    public void msAcilanDrapdawnMenudeReklamlarimizButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(homePage.reklamlarimizDrapdownButon, 2);

    }

    @And("MS Reklamlarimiz sayfanin acildigini dogrular")
    public void msReklamlarimizSayfaninAcildiginiDogrular() {
        homePage.reklamlarimizText.isDisplayed();


    }
}
