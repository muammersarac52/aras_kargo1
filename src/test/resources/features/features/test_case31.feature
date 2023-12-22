@geriBildirimFormu @smoke
Feature:GeriBildirimFormu butonuna tiklama

  Scenario:GeriBildirimFormu butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS MusteriIliskileri butonunun ustune gelir
    And MS Acilan Drapdawn menude GeriBildirimFormu butonuna tiklar
    And MS GeriBildirimFormu sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir