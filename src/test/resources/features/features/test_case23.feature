@acentemizOlun @smoke
Feature:AcentemizOlun butonuna tiklama

  Scenario:AcentemizOlun butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS isOrtagimizOlun butonunun ustune gelir
    And MS Acilan Drapdawn menude AcentemizOlun butonuna tiklar
    And MS AcentemizOlun sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir