package day04scannerwrapper;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //Ornek : kullanıcıda adresini aliniz ve ekrana yazdiriniz.
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen adresinizi giriniz");
        //nextLine() method u kullanicidan cok kelimeli String almak icin kullanilir.
        String adress =input.nextLine();

        System.out.println(adress);

        //kullanıcıdan hatırlatma bilgisi alınız ve ekrana yazdiriniz.
        Scanner myInput = new Scanner(System.in);
        System.out.println("Lutfen bir hatirlatma cumlesi giriniz..");
        String hatirlatma = myInput.nextLine();
        System.out.println(hatirlatma);



    }
}
