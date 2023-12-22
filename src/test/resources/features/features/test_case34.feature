@iletisim @smoke
Feature:Iletisim butonuna tiklama

  Scenario:Iletisim butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS BizeUlasin butonunun ustune gelir
    And MS Acilan Drapdawn menude Iletisim butonuna tiklar
    And MS Iletisim sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir