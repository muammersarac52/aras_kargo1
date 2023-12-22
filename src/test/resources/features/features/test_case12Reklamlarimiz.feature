@reklamlarimiz @smoke
Feature:Reklamlarimiz butonuna tiklama

  Scenario:Reklamlarimiz butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS Hakkimizda butonunun ustune gelir
    And MS Acilan Drapdawn menude Reklamlarimiz butonuna tiklar
    And MS Reklamlarimiz sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir
