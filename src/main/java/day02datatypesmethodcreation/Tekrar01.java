package day02datatypesmethodcreation;

public class Tekrar01 {
    public static void main(String[] args) {
        int sonuc=toplamaYap(11, 22);
        System.out.println(sonuc);

       long carpim= multiply(7,11);
       System.out.println(carpim);

        long uzunislem= firstTwoMultiplyThirdAdd(3,5,7);
        System.out.println(uzunislem);

    }
    //Ornek 1: toplama islemi yapan bir method olusturun ve kullanınız
    public static int toplamaYap(int a,int b){
        return a+b;
    }
    //Ornek 2 : 2 sayıyı carpma islemi yapan bir method olusturun ve kullanın
    protected static int multiply(int a, int b){
        return a*b;
    }
    //Ornek 3: verilen 3 sayidan ilk ikisini carpan ve ucuncu sayi ile sonucu toplayan methodu olusturun ve kullanin
    private static int firstTwoMultiplyThirdAdd(int a, int b, int c){
        return a*b+c;
    }


}
