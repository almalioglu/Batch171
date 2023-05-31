package day13loops;

public class Loops02 {
    public static void main(String[] args) {
        //Ornek 1:21 den 180 e kadar hem 2 hem de 3 ile tam bolunebilen tam sayılari ekrana yazdiran kodu yazdirin
        for (int i=21;    i<181    ;   i++  ){
            if (i%2==0 && i%3==0) System.out.print(i+" ");//i-- dersek veya sartlardan birini yazmazsak sonsuz loop olur;RAM i yer ,intellj i kapatip tekrar acin
        }
        System.out.println("\n");
        //Ornek 2: Size verilen kucuk harfle yazilmis Stringini index i cift sayi olan characterlerini buyuk harfle yazdirin
        //  ankara ==>AKR

        String s ="ankara";
                         //i<==s.length()-1 de diyebiliriz ama aşd. tavsiye edilir
        for (int i=0;  i< s.length(); i++){
           String ch =s.substring(i,i+1);
            if (i%2==0){
                System.out.println(ch.toUpperCase());
            }
        }
        //Ornek 3: verilen bir string de ilk a harfinden inceki tum characterleri console a yazdiriniz
        // "I love Java" ==> " I love J"
        String s1 ="I love Java";
        for (int i=0;i<s1.length();i++){
            char ch =s1.charAt(i);
            if (ch=='a'){
                break;

            }
            System.out.print(ch);
        }
        System.out.println("\n");

        //Ornek 4: verilen bir string de son 'a' dan sonraki tum characterleri ters sirada yaziniz
        //"Germany" ==> yn
        String t = "Germany";
        for (int i =t.length()-1; i>=0; i--){
            if (t.charAt(i)=='a'){
                break;
            }
            System.out.print(t.charAt(i));
        }

    }
}
