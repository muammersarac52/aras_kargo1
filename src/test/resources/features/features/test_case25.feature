@esnafKuryeOlun @smoke
Feature:EsnafKuryeOlun butonuna tiklama

  Scenario:EsnafKuryeOlun butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS İş Ortağımız Olun butonunun ustune gelir
    And MS Acilan Drapdawn menude  EsnafKuryeOlun butonuna tiklar
    And MS EsnafKuryeOlun sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir