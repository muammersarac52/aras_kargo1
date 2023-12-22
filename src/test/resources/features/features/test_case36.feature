@bolgeMudurluklerimiz @smoke
Feature:BolgeMudurluklerimiz butonuna tiklama

  Scenario:BolgeMudurluklerimiz butonunu tiklanmasi
    Given MS Kullanici ana sayfaya  gider
    When MS Ana sayfayi dogrular
    And MS BizeUlasin butonunun ustune gelir
    And MS Acilan Drapdawn menude  BolgeMudurluklerimiz butonuna tiklar
    And MS BolgeMudurluklerimiz sayfanin acildigini dogrular
    Then Ms Kullanici sayfayi kapatir