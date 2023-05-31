package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {
        /*
        Ornek:
            Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
                1) En az 8 charcter olsun
                2) Space characteri passwordde olmasin
                3) En az bir buyuk harf olsun
                4) En az bir kucuk harf olsun
                5) En az bir rakam olsun
         */
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu girin...");
        String pwd =input.nextLine();

        //1) En az 8 charcter olsun
       boolean first = pwd.length()>7;//length ==> kac karakter oldugunu belirleyen method
        System.out.println("En az sekiz karakter var mi  "+first);

        //2) Space characteri passwordde olmasin
        boolean second =!pwd.contains(" ");//contains ==> yazdıgımız karakter var mı yok mu,iceriyior mu icermiyor mu..bunu kontrol eder.
        System.out.println("Space olmasın = " + second);

        //3) En az bir buyuk harf olsun
        //Note : Buyuk harf olmayanlari sil
        //      kalan character sayisina bak
        //      character sayisi sıfır ise buyuk harf yok demektir
        //      sifirdan buyuk ise buyuk harf var demektir
        boolean third =pwd.replaceAll("[^A-Z]","").length()>0;//methodlari aynı satirda yan yana kullanmaya MATHOD CHAIN denir
        System.out.println("third = " + third);

        //4) En az bir kucuk harf olsun
        boolean fourth =pwd.replace("[^a-z]","").length()>0;
        System.out.println("fourth = " + fourth);

        //5) En az bir rakam olsun
        boolean fifth =pwd.replace("[^0-9","").length()>0;
        System.out.println("fifth = " + fifth);
        System.out.println(("Password gecerli mi?  "+(first && second && third && fourth && fifth)));



            }
        }

