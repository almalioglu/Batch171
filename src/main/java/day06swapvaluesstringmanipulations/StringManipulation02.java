package day06swapvaluesstringmanipulations;

public class StringManipulation02 {
    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //Ornek 1: "s" string inin "money" ile bitip bitmedigini kontrol edin
        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);

        //Ornek 2: "s" string inindeki "money" kelimesini "dollar" kelimesine cevirin
      String s1 = s.replace("money","dollar");
        System.out.println(s1);//Learn Java earn dollar

        //Ornek 3:"s" string inindeki "earn" kelimesini "win" kelimesine cevirin
        String s2 =s.replace("earn","win");
        System.out.println(s2);//Lwin Java win money

        //Ornek 4: "s" stringindeki tüm "a" harflerini "*" a cevirin
       String s3 = s.replace('a','*');
        System.out.println(s3);//Le*rn J*v* e*rn money


        //Ornek 5: "s" stringindeki tüm n harflerini xxx e cevirin
        String s4 =s.replace("n","xxx");
        System.out.println(s4);//Learxxx Java earxxx moxxxey

        //Ornek 6:"s" stringindeki tüm e harflerini silin
        String s5 =s.replace("e","");
        System.out.println(s5);//Larn Java arn mony

        //yeni bir method
        String t ="Ali 13 yasindadir!...";
        //Ornek 7: "t" stringindeki tüm rakamlari "*" a cevirin
        //Note:Bir grup datayi ifade etmek icin "Regular Expressions" Regex kullaniriz
        //Note:Bir grup datayi degistirmek icin replaceAll()kullanilir

        /*
  **********Meshur Regex ler ********

   1) Tum rakamlar               ==> [0-9]
   2) Tum kucuk harfler          ==> [a-z]
   3) Tum buyuk harfler          ==> [A-Z]
   4) Tum Kucuk ve buyuk harfler ==> [a-zA-Z]
   5) Tum harfler ve rakamlar    ==> [a-zA-Z0-9]
   6) Tum noktalama isaretleri   ==> \\p{Punct}
   7) Tum sesli Harfler          ==> [aeiouAEIOU]
   8) Tum x,q,w harfleri         ==> [xqw]


  ******* Olumsuz Regex ler ******

   9) Kucuk harflerden farkli tum characterler => [^a-z]
   10 Tum harflerden farkli tum characterler   =>[^a-zA-Z]
 */
        String t1 =t.replaceAll("[0-9]","*");
        System.out.println(t1);//Ali ** yasindadir!...



    }
}
