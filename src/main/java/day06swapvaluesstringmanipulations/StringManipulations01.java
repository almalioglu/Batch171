package day06swapvaluesstringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        //String bir non-primitive data type dir ve ayni zamanda bir classdir
        String s = "Java is easy";

        //Ornek1: "s" Stringindeki tum characterleri buyuk harf yapiniz
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);//JAVA İS EASY

        //Ornek2: "s" Stringindeki tum characterleri kucuk harf yapiniz
        String sLower = s.toLowerCase();
        System.out.println(sLower);//java is easy

        //Ornek 3: "s" Stringindeki ilk characteri aliniz
          char firstChar = s.charAt(0);
        System.out.println(firstChar);//J

        //Ornek 4: "s" stringindeki ikinci ve sondan ikinci karakteri yazınız
       char secondChar= s.charAt(1);
       char secondLastChar = s.charAt(10);
        System.out.println(""+secondChar+secondLastChar);//as //başa koydugumuz "" toplama yapmasın  yanı strıng olarak algılasın dıye koyduk

        //Ornek 5: "s" stringinde kullanilan character sayisini bulunuz
        int sLength = s.length();// "s" sepetine bak character sayisini soyle(bosluklar dahil)
        System.out.println(sLength);//12

        //Ornek 6:"s" string'indeki ilk 4 characteri aliniz
        //substring kullaniminda ilk index dahildir,ikinci index harictir
        String sub1 = s.substring(0,4);
        System.out.println(sub1);//Java

        //Ornek 7: "s" stringindeki "is" kelimesini alin
        String isKelimesi =s.substring(5,7);
        System.out.println(isKelimesi);//is

        //Ornek 8:"s" stringindeki easy kelimesini alın
        String easyKelime =s.substring(8,12);
        System.out.println(easyKelime);//easy
        //2.yol
        String ikiDahil =s.substring(2);
        System.out.println(ikiDahil);//va is easy

        //Ornek 9:"s" stringindeki "money" kelimesinin var olup olmadigini kontrol edin
        boolean isExist = s.contains("money");// contains= icermek   isExist= var mi?
        System.out.println(isExist);//false

        boolean isExist2 = s.contains("Java");
        System.out.println(isExist2);//true

        boolean isExist3 = s.contains("");
        System.out.println(isExist3);//true (bir bosluk var)

        //Ornek 10: "s" stringinin belli bir harfle ya da harflerle baslayip baslamadigini kontrol ediniz
       boolean isStart = s.startsWith("Java");
        System.out.println(isStart);//true

        //Ornek 11:"s" string'inin 5. index dahil olmak uzere bu index ten itibaren "i" characteri ile baslayip baslamadigini kontrol edin
       boolean isStart1 = s.startsWith("i",5);
        System.out.println(isStart1);//true
         boolean isStart2 = s.startsWith("a",4);
        System.out.println(isStart2);//false


    }
}
