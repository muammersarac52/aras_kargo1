@arasBurasiNoktalarimiz @smoke
Feature:ArasBurasiNoktalarimiz butonuna tiklama

  Scenario:ArasBurasiNoktalarimiz butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS BizeUlasin butonunun ustune gelir
    And MS Acilan Drapdawn menude ArasBurasiNoktalarimiz butonuna tiklar
    And MS ArasBurasiNoktalarimiz sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir