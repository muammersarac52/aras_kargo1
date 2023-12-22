@AaraslarBizdeOnemTasir @smoke
Feature:AraslarBizdeOnemTasir butonuna tiklama

  Scenario:AraslarBizdeOnemTasir butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS Kariyer butonunun ustune gelir
    And MS Acilan Drapdawn menude AraslarBizdeOnemTasir butonuna tiklar
    And MS AraslarBizdeOnemTasir sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir