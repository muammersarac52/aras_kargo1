@hasarTazmin @smoke
Feature:HasarTazmin butonuna tiklama

  Scenario:HasarTazmin butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS MusteriIliskileri butonunun ustune gelir
    And MS Acilan Drapdawn menude HasarTazmin butonuna tiklar
    And MS HasarTazmin sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir