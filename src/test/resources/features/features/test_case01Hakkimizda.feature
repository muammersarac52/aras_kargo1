@hakkimizda @smoke
Feature:Hakkimizda butonuna tiklama

  Scenario:Hakkimizda butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS Hakkimizda butonuna tiklar
    And MS Hakkimizda sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir

