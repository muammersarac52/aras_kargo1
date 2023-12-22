@kaliteYonetimSistemi @smoke
Feature:KaliteYonetimSistemi butonuna tiklama

  Scenario:KaliteYonetimSistemi butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS Sürdürülebilirlik butonunun ustune gelir
    And MS Acilan Drapdawn menude KaliteYonetimSistemi butonuna tiklar
    And MS KaliteYonetimSistemi sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir