package day03Methodobjectcreationscanner;

public class Methodcreation01 {

    public static void main(String[] args) {
   double kup = getCube(5);
        System.out.println("kup = " + kup);
        print("Java is easy");
        //method olusturmak için 2.YOL
        //Ornek 2: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
        //main method icinde iken method ta kullanilacak olan variable lari olusturunuz
        String str = "TechproEdu";
        //method ismi ve parametreleri yazariz
        printConsole(str);
        //kırmızı kısmın uzerınde bekleyıp Create method a tıklarız intellij olarak bir method olusturur
        //daha sonra kendimize gore dizayn ederiz
        String cesaret = "Cok onemli";
        print2(cesaret);



    }

    private static void carpmaYap(int a, int b) {
        System.out.println(a*b);
    }

    private static void printConsole(String str) {
        System.out.println(str);
        //Eger bir method yeni bir data uretmiyor ise return type i void olur
        //methodun return type i void ise method body icinde return keywordu yazilmaz.
    }

    //Ornek 1: Verilen bir ondalik sayinin kupunu hesaplayan bir method olusturup kullanınız.
    static double getCube(double a){
        return a*a*a;
        //Note : Access modifier i DEFAULT yapmak isterseniz access modifier i YAZMAYINIZ
    }
       //Ornek 2: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
    public static void print(String str){
        System.out.println(str);
        //Ornek 3: Verilen 2 tam sayıyı carpan ve sonucu ekrana yazdıran methodu olusturup kullanınız
        int a =3;
        int b=5;
        carpmaYap(a,b);
        //Ornek 4: Verilen bir tam sayinin karesini hesaplayip consola yazdiran method u olusturup kullaniniz
        int x =3;
        karesiniAl(x);
    }

    private static void karesiniAl(int x) {
        System.out.println(x*x);
    }
    private static void print2(String cesaret) {
        System.out.println("cesaret = " + cesaret);}

 /*
    Homework
    1)Cemberin cevresini hesaplayan methodu olusturunuz ve kullaniniz
    2)Dairenin alinini hesaplayan methodu olusturunuz ve kullaniniz
     */
    }
