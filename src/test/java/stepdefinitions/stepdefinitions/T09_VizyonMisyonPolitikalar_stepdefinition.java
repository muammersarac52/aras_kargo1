package stepdefinitions.stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class T09_VizyonMisyonPolitikalar_stepdefinition {
    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.getDriver());
    @And("MS Hakkimizda butonunun ustune gelir")
    public void msHakkimizdaButonununUstuneGelir() throws InterruptedException {
        actions.moveToElement(homePage.hakkimizdaButon).perform();
        homePage.hakkimizdaButon.click();
        Thread.sleep(2000);
    }

    @And("MS Acilan Drapdawn menude Vizyon Misyon Politikalar butonuna tiklar")
    public void acilanDrapdawnMenudeVizyonMisyonPolitikalarButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(homePage. vizyonMisyonPolitikalarDrapdownButon, 2);
        
    }
    @And("MS VizyonMisyonPolitikalar sayfanin acildigini dogrular")
    public void msVizyonMisyonPolitikalarSayfaninAcildiginiDogrular() {
        Assert.assertEquals("https://www.araskargo.com.tr/hakkimizda/vizyon-misyon-ve-politikalar", Driver.getDriver().getCurrentUrl());
    }

   

   
}
