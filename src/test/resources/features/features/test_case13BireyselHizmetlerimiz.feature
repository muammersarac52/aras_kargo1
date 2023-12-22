@reklamlarimiz @smoke
Feature:BireyselHizmetlerimiz butonuna tiklama

  Scenario:BireyselHizmetlerimiz butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS Hizmetlerimiz butonunun ustune gelir
    And MS Acilan Drapdawn menude BireyselHizmetlerimiz butonuna tiklar
    And MS BireyselHizmetlerimiz sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir
