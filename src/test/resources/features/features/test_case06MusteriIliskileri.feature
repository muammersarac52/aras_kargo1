@musteriliskileri @smoke
Feature:isOrtagimizOlun butonuna tiklama

  Scenario:Musteriliskileri butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS Musteriliskileri butonuna tiklar
    And MS Musteriliskileri sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir
