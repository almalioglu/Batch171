package day18multidimensionalarray;

import com.sun.jdi.connect.Connector;

public class Md02 {
    public static void main(String[] args) {
        String students [][] = {{"Ali","Kemal"},{"İsmail"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};
        //Ornek 1: Yukaridaki students arrayinde icinde "m" harfi olan isimleri console a yazdiriniz.
        for (String[] w:students){
            for (String k: w) {
                if (k.contains("m")){
                    System.out.println(k);
                }

            }

        }

        //Ornek 2: Bir integer multidimensional array olusturu,tum elemanlarin carpimini hesaplayiniz
        int nums [][]= {{5,4},{2,3,2},{7}};
        int carpim =1;
        for (int[] w:nums) {
            for (int c:w){
                carpim =carpim*c;

            }

        }
        System.out.println(carpim);
    }
}
