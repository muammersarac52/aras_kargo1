@haberDuyurular @smoke
Feature:HaberDuyurular butonuna tiklama

  Scenario:HaberDuyurular butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS Hakkimizda butonunun ustune gelir
    And MS Acilan Drapdawn menude HaberDuyurular butonuna tiklar
    And MS HaberDuyurular sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir
