package day21arraylists;

import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        //Kisa yoldan bir List nasil olusturulur?
       List<Integer> initials= List.of(1,2,3,4,3,2);//once List.of kısmini yaziyoruz
        System.out.println(initials);
        //List.of() methodu degistirilemez bir List olusturur********

        //initials.add(4);
        //initials.remove(initials.indexOf(2));
        //initials.set(0,7);
        System.out.println(initials);

        //indexOf(aranan karakter) methodu aranan karakterin ilk gorunumunun index ini verir
        int r1=initials.indexOf(3);
        System.out.println(r1);

        //lastIndexOf(aranan karakter) methodu aranan karakterin son gorunumunun index ini verir
        int r2=initials.lastIndexOf(2);
        System.out.println(r2);

    }
}
