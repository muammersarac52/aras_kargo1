@musterimizOlun @smoke
Feature:MusterimizOlun butonuna tiklama

  Scenario:MusterimizOlun butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS BizeUlasin butonunun ustune gelir
    And MS Acilan Drapdawn menude MusterimizOlun butonuna tiklar
    And MS MusterimizOlun sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir