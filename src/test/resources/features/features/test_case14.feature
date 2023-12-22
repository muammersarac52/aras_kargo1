@kurumsalHizmetlerimiz @smoke
Feature:KurumsalHizmetlerimiz butonuna tiklama

  Scenario:KurumsalHizmetlerimiz butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS Hizmetlerimiz butonunun ustune gelir
    And MS Acilan Drapdawn menude KurumsalHizmetlerimiz butonuna tiklar
    And MS KurumsalHizmetlerimiz sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir