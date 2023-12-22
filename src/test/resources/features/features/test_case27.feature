@sikSorulanSorular @smoke
Feature:SikSorulanSorular butonuna tiklama

  Scenario:SikSorulanSorular butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS İş Ortağımız Olun butonunun ustune gelir
    And MS Acilan Drapdawn menude SikSorulanSorular butonuna tiklar
    And MS SikSorulanSorular sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir