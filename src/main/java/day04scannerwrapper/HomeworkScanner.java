package day04scannerwrapper;

import java.util.Scanner;

public class HomeworkScanner {
    /* Homework
        1) Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz
        2) Kullanicidan aldiginiz 3 basamakli sayinin rakamlari toplamini bulunuz

*/
    public static void main(String[] args) {
        //1) Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen uc tane sayi giriniz..");
        double sayi1 = input.nextDouble();
        double sayi2 = input.nextDouble();
        double sayi3 = input.nextDouble();
        System.out.println("Uc sayı ortalamasi = " +(sayi1+sayi2+sayi3)/3);

        //2) Kullanicidan aldiginiz 3 basamakli sayinin rakamlari toplamini bulunuz
        Scanner cinput = new Scanner(System.in);
        System.out.println("Lutfen uc basamakli sayi giriniz..");
        int number = input.nextInt();

        int birlerBasamagi =number%10;
        number = number/10;
        int onlarBasamagi =number%10;
        number = number/10;
        int yuzlerBasamagi = number%10;
        //son basamak old icin kucultmeye gerek yok
        System.out.println("Uc basamakli sayinin rakamlari toplami = " +(birlerBasamagi+onlarBasamagi+yuzlerBasamagi));






    }

}
