package day21arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {

        //Bir List'in baska bir List ile ayni olup olmadigini nasil kontrol ederiz
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 =new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");
        boolean s= names1.equals(names2);
        System.out.println(s);//false verdi esit olmasi icin butun ındex ler esıt olmali

        //Ornek: Size verilen iki tane Integer List te tamamiyla ayni elemanlarin olup olmadigini kontrol eden kodu yaziniz
        ArrayList<Integer> nums1 =new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer> nums2 =new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);//nums1 i kucukten buyuke sırala
        Collections.sort(nums2);//nums2 yi kucukten buyuke sirala
        boolean t=nums1.equals(nums2);//nums1 esit mi nums2 ye

        //ArrayList te bir elemanin ilk gorunumu nasil silinir?
        ArrayList<String> cities =new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Istanbul");
        cities.add("Yozgat");
        System.out.println(cities);

        //remove() methodu bir elmanin ilk gorunumunu siler
        System.out.println(cities.remove("Miami"));//true -->sildim anlaminda
        System.out.println(cities);

        //ArrayList te bir elemani index i kullanarak nasil silinir?
        System.out.println(cities.remove(2));//Barcelona yi sildim demek istiyor
        System.out.println(cities);

        //remove() methodu index ile kullanilirsa size silmis oldugu datayi return eder.
        //remove() methodu eleman ile kullanilirsa size o elemani silip silmedigini ifade eden boolean return eder.

        //Ornek: Bir Integer List olusturun ve 12 elemanini ages List ten siliniz
        //ArrayList olustururken sag tarafa ArrayList yazmak zorundayiz
        //ama sol tarafa ister ArrayList ister List yazalim yine calisir
        //Detaylari Collections konusunda gorecegiz
        List<Integer> ages =new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

       // ages.remove(12);
       // System.out.println(ages);//hata verdi cunku 12 primitive dir
        //1.yol
       // Integer nonPrimitive=12;
        //ages.remove(nonPrimitive);
        //System.out.println(ages);

        //2.yol
        ages.remove((Integer)12);
        System.out.println(ages);

        //3. yol
       // ages.remove(Integer.valueOf(12));
       // System.out.println(ages);

        //4.yol
      //  ages.remove(ages.indexOf(12));
      //  System.out.println(ages);

        //Bir ArrayList teki bir elemanin tum gorunumlerini nasil sileriz?
        List<String> citiesToRemove =new ArrayList<>();
        citiesToRemove.add("Yozgat");
        citiesToRemove.add("Istanbul");

        cities.removeAll(citiesToRemove);
        System.out.println(cities);


    }



}
