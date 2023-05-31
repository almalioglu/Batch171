package day16arraysforeachloop;

import java.util.Arrays;

public class Array03 {
    public static void main(String[] args) {
        //Ornek 1: Integer bir array olusturun,icine 6 eleman yerlestiriniz
        //Bu elemanlarin en kucuk ile en buyuk olanin toplamini ekrana yazdirin

        int ages[]= new int[6];
        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;
        System.out.println(Arrays.toString(ages));//[20, 23, 19, 44, 15, 32]

        //1.yol
        //sort() methodu array deki elemanlari kucukten buyuke dizer
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0]+ages[ages.length-1]);

        //2.yol
        int minimum = ages[0];// 0,1,2..hepsini verebiliriz
        int maximum = ages[0];
        for (int w :ages) {
            minimum = Math.min(minimum,w);
            maximum = Math.max(maximum,w);
        }
        System.out.println(maximum + minimum);

        //Ornek 2: String bir array olusturalim,6 eleman ekleyin ve yellow dan onceki elemanlari yazdirin
        String colors []= new String[6];
        colors[0]="Red";
        colors[1]="Orange";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";
        System.out.println(Arrays.toString(colors));
        for (String w:colors){
            if (w.equals("Yellow")){
                break;
            }
            System.out.println(w);
        }
    }
}
