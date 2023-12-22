@subelerimiz @smoke
Feature:Subelerimiz butonuna tiklama

  Scenario:Subelerimiz butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS BizeUlasin butonunun ustune gelir
    And MS Acilan Drapdawn menude Subelerimiz butonuna tiklar
    And MS Subelerimiz sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir