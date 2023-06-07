package day03Methodobjectcreationscanner;

public class Homework03 {
    // Homework1) Cemberin cevresini hesaplayan methodu oluşturup kullanın.
    // Homework 2)Dairenin alanını hesaplayan methodu oluşturup kullanın.
    public static void main(String[] args) {

        double pi = 3.14;
        double r = 7;
        cemberinCevresi(pi,r);
        cemberinAlani(pi,r);

        }

    private static void cemberinCevresi(double pi, double r){System.out.println(2 * pi * r);}
    private static void cemberinAlani(double pi, double r){System.out.println(pi * r * r);}

}
