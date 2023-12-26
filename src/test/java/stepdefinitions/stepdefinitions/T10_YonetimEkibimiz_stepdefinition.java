package stepdefinitions.stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class T10_YonetimEkibimiz_stepdefinition {

    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.getDriver());
    @And("MS YonetimEkibimiz sayfanin acildigini dogrular")
    public void msYonetimEkibimizSayfaninAcildiginiDogrular() {
        Driver.getDriver().getCurrentUrl().contains("yonetim-ekibimiz");
    }

    @And("MS Acilan Drapdawn menude YonetimEkibimiz butonuna tiklar")
    public void msAcilanDrapdawnMenudeYonetimEkibimizButonunaTiklar()  {
        ReusableMethods.clickWithTimeOut(homePage. yonetimEkibimizDrapdownButon, 2);


    }
}
