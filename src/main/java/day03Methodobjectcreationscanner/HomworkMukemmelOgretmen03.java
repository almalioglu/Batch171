package day03Methodobjectcreationscanner;

public class HomworkMukemmelOgretmen03 {
    //Homwork
    // icinde isim ve yas variable ları ıle teach methodu bulunan bir Teacher objecti olusturun
    //ve object uzerınde bu ozellıkleri kullanın

    //variable(pasif ozellikler)
    public String isim = "Hayat";
    public byte yas =33;
    public byte sinirlenmeKatsayisi = 0;


    //method(aktif ozellikler)
    public void teach(){System.out.println("Mukemmel Ogretici");}
    public void sinir(){System.out.println("Asla sinirlenmez");}



    //deneme : bir "kiralık ev" object i olusturalım
    //variable lar
    public String mahalle = "Fatih";
    public String cadde = "Fetih";
    public byte sokak = 53;
    public  short metreKare= 150;
    public  byte odaSayisi = 3;

    //method lar
    public void adres(){System.out.println("Fatih mh 53 sk no:14");}
    public void konum(){System.out.println("Valilik binasinin arkasi");}
    public void aciklama(){System.out.println("Kiraci cocuklu olmasin");}




}
