@ambalajUrunlerimiz @smoke
Feature:AmbalajUrunlerimiz butonuna tiklama

  Scenario:BireyselHizmetlerimiz butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS Hizmetlerimiz butonunun ustune gelir
    And MS Acilan Drapdawn menude AmbalajUrunlerimiz butonuna tiklar
    And MS AmbalajUrunlerimiz sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir