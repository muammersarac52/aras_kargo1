@sSS @smoke
Feature:SSS butonuna tiklama

  Scenario:SSS butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS MusteriIliskileri butonunun ustune gelir
    And MS Acilan Drapdawn menude SSS butonuna tiklar
    And MS SSS sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir