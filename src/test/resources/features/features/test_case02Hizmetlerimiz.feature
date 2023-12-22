@hizmetlerimiz @smoke
Feature:hizmetlerimiz butonuna tiklama

  Scenario:Hizmetlerimiz butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS Hizmetlerimiz butonuna tiklar
    And MS Hizmetlerimiz sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir
