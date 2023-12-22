@isOrtagimizOlun @smoke
Feature:isOrtagimizOlun butonuna tiklama

  Scenario:isOrtagimizOlun butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS isOrtagimizOlun butonuna tiklar
    And MS isOrtagimizOlun sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir
