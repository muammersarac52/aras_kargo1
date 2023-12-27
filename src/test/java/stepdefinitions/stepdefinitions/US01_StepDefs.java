package stepdefinitions.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.US01;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US01_StepDefs {
    US01 us01 = new US01();
    Actions actions = new Actions(Driver.getDriver());
    @Given("MS Kullanici ana sayfaya  gider")
    public void kullaniciAnaSayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(1);
        ReusableMethods.clickWithTimeOut(us01.popupCloseHome, 1);
    }
    @When("MS Ana sayfayi dogrular")
    public void msanaSayfayiDogrular() {
        assertTrue(Driver.getDriver().getCurrentUrl().contains("https://www.araskargo.com.tr/"));
    }
    @And("MS Hakkimizda butonuna tiklar")
    public void mshakkimizdaButonunaTiklar() {
        ReusableMethods.clickByJS(us01.hakkimizdaButon);
    }
    @When("MS Hizmetlerimiz butonuna tiklar")
    public void hizmetlerimiz_butonuna_tiklar() {
        ReusableMethods.clickByJS(us01.hizmetlerimizButon);
    }
    @And("MS Hakkimizda sayfanin acildigini dogrular")
    public void msHakkimizdaSayfaninAcildiginiDogrular() {
        Assert.assertTrue(us01.hakkimizdaButon.isDisplayed());
    }
    @And("MS Hizmetlerimiz sayfanin acildigini dogrular")
    public void msHizmetlerimizSayfaninAcildiginiDogrular() {
        Assert.assertTrue(us01.hizmetlerimizText.isDisplayed());
    }
    @And("MS Kariyer butonuna tiklar")
    public void msKariyerButonunaTiklar() {
        actions.moveToElement(us01.kariyerButon).perform();
        us01.kariyerButon.click();
    }
    @And("MS Kariyer sayfanin acildigini dogrular")
    public void msKariyerSayfaninAcildiginiDogrular() {
        Assert.assertTrue(us01.kariyerText.isDisplayed());
    }
    @And("MS isOrtagimizOlun butonuna tiklar")
    public void msIsOrtagimizOlunButonunaTiklar() {
        ReusableMethods.clickByJS(us01.isOrtagimizOlunButon);
    }
    @And("MS isOrtagimizOlun sayfanin acildigini dogrular")
    public void msIsOrtagimizOlunSayfaninAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("is-ortakligi");
    }
    @And("MS Musteriliskileri butonuna tiklar")
    public void msMusteriliskileriButonunaTiklar() {
        ReusableMethods.clickByJS(us01.musteriIliskileriButon);
    }

    @And("MS Musteriliskileri sayfanin acildigini dogrular")
    public void msMusteriliskileriSayfaninAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("musteri-iliskileri");
    }

    @And("MS ArasKargoSporKulubu butonuna tiklar")
    public void msArasKargoSporKulubuButonunaTiklar() {
        ReusableMethods.clickByJS(us01.arasKargaSporKulbuButon);
    }
    @And("MS ArasKargoSporKulubu sayfanin acildigini dogrular")
    public void msArasKargoSporKulubuSayfaninAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("aras-kargo-spor-kulubu");
    }
    @And("MS BizeUlasin sayfanin acildigini dogrular")
    public void msBizeUlasinSayfaninAcildiginiDogrular() {
        Driver.getDriver().getCurrentUrl().contains("genel-mudurluk");
    }
    @And("MS BizeUlasin butonuna tiklar")
    public void msBizeUlasinButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.bizeUlasinButon,2);
    }
    @And("MS Hakkimizda butonunun ustune gelir")
    public void msHakkimizdaButonununUstuneGelir() {
        actions.moveToElement(us01.hakkimizdaButon).perform();
    }
    @And("MS Acilan Drapdawn menude Vizyon Misyon Politikalar butonuna tiklar")
    public void msAcilanDrapdawnMenudeVizyonMisyonPolitikalarButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.vizyonMisyonPolitikalarDrapdownButon,2);
    }
    @And("MS VizyonMisyonPolitikalar sayfanin acildigini dogrular")
    public void msVizyonMisyonPolitikalarSayfaninAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("hakkimizda/vizyon-misyon-ve-politikalar");
    }
    @And("MS Acilan Drapdawn menude YonetimEkibimiz butonuna tiklar")
    public void msAcilanDrapdawnMenudeYonetimEkibimizButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.yonetimEkibimizDrapdownButon,2);
    }
    @And("MS YonetimEkibimiz sayfanin acildigini dogrular")
    public void msYonetimEkibimizSayfaninAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("hakkimizda/yonetim-ekibimiz");
    }
    @And("MS Acilan Drapdawn menude HaberDuyurular butonuna tiklar")
    public void msAcilanDrapdawnMenudeHaberDuyurularButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.haberDuyurularDrapdownButon,2);
    }
    @And("MS HaberDuyurular sayfanin acildigini dogrular")
    public void msHaberDuyurularSayfaninAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("hakkimizda/haberler-ve-duyurular");
    }
    @And("MS Acilan Drapdawn menude Reklamlarimiz butonuna tiklar")
    public void msAcilanDrapdawnMenudeReklamlarimizButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.reklamlarimizDrapdownButon,2);
    }
    @And("MS Reklamlarimiz sayfanin acildigini dogrular")
    public void msReklamlarimizSayfaninAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("hakkimizda/reklamlarimiz");
    }
    @Then("MS Kullanici sayfayi kapatir")
    public void msKullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
    @And("MS Kullanici iki saniye bekler")
    public void msKullaniciIkiSaniyeBekler() throws InterruptedException {
        Thread.sleep(2000);
    }
    @And("MS Hizmetlerimiz butonunun ustune gelir")
    public void msHizmetlerimizButonununUstuneGelir() {
        actions.moveToElement(us01.hizmetlerimizButon).perform();
    }
    @And("MS Acilan Drapdawn menude Bireysel Hizmetlerimiz butonuna tiklar")
    public void msAcilanDrapdawnMenudeBireyselHizmetlerimizButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.bireyselHizmetlerimizDrapdownButon,2);
    }
    @And("MS Bireysel Hizmetlerimiz sayfasinin acildigini dogrular")
    public void msBireyselHizmetlerimizSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("hizmetlerimiz/bireysel-hizmetlerimiz");
    }
    @And("MS Acilan Drapdawn menude Kurumsal Hizmetlerimiz butonuna tiklar")
    public void msAcilanDrapdawnMenudeKurumsalHizmetlerimizButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.kurumsalHizmetlerimizDrapdownButon,2);
    }
    @And("MS Kurumsal Hizmetlerimiz sayfasinin acildigini dogrular")
    public void msKurumsalHizmetlerimizSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("hizmetlerimiz/kurumsal-hizmetlerimiz");
    }
    @And("MS Acilan Drapdawn menude Ambalaj Urunlerimiz butonuna tiklar")
    public void msAcilanDrapdawnMenudeAmbalajUrunlerimizButonunaTiklar() {
        us01.ambalajUrunlerimizDrapdownButon.click();
    }
    @And("MS Ambalaj Urunlerimiz sayfasinin acildigini dogrular")
    public void msAmbalajUrunlerimizSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("hizmetlerimiz/ambalaj-urunlerimiz");
    }
    @And("MS Kariyer butonunun ustune gelir")
    public void msKariyerButonununUstuneGelir() {
        actions.moveToElement(us01.kariyerButon).perform();
    }
    @And("MS Acilan Drapdawn menude  Araslar Bizde Önem Tasir butonuna tiklar")
    public void msAcilanDrapdawnMenudeAraslarBizdeÖnemTasirButonunaTiklar() {
        ReusableMethods.clickByJS(us01.araslarBizdeOnemTasirDrapdownButon);
    }
    @And("MS Araslar Bizde Önem Tasir sayfasinin acildigini dogrular")
    public void msAraslarBizdeÖnemTasirSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("kariyer/araslar-bizde-onem-tasir");
    }
    @And("MS Acilan Drapdawn menude Gelecegin Bizde Onem Tasir butonuna tiklar")
    public void msAcilanDrapdawnMenudeGeleceginBizdeOnemTasirButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.geleceginBizdeOnemTasirDrapdownButon,2);
    }
    @And("MS Gelecegin Bizde Onem Tasir sayfasinin acildigini dogrular")
    public void msGeleceginBizdeOnemTasirSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("kariyer/gelecegin-bizde-onem-tasir");
    }
    @And("MS Acilan Drapdawn menude Iyi Bir Dunya Bizde Onem Tasir butonuna tiklar")
    public void msAcilanDrapdawnMenudeIyiBirDunyaBizdeOnemTasirButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.iyiBirDunyaBizdeOnemTasirDrapdownButon,2);
    }
    @And("MS Iyi Bir Dunya Bizde Onem Tasir sayfasinin acildigini dogrular")
    public void msIyiBirDunyaBizdeOnemTasirSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("kariyer/iyi-bir-dunya-bizde-onem-tasir");
    }
    @And("MS Acilan Drapdawn menude Teknoloji Bizde Onem Tasir butonuna tiklar")
    public void msAcilanDrapdawnMenudeTeknolojiBizdeOnemTasirButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.teknolojiBizdeOnemTasirDrapdownButon,2);
    }
    @And("MS Teknoloji Bizde Onem Tasir sayfasinin acildigini dogrular")
    public void msTeknolojiBizdeOnemTasirSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("kariyer/teknoloji-bizde-onem-tasir");
    }
    @And("MS Surdurulebilirlik butonunun ustune gelir")
    public void msSurdurulebilirlikButonununUstuneGelir() {
        actions.moveToElement(us01.surdurebilirlikButon).perform();
    }
    @And("MS Acilan Drapdawn menude Surdurulebilirlik Rotasi butonuna tiklar")
    public void msAcilanDrapdawnMenudeSurdurulebilirlikRotasiButonunaTiklar() {
        ReusableMethods.clickByJS(us01.surdurulebilirlikRotasiDrapdownButon);
    }
    @And("MS Surdurulebilirlik Rotasi sayfasinin acildigini dogrular")
    public void msSurdurulebilirlikRotasiSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("surdurulebilirlik/surdurulebilirlik-rotasi");
    }
    @And("MS Acilan Drapdawn menude Sosyal Sorumluluk Platformlarimiz butonuna tiklar")
    public void msAcilanDrapdawnMenudeSosyalSorumlulukPlatformlarimizButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.sosyalSorumlulukPlatformlarimizDrapdownButon,2);
    }
    @And("MS Sosyal Sorumluluk Platformlarimiz sayfasinin acildigini dogrular")
    public void msSosyalSorumlulukPlatformlarimizSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("surdurulebilirlik/sosyal-sorumluluk-platformlarimiz");
    }
    @And("MS Acilan Drapdawn menude Kalite Yönetim Sistemi butonuna tiklar")
    public void msAcilanDrapdawnMenudeKaliteYönetimSistemiButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.kaliteYonetimSistemiDrapdownButon,2);
    }
    @And("MS Kalite Yönetim Sistemi sayfasinin acildigini dogrular")
    public void msKaliteYönetimSistemiSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("surdurulebilirlik/kalite-yonetim-sistemi");
    }
    @And("MS Is Ortagimiz Olun butonunun ustune gelir")
    public void msIsOrtagimizOlunButonununUstuneGelir() {
        actions.moveToElement(us01.isOrtagimizOlunButon).perform();
    }
    @And("MS Acilan Drapdawn menude Aras Burasi Noktasi Olun butonuna tiklar")
    public void msAcilanDrapdawnMenudeArasBurasiNoktasiOlunButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.arasBurasiNoktasiOlunDrapdownButon,2);
    }
    @And("MS Aras Burasi Noktasi Olun sayfasinin acildigini dogrular")
    public void msArasBurasiNoktasiOlunSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("aras-burasi-noktasi-olun");
    }
    @And("MS Acilan Drapdawn menude Esnaf Kurye Olun butonuna tiklar")
    public void msAcilanDrapdawnMenudeEsnafKuryeOlunButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.esnafKuryeOlunDrapdownButon,2);
    }
    @And("MS Esnaf Kurye Olun sayfasinin acildigini dogrular")
    public void msEsnafKuryeOlunSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("esnaf-kurye-olun");
    }
    @And("MS Acilan Drapdawn menude Aracinizi Kiralayin butonuna tiklar")
    public void msAcilanDrapdawnMenudeAraciniziKiralayinButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.araciniziKiralayinDrapdownButon,2);
    }
    @And("MS Aracinizi Kiralayin sayfasinin acildigini dogrular")
    public void msAraciniziKiralayinSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("aracinizi-kiralayin");
    }
    @And("MS Acilan Drapdawn menude Sik Sorulan Sorular butonuna tiklar")
    public void msAcilanDrapdawnMenudeSikSorulanSorularButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.sikSorulanSorularDrapdownButon,2);
    }
    @And("MS Sik Sorulan Sorular sayfasinin acildigini dogrular")
    public void msSikSorulanSorularSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("araskargo.com.tr/is-ortakligi-sss");
    }
    @And("MS Musteri Iliskileri butonunun ustune gelir")
    public void msMusteriIliskileriButonununUstuneGelir() {
        actions.moveToElement(us01.musteriIliskileriButon).perform();
    }
    @And("MS Acilan Drapdawn menude Arasa Sor butonuna tiklar")
    public void msAcilanDrapdawnMenudeArasaSorButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.arasaSorDrapdownButon,2);
    }
    @And("MS Arasa Sor sayfasinin acildigini dogrular")
    public void msArasaSorSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("araskargo.com.tr/musteri-iliskileri");
    }
    @And("MS Acilan Drapdawn menude Cagri Merkezi butonuna tiklar")
    public void msAcilanDrapdawnMenudeCagriMerkeziButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.cagriMerkeziDrapdownButon,2);
    }
    @And("MS Cagri Merkezi sayfasinin acildigini dogrular")
    public void msCagriMerkeziSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("araskargo.com.tr/musteri-iliskileri");
    }
    @And("MS Acilan Drapdawn menude Hasar Tazmin butonuna tiklar")
    public void msAcilanDrapdawnMenudeHasarTazminButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.hasarTazminDrapdownButon,2);
    }
    @And("MS Hasar Tazmin sayfasinin acildigini dogrular")
    public void msHasarTazminSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("musteri-iliskileri/hasar-tazmin");
    }
    @And("MS Acilan Drapdawn menude Geri Bildirim Formu butonuna tiklar")
    public void msAcilanDrapdawnMenudeGeriBildirimFormuButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.geriBildirimFormuDrapdownButon,2);
    }
    @And("MS Geri Bildirim Formu sayfasinin acildigini dogrular")
    public void msGeriBildirimFormuSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("musteri-iliskileri/geri-bildirim-formu");
    }
    @And("MS Acilan Drapdawn menude SSS butonuna tiklar")
    public void msAcilanDrapdawnMenudeSSSButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.ssSDrapdownButon,2);
    }
    @And("MS SSS sayfasinin acildigini dogrular")
    public void msSSSSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("musteri-iliskileri/sss");
    }
    @And("MS Aras Kargo Spor Kulubu butonunun ustune gelir")
    public void msArasKargoSporKulubuButonununUstuneGelir() {
        actions.moveToElement(us01.arasKargaSporKulbuButon).perform();
    }
    @And("MS Bize Ulasin butonunun ustune gelir")
    public void msBizeUlasinButonununUstuneGelir() {
        actions.moveToElement(us01.bizeUlasinButon).perform();
    }
    @And("MS Acilan Drapdawn menude Iletisim butonuna tiklar")
    public void msAcilanDrapdawnMenudeIletisimButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.iletisimDrapdownButon,2);
    }
    @And("MS Iletisim sayfasinin acildigini dogrular")
    public void msIletisimSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("araskargo.com.tr/iletisim");
    }
    @And("MS Acilan Drapdawn menude Genel Mudurluk butonuna tiklar")
    public void msAcilanDrapdawnMenudeGenelMudurlukButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.genelMudurlukDrapdownButon,2);
    }
    @And("MS Genel Mudurluk sayfasinin acildigini dogrular")
    public void msGenelMudurlukSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("genel-mudurluk");
    }
    @And("MS Acilan Drapdawn menude Bolge Mudurluklerimiz butonuna tiklar")
    public void msAcilanDrapdawnMenudeBolgeMudurluklerimizButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.bolgeMudurluklerimizDrapdownButon,2);
    }
    @And("MS Bolge Mudurluklerimiz sayfasinin acildigini dogrular")
    public void msBolgeMudurluklerimizSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("bolge-mudurluklerimiz");
    }
    @And("MS Acilan Drapdawn menude Subelerimiz butonuna tiklar")
    public void msAcilanDrapdawnMenudeSubelerimizButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.subelerimizDrapdownButon,2);
    }
    @And("MS Subelerimiz sayfasinin acildigini dogrular")
    public void msSubelerimizSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("subelerimiz");
    }
    @And("MS Acilan Drapdawn menude Aras Burasi Noktalarimiz butonuna tiklar")
    public void msAcilanDrapdawnMenudeArasBurasiNoktalarimizButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.arasBurasiNoktalarimizDrapdownButon,2);
    }
    @And("MS Aras Burasi Noktalarimiz sayfasinin acildigini dogrular")
    public void msArasBurasiNoktalarimizSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("aras-burasi-noktalarimiz");
    }
    @And("MS Acilan Drapdawn menude Musterimiz Olun butonuna tiklar")
    public void msAcilanDrapdawnMenudeMusterimizOlunButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.musterimizOlunDrapdownButon,2);
    }
    @And("MS Musterimiz Olun sayfasinin acildigini dogrular")
    public void msMusterimizOlunSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("musterimiz-olun");
    }
    @And("MS Surdurebilirlik butonuna tiklar")
    public void msSurdurebilirlikButonunaTiklar() {
        ReusableMethods.clickByJS(us01.surdurebilirlikButon);
    }
    @And("MS Surdurebilirlik sayfanin acildigini dogrular")
    public void msSurdurebilirlikSayfaninAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("surdurulebilirlik");
    }
    @And("MS Acilan Drapdawn menude Aras Kargo Spor Kulubu butonuna tiklar")
    public void msAcilanDrapdawnMenudeArasKargoSporKulubuButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.arasKargoSporKulubuDrapdownButon,2);
    }
    @And("MS Aras Kargo Spor Kulubu sayfasinin acildigini dogrular")
    public void msArasKargoSporKulubuSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("aras-kargo-spor-kulubu");
    }
    @When("MS Acilan Drapdawn menude Acentemiz Olun butonuna tiklar")
    public void ms_acilan_drapdawn_menude_acentemiz_olun_butonuna_tiklar() {
        ReusableMethods.clickWithTimeOut(us01.acentemizOlunDrapdownButon,2);
    }
    @When("MS Acentemiz Olun sayfasinin acildigini dogrular")
    public void ms_acentemiz_olun_sayfasinin_acildigini_dogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("acentemiz-olun");
    }
}