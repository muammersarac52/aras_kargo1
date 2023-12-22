@surdurulebilirlik @smoke
Feature:SurdurulebilirlikRotas butonuna tiklama

  Scenario:Surdurulebilirlik Rotas butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS Surdurulebilirlik butonunun ustune gelir
    And MS Acilan Drapdawn menude Surdurulebilirlik Rotas butonuna tiklar
    And MS Surdurulebilirlik Rotas sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir