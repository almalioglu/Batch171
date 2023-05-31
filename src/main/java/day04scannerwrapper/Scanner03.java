package day04scannerwrapper;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //Ornek : Kullaniciden iki sayi alip dort islem yapan ve islemlerin sonuclarini ekrana yazdiren kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("Iki sayi giriniz");

        double firstNumber = input.nextDouble();

        double secondNumber = input.nextDouble();

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);

        Scanner harput = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz..");
        double ilkSayi = harput.nextDouble();
        double ikinciSayi = harput.nextDouble();
        System.out.println(ilkSayi+ikinciSayi);
        System.out.println(ilkSayi*ikinciSayi);
        System.out.println(ilkSayi/ikinciSayi);
        System.out.println(ilkSayi-ikinciSayi);



    }
}
