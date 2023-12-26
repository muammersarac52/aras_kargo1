package stepdefinitions.stepdefinitions;

import io.cucumber.java.en.And;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class T15Step {

    HomePage homePage=new HomePage();
    @And("MS Acilan Drapdawn menude AmbalajUrunlerimiz butonuna tiklar")
    public void msAcilanDrapdawnMenudeAmbalajUrunlerimizButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(homePage.ambalajUrunlerimizDrapdownButon,2);
    }

    @And("MS AmbalajUrunlerimiz sayfanin acildigini dogrular")
    public void msAmbalajUrunlerimizSayfaninAcildiginiDogrular() {
        Driver.getDriver().getCurrentUrl().contains("ambalaj-urunlerimiz");
    }
}
