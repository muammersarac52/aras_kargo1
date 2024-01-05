package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.EnYakinSubeler07_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.*;


public class EnYakinSubeler07_StepDef {
    EnYakinSubeler07_page page = new EnYakinSubeler07_page();
    Actions actions = new Actions(Driver.getDriver());
Select select=new Select(page.dropdown);
    @Given("VS Kullanici sayfaya gider")
    public void vs_kullanici_sayfaya_gider() {
        navigateToUrl();
        waitFor(1);
        closePopUp();
        closeCookies();
    }

    @When("VS Kullanici anasayfada bulunan {string} butonuna tiklar")
    public void vs_kullanici_anasayfada_bulunan_butonuna_tiklar(String string) {
        scrollIntoViewJS(page.enYakinSubeler);
        clickWithTimeOut(page.enYakinSubeler,4);
    }

    @When("VS Kullanici arama işlemi dropdown'indan {string} seçeneğini seçer")
    public void vs_kullanici_arama_işlemi_dropdown_indan_seçeneğini_seçer(String string) {
        clickWithTimeOut(page.arasBurasi,5);
    }

    @When("VS Kullanici {string} bölümüne gerekli bilgileri girer")
    public void vs_kullanici_bölümüne_gerekli_bilgileri_girer(String string) {
        clickByJS(page.arasBurasi);

    }

    @When("VS Kullanici geçerli il ve ilçe ismi girer.")
    public void vs_kullanici_geçerli_il_ve_ilçe_ismi_girer() {
        clickByJS(page.ililceSec);
        actions.sendKeys("Ordu").perform();
        select.selectByIndex(0);
    }

    @When("VS Kullanici ara butonuna basar")
    public void vs_kullanici_ara_butonuna_basar() {
        clickByJS(page.araButonu);

    }

    @When("VS Kullanici sonuçlarin liste ve haritada işaretli olarak sunulduğunu doğrular.")
    public void vs_kullanici_sonuçlarin_liste_ve_haritada_işaretli_olarak_sunulduğunu_doğrular() {

    }

    @When("VS Sayfayi kapatir")
    public void vs_sayfayi_kapatir() {
    }
}




