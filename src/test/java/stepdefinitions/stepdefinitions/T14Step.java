package stepdefinitions.stepdefinitions;

import io.cucumber.java.en.And;
import pages.HomePage;
import utilities.ReusableMethods;

public class T14Step {
    HomePage homePage=new HomePage();
    @And("MS Acilan Drapdawn menude KurumsalHizmetlerimiz butonuna tiklar")
    public void msAcilanDrapdawnMenudeKurumsalHizmetlerimizButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(homePage.kurumsalHizmetlerimizDrapdownButon,2);
    }

    @And("MS KurumsalHizmetlerimiz sayfanin acildigini dogrular")
    public void msKurumsalHizmetlerimizSayfaninAcildiginiDogrular() {

    }
}
