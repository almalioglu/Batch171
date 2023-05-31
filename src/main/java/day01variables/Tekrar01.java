package day01variables;

public class Tekrar01 {
    public static void main(String[] args){
    //Ornek1(non-primitive data type) yani String (variable degeri ÇİFT TIRNAK içinde olmalı)
    String mahalleAdı = "Fatih";

    //Ornek2(primitive data type) char (variable degeri TEK TIRNAK içinde olmalı)
    char vitaminlerden='D';

    //Ornek3(primitive data type) boolean
    boolean evlimisin= false;

    //Ornek4(primitive data type) byte (-128 ile 127 arasındaki tam sayılar için 1 BYTE)
    byte atesim=41;

    //Ornek5(primitive data type) short (-32768 den + 32767 e (dahil) tamsayi degerleri icin kullanilir 2 BYTE)
    short ilceNufusu= 23000;

    //Ornek6(primitive data type) int ( -2,147,483,648 ile 2,147,483,647 e (dahil) tamsayi degerleri icin kullanilir 4 BYTE)
    int ogrenciSayisi =2000000000 ;

    //Ornek7(primitive data type) long (long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki tam sayilar icindir. 8 BYTE)
    long halidakiIlmeksayisi = 22300000000000000L ;

    //Ornek8(primitive data type) float (Java ondalikli sayilari otomatik olarak double kabul eder. sonuna F ya da f konur 4 BYTE)
    // canta ve fare fiyatları icin iki tane variable olusturalım
    float bagPrice = 13.99F;
    float mousePrice = 17.99F;

    //Ornek9(primitive data type) double (ondalikli kisim icin daha fazla rakam alir 8 BYTE yer kaplar)
    // tuy ve pamuk agirligi icin bir variable olusturalım
    double tuyAgirligi = 1.0000000005;
    double pamukAgirligi= 1.000000008;

    //Ornek10(primitive data type) Baba ve ogul yasları icin variable olusturup toplamını ekrana yazdıralım
    System.out.println(35);
    System.out.println(15);

    byte baba1=35;
    byte baba2=15;
    System.out.println(baba1 + baba2);


    }






}
