package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        // rakamlarin toplamini yazdiran kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("5 basamakli bir sayi giriniz");
        int number = input.nextInt();

        //Bir tam sayiyi bir tam sayiya bolerseniz sonuc JAVA da hep tam sayidir,yuvarlama yapmaz ondalik kısmini siler.
        //Bir sayinin son rakamini alabilmek icin o sayiyi 10 a bolup kalani almaliyiz
        //% => modulus operator , solunda bulunan sayinin saginda bulunan sayiya bolumunden kalani verir.
        //dolayisiyla %10 herzaman birler basamagini verir.
        //Dolayisiyle bir tam sayiyi 10 a bolersek birler basamagini silmis oluruz

        //son rakami al
        int birlerBasamagi =number%10;
         //sayi kucult
        number =number/10;
        // sondan ikinci rakami al
        int sondanIkinci = number%10;
        //sayi kucult
        number = number/10;
        //sondan ucuncu rakami al
        int sondanUcuncu = number%10;
        //sayi kucult
        number = number/10;
        //sondan dorduncu rakami al
       int sondanDorduncu = number%10;
        //sayi kucult
        number = number/10;
        //sondan besinci rakami al
        int sondanBesinci = number%10;
        // son rakam oldugu icin kucultmeye gerek yok

        System.out.println(sondanBesinci+sondanDorduncu+birlerBasamagi+sondanIkinci);

        /* Homework
        1) Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz
        2) Kullanicidan aldiginiz 3 basamakli sayinin rakamlari toplamini bulunuz

*/


    }
}
