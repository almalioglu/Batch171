package day02datatypesmethodcreation;

public class Homework02 {
    public static void main(String[] args) {
        int alan= dikdortgeninAlani(9,10);
        System.out.println(alan);

        int cevre= dikdortgeniniCevresi(8,13);
        System.out.println(cevre);

    }
    //HW 1: Dikdortgenin alanını hesaplayan methodu olusturun ve kullanın
    private static int dikdortgeninAlani(int a, int b){
       return a*b;
    }
    //HW 2: Dikdortgenin cevresini hesaplayan methodu olussturun ve kullanın
    protected static int dikdortgeniniCevresi(int a,int b){
        return 2*(a+b);
    }
}
