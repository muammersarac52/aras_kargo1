@cagriMerkezi @smoke
Feature:CagriMerkezi butonuna tiklama

  Scenario:CagriMerkezi butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS CagriMerkezi butonunun ustune gelir
    And MS Acilan Drapdawn menude CagriMerkezi butonuna tiklar
    And MS CagriMerkezi sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir