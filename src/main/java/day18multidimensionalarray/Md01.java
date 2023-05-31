package day18multidimensionalarray;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
       //multidimensionalarray-->cok boyutlu array
       //Bir Array in elemanlari Array ise bu array ler Multidimensional Array dir.

       //Multidimensional Array nasil olusturulur?
        int a [][] = new int[3][2];

        //MultiDimensional Array lere eleman nasil eklenir?
        a[0][0] =5;
        a[1][1] =45;
        a[2][0] =123;
        a[0][1] =12;
        a[1][0] =81;
        a[2][1] =0;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.deepToString(a));
        //MultiDimensional Array leri console a yazdirmak icin "toString()" methodu degil
        //"deepToString()" methodunu kullanmaliyiz.

        //Multidimensional Array icinden specific bir eleman nasil yazdirilir?
        System.out.println(a[1][0]);
        System.out.println(a[0][0]);

        //Multidimensional Array icindeki array nasil yazdirilir?
        System.out.println(Arrays.toString(a[0]));

        //Kısa yoldan Multidimensional array nasil olusturulur?

        String students [][] = {{"Ali","Kemal"},{"İsmail"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};

        //Ornek 1: Yukaridaki students array imizde toplam kactane isim oldugunu dinamik olarak bulunuz.
        int sum = 0;
        for (String [] w: students) {
            sum= sum+w.length;
        }
        System.out.println(sum);
    }
}
