@arasBurasiNoktasıOlun @smoke
Feature:ArasBurasiNoktasıOlun butonuna tiklama

  Scenario:ArasBurasiNoktasıOlun butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS İş Ortağımız Olun butonunun ustune gelir
    And MS Acilan Drapdawn menude ArasBurasiNoktasıOlun butonuna tiklar
    And MS ArasBurasiNoktasıOlun sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir