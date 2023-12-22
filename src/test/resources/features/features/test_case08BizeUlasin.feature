@bizeUlasin @smoke
Feature:BizeUlasin butonuna tiklama

  Scenario:BizeUlasin butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
     And MS BizeUlasin butonuna tiklar
     And MS BizeUlasin sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir
