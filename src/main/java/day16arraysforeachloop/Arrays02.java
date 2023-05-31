package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Ornek 1: String array olusturun icine 5 eleman ekleyin,
        // ilk eleman ve son elemanin icerdigi karakter sayisi toplamini ekrana yazdirin
        String arr[]= new String[5];
        arr [0]="Math";
        arr [1]="Science";
        arr [2]="Music";
        arr [3]="English";
        arr [4]="Art";
        System.out.println(Arrays.toString(arr));//[Math, Science, Music, English, Art]
        System.out.println(arr[0].length() + arr[arr.length - 1].length());

        //Ornek 2:String bir array olusturun icine 5 eleman yerlestirin
        //tum elemanlarin icerdigi karakter sayilari toplamini ekrana yazdirin
        String brr[]= new String[5];
        brr [0]="Sivas";
        brr [1]="Istanbul";
        brr [2]="Ankara";
        brr [3]="Izmir";
        brr [4]="Erzurum";

        //1.yol for loop
        int totalChar=0;
        for (int i = 0; i < brr.length; i++) {
            totalChar =totalChar + brr[i].length();
        }
        System.out.println(totalChar);

        //2.yol for each loop (enhanced loop-->zenginlestirilmis loop)
        //Baslangic degeri, loopun calisma sarti ve increment/decrement kismini kendisi halleder
        //for-each-loop " Array" lerde ve "collection" larda kullanilir
        /* Kalibini olusturalim
        for (DataType w: arr/collection name ){
            calisacak kodlar

         */
        int sum=0;
        for (String w:brr){
           sum = sum + w.length();
        }
        System.out.println(sum);

        //Ornek 3: Notlar adinda integer bir variable olusrurun icine 6 tane not yerlestirin ve not ortalamasini ekrana yazdirin
        int notlar []= new int[6];
        notlar[0]=50;
        notlar[1]=60;
        notlar[2]=70;
        notlar[3]=80;
        notlar[4]=40;
        notlar[5]=90;
        System.out.println(Arrays.toString(notlar));
        int toplam =0;
        for (int w:notlar){
          toplam =toplam+w;

        }
        System.out.println(toplam/ notlar.length);
    }
}
