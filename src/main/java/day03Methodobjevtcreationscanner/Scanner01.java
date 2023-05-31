package day03Methodobjevtcreationscanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args){
        //1. Adim : Scanner Class tan object olusturur
        Scanner input = new  Scanner(System.in);

        //2. Adim: kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("Lutfen yasinizi giriniz");

        //3.Adim: Uygun methodu kullanarak kullanicinin verdigi datayi memory e yerlestiriniz
       byte age = input.nextByte();
        System.out.println("age = " + age);
        /* Scanner disaridaki datalari digital ortama aktarma islemidir
           Scanner kullanicidan data almaya yarar.
           Scanner kullanici ile interaktif etkilesim saglar
           Scanner bir Java Class'idir, bu Class'i kullanabilmek icin import etmek gerekir.
           Scanner Class'i Java'nin util kutuphanesindendir
           Javanin icinde bir suru kutuphane var ve ilk basta kullanacagimiz kutuphane java.util kutuphanesidir. kutuphanenin
  icinde bir suru Class vardir ve Scanner bir Java Class'idir.*/

        Scanner takimUyeligi =new Scanner(System.in);//1.adim

        System.out.println("Lutfen adinizi giriniz");//2.adim
        System.out.println("lutfen soyadinizi giriniz");
        System.out.println("Lutfen yasinizi giriniz");

        String name =takimUyeligi.next();
        System.out.println("name = " + name);
        String lastName =takimUyeligi.next();
        System.out.println("lastName = " + lastName);
        byte age2 =takimUyeligi.nextByte();
        System.out.println("age2 = " + age2);



    }


}
