
@sosyalSorumlulukPlatformlarımız @smoke
Feature:SosyalSorumlulukPlatformlarımız butonuna tiklama

  Scenario:SosyalSorumlulukPlatformlarımız  butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS Sürdürülebilirlik butonunun ustune gelir
    And MS Acilan Drapdawn menude SosyalSorumlulukPlatformlarımız butonuna tiklar
    And MS SosyalSorumlulukPlatformlarımız sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir
