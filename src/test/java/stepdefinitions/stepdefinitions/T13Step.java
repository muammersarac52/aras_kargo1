package stepdefinitions.stepdefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class T13Step {
    HomePage homePage = new HomePage();
    Actions actions=new Actions(Driver.getDriver());
    @And("MS BireyselHizmetlerimiz sayfanin acildigini dogrular")
    public void msBireyselHizmetlerimizSayfaninAcildiginiDogrular() {
        Driver.getDriver().getCurrentUrl().contains("bireysel-hizmetlerimiz");
    }

    @And("MS Acilan Drapdawn menude BireyselHizmetlerimiz butonuna tiklar")
    public void msAcilanDrapdawnMenudeBireyselHizmetlerimizButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(homePage.bireyselHizmetlerimizDrapdownButon,2);
    }

    @And("MS Hizmetlerimiz butonunun ustune gelir")
    public void msHizmetlerimizButonununUstuneGelir() throws InterruptedException {
       actions.moveToElement(homePage.hizmetlerimizButon).perform();
        Thread.sleep(3000);
    }
}
