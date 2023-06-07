package day02datatypesmethodcreation;

public class Variables02 {
    public static void main(String[] args) {
//Ornek 1:Sehir ismi icin bir variable olusturun ve once "Ankara" sonrada "Izmir" degerlerini atayip ekrana yazdirin
        String cityName = "Ankara";
        System.out.println(cityName);

        cityName = "Izmir";
        System.out.println(cityName);

        //Ornek 2: Sehir plaka kodu icin bir variable olusturun once 34 sonrada 35 degeri atayip console yazdirin.
        byte plakaKodu = 34;
        System.out.println(plakaKodu);

        plakaKodu = 35;
        System.out.println(plakaKodu);

        //Ornek 3: Basarili mi? sorusu icin bir variable olusturun ve once "false" sonrada "true" degeri atayip ekrana yazdirin
        boolean isSuccessful = false;
        System.out.println(isSuccessful);

        isSuccessful = true;
        System.out.println(isSuccessful);

        /*
    Java'da temelde iki tip data vardir
        1)primitive data type:
            char, boolean, byte, short, int, long, float, double,

        2)non-primitive data type:
            String.....
     */

    /*
    Note 1 : primitive data typelarini java olusturmustur, biz olusturamayiz
    Note 2 : primitive data typelarinin isimlerinde sadece kucuk harf kullanilir
    Note 3 : primitive datalar data type larina gore memory de farkli farkli yer kaplarlar
    Note 4 : primitive datalar iclerinde sadece sizin atadigniz degeri barindirirlar
     */

    /*
    Non-primitive Data types
    Ornegin String non primitive bir data typedir
    * Uretilen her bir class ayni zamanda bir "non-primitive" data type dir. Bu yuzden "non-primitive"
    data typelar sinirisiz sayidadir denilebilir
    *Non-primitive data typelarin isimleri buyuk harf ile baslar
    *Non-primitive ler icin java memory de buyuklugune gore degisen boyutlarda yer ayirir
     */
        /*
        Interview sorusu: "primitive" ve "non-primitive " data type'lar arasindaki fark nedir?
        1)"primitive"ler sadece bizim atadigimiz degeri icerir;
          "non-primitive" ler bizim atadigimiz deger ve methodlar icerir
        2)"primitive"ler kucuk harfle baslar, "non-primitive" ler buyuk harf ile baslar
        3)"primitive"leri java uretmistir 8 tanedir
          "non-primitive"leri  java ve developerlar uretebilir bu yuzden sinirsiz sayidadir
        4)"primitive" ler memory de data type'ina gore yer kaplar
          "non-primitive" ler icin java memory'de hep ayni buyuklukte yer ayirir.
          */

    }






}
