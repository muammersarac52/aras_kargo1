@vizyonMisyonPolitikalar @smoke
Feature:VizyonMisyonPolitikalar butonuna tiklama

  Scenario:VizyonMisyonPolitikalar butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS Hakkimizda butonunun ustune gelir
    And MS Acilan Drapdawn menude Vizyon Misyon Politikalar butonuna tiklar
    And MS VizyonMisyonPolitikalar sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir
