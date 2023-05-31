package day02datatypesmethodcreation;

public class MethodCreation01 {
    /* Java da method nasıl olusturulur?
    1)main methodun dısında classın ıcınde olusturulur
    2) Access Modifier + return type + method ismi + () + {}

    Olusturulan methodlar nasil kullanilir?
 1) Methodu olusturmak methodu calistirmak icin yeterli degildir.Kullanilmak istenen method
     main method un icinden kullanilir
 2) method'un ismini + () yazin
 3) varsa islem yapacagınız datalari parantezin icine koyun
     bu islem method call (method cagirma) olarak adlandirilir
4) method name + parametreler ==> method signature

     */
    public static void main(String[] args) {
       int sonuc = toplamaYap(3,5);
       System.out.println(sonuc);
      long carpmaSonucu = multiply(4,5);
      System.out.println(carpmaSonucu);

        System.out.println(firstTwoMultiplyThirdAdd(2,3,4));
        double alanSonuc = daireninAlanı(3,5);
        System.out.println("alanSonuc = " + alanSonuc);
        }


    //Ornek 1: toplama islemi yapan bir method olusturun ve kullanınız
    public static int toplamaYap(int a, int b){//bu kısımda method kapsamında kullanılmasını ve ıslenmesını ıstedıgımız dataları deklara edıyoruz
        return a+b;
        //return demek bu methodun cagrıldıgı yere bu degeri return et demek
        //main method static oldugu icin main method icinde kullanacagımız method static olmalıdır

    }
    //Ornek 2 : 2 sayıyı carpma islemi yapan bir method olusturun ve kullanın
    protected static long multiply(int a, int b){
        return a*b;

    }


    private static int firstTwoMultiplyThirdAdd(int a, int b , int c){
       return a*b+c;
    }
    public static double daireninAlanı(int pi, int r){return pi*r*r; }

    /* Homwork
 1) Dikdortgenin alanını hesaplayan methodu olusturun ve kullanın
   2) Dikdortgenin cevresini hesaplayan methodu olussturun ve kullanın

 */
}
