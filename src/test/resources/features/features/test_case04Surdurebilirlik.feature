@Surdurebilirlik @smoke
Feature:Surdurebilirlik butonuna tiklama

  Scenario:Surdurebilirlik butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS Surdurebilirlik butonuna tiklar
    And MS Surdurebilirlik sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir
