package day20statickeywordconstructors;

public class Car {
    /*Constructor nedir?
    Class dan object uretmemize yarayan cod blocklaridir
    Class olusturdugumuzda java bize otomatik olarak bir constructor verir.Ama gozle gorulmez
    gozle gorulmeyen otomatik olarak java tarafindan verilen bu constructor lara "default constructor" denir
    default constructor.. Car(){} seklindedir

    Bir class da farkli parametreler kullanarak istediginiz kadar constructor olusturabililirsiniz
     farkli constructorlar sayesinde bir class dan farkli farkli objectler olusturabilirsiniz.

     1)Constructor nasil olusturulur?
     Access modifier + Class ismi + () + {}

     Interview sorusu
     2) Method ile Constructor arasindaki farklar nelerdir?
        a) Methodlarda return type olur constructor larda olmaz
        b) Methodlar yaptiklari ise gore isimlendirilirler, Constructorlar ise her zaman "Class ismi" ile isimlendirilirler
        c) Method lar bir aksiyon yapmak icin olusturulurlar. Constructorlar ise object olusturmak icindir
        d) Method isimleri kucuk harfle baslar, Constructor isimleri class isimleri ile ayni oldugu icin buyuk harfle baslar
     3)Parametreli Constructorlar olusturarak ayni class dan farkli ozelliklere sahip objectler olusturabiliriz
     */

    String make="Honda";
    String model ="Accord";
    int year=2023;
    boolean hybrid=true;
    //bu kaliptan object olusturmak icin constuctor olmazsa olmazdir
    //java arka planda defult olarak bir constructor koyar

    public Car(String make,String model, int year,boolean hybrid){
       this.make =make;//bu class daki make e benim verdigim make i ata
       this.model =model;//bu class daki model e benim verdigim model i ata
       this.year =year;//bu class daki year e benim verdigim year i ata
       this.hybrid =hybrid;//bu class daki hybrid e benim verdigim hybrid i ata

    }

    public Car(String make, String model){
      this.make= make;
      this.model= model;
    }
    //saga tikla Generate a bas sonra Constructor a bas
    //istedigimiz ozellikleri secip ok yapariz
    //bu sekilde istedigimiz kadar constructor yapabilirim
    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public Car(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
