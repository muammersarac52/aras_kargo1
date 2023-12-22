@arasa @smoke
Feature:Arasa butonuna tiklama

  Scenario:Arasa butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS Hakkimizda butonunun ustune gelir
    And MS Acilan Drapdawn menude Arasa Sor butonuna tiklar
    And MS Arasa Sor sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir