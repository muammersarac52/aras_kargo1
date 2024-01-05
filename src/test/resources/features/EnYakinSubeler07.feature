Feature:Kullanici En Yakin Şubeler pop-up ini kullanabilmeli.
@enYakinSubeler

  Scenario:Kullanici En Yakin Şubeler pop-up ini kullanabilmeli.
    Given VS Kullanici sayfaya gider
    When VS Kullanici anasayfada bulunan "En Yakin Şubeler" butonuna tiklar
    And VS Kullanici arama işlemi dropdown'indan "Aras Burasi Noktalari" seçeneğini seçer
    And VS Kullanici "il veya ilçe girinizin" bölümüne gerekli bilgileri girer
    And VS Kullanici geçerli il ve ilçe ismi girer.
    And VS Kullanici ara butonuna basar
    And VS Kullanici sonuçlarin liste ve haritada işaretli olarak sunulduğunu doğrular.
    And VS Sayfayi kapatir
