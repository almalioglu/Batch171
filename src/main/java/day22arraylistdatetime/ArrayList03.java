package day22arraylistdatetime;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList03 {
    public static void main(String[] args) {
       /*
        Example 1: Kullanicinin girdigi harf list'te var ise o harfi "Buldum!" a cevirin, yok ise o harfi list'e ekleyin
    */
        ArrayList<String> myList =new ArrayList<>();
        myList.add("A");
        myList.add("H");
        myList.add("J");

        Scanner input =new Scanner(System.in);
        int counter=0;
        int live=3;
        do {
            if(counter==live){
                System.out.println("game Over");
                break;
            }
            System.out.println("Lutfen bir harf giriniz");
            String letter =input.next().toUpperCase().substring(0,1);

            if (myList.contains(letter)){
                myList.set(myList.indexOf(letter),"Buldum!" );
            }else {
                myList.add(letter);
            }
            System.out.println(myList);
            counter++;
        }while (true);


    }
}
