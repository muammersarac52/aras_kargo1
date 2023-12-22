package stepdefinitions.stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class T11_HaberDuyurular_stepdefinition {
    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.getDriver());
    @And("MS Acilan Drapdawn menude HaberDuyurular butonuna tiklar")
    public void msAcilanDrapdawnMenudeHaberDuyurularButonunaTiklar()  {
        ReusableMethods.clickWithTimeOut(homePage.haberDuyurularDrapdownButon, 2);


    }


    @And("MS HaberDuyurular sayfanin acildigini dogrular")
    public void msHaberDuyurularSayfaninAcildiginiDogrular() {
        Assert.assertEquals("https://www.araskargo.com.tr/hakkimizda/haberler-ve-duyurular", Driver.getDriver().getCurrentUrl());
    }
}
