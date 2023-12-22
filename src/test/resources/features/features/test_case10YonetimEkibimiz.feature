@yonetimEkibimiz @smoke
Feature:YonetimEkibimiz butonuna tiklama

  Scenario:YonetimEkibimiz butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS Hakkimizda butonunun ustune gelir
    And MS Acilan Drapdawn menude YonetimEkibimiz butonuna tiklar
    And MS YonetimEkibimiz sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir
