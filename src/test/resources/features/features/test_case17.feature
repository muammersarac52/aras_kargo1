@geleceginBizdeOnemTasir @smoke
Feature:GeleceginBizdeOnemTasir butonuna tiklama

  Scenario:GeleceginBizdeOnemTasir butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS Kariyer butonunun ustune gelir
    And MS Acilan Drapdawn menude GeleceginBizdeOnemTasir butonuna tiklar
    And MS GeleceginBizdeOnemTasir sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir