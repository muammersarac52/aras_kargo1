@arasKargoSporKulubu @smoke
Feature:ArasKargoSporKulubu butonuna tiklama

  Scenario:ArasKargoSporKulubu butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
     And MS ArasKargoSporKulubu butonuna tiklar
     And MS ArasKargoSporKulubu sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir
