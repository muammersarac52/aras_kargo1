@araciniziKiralayin @smoke
Feature:AraciniziKiralayin butonuna tiklama

  Scenario:AraciniziKiralayin butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS İş Ortağımız Olun butonunun ustune gelir
    And MS Acilan Drapdawn menude AraciniziKiralayin butonuna tiklar
    And MS AraciniziKiralayin sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir