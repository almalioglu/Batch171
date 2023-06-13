package day24stringbuilder;

public class Sb02 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java is easy");
        System.out.println(sb1);//Java is easy

        sb1.reverse();//reverse String i ters cevirmek icin kısa yol methodudur.
        System.out.println(sb1);//ysae si avaJ

        sb1.deleteCharAt(6);//6. index teki karakteri SILER
        System.out.println(sb1);//ysae s avaJ

        sb1.delete(2,5);//Baslangic dahil Bitis haric e kadar karakterleri SILER
        System.out.println(sb1);//yss avaJ

        sb1.replace(2,5,"ZAMAN");//start dahil end haric e kadarki karakterleri "ZAMAN" la DEGISTIRIR
        System.out.println(sb1);//ysZAMANvaJ

        sb1.insert(3,"XXX");//3. index in yerine "XXX" i EKLER.(4.karakterin yerine ekler)
        System.out.println(sb1);//ysZXXXAMANvaJ

        StringBuilder sb2 =new StringBuilder("Java");
        StringBuilder sb3=new StringBuilder("Kava");
        //Sonuc 0 ise sb2 ve sb3 alfabetic olarak ayni siradalar demektir
        //Sonuc -1 ise sb2 , sb3 ten alfabetic olarak 1 onde demektir
        //Sonuc 1 ise sb2 , sb3 ten alfabetic olarak 1 sonra demektir

        int r1=sb2.compareTo(sb3);
        System.out.println(r1);//-1 yani sb2 sb3 ten 1 onde

        //String nasil string builder a cevrilir
        String str =sb2.toString().toUpperCase();
        System.out.println(str);//JAVA

        //String nasil string builder a cevrilir?
        StringBuilder newSb2=new StringBuilder(str);
        System.out.println(newSb2);//JAVA
    }

}
