@srasKargoSporKulubu @smoke
Feature:ArasKargoSporKulubu butonuna tiklama

  Scenario:ArasKargoSporKulubu butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS ArasKargoSporKulubu butonunun ustune gelir
    And MS Acilan Drapdawn menude ArasKargoSporKulubu butonuna tiklar
    And MS ArasKargoSporKulubun sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir