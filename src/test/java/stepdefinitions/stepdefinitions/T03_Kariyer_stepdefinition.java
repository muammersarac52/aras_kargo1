package stepdefinitions.stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class T03_Kariyer_stepdefinition {
    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.getDriver());

    @And("MS Kariyer butonuna tiklar")
    public void msKariyerButonunaTiklar() {
        actions.moveToElement(homePage.kariyerButon).perform();
        homePage.kariyerButon.click();
    }

    @And("MS Kariyer sayfanin acildigini dogrular")
    public void msKariyerSayfaninAcildiginiDogrular() {

        //Assert.assertTrue(homePage.kariyerText.getText().contains("Önem"));
        assert Driver.getDriver().getCurrentUrl().contains("https://www.araskargo.com.tr/kariyer");
    }


}


