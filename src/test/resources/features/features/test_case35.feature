@genelMudurluk @smoke
Feature:GenelMudurluk butonuna tiklama

  Scenario:GenelMudurluk butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS BizeUlasin butonunun ustune gelir
    And MS Acilan Drapdawn menude GenelMudurluk  butonuna tiklar
    And MS GenelMudurluk sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir