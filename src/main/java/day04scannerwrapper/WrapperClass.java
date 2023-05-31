package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {
        // primitive  non-primitive arsındaki fark : METHOD dur. Primitive de Method yok
        //Primitive    :       char   -  boolean -  byte - short - int    -  long - float - double
        //Wrapper Class: Character-  Boolean -  Byte - Short - Integer - Long - Float - Double
        //Wrapper Class larda method (aktif ozellik) var
        //Wrapper Class lar non-primitive dir. Bundan dolayi memmory de cok yer kaplarlar.dolayisiyla sart
        //degilse Wrapper Class kullanmayi tercih etmeyiz ama var oldugunu biliriz
        // n yazip nokta koyarsaniz hic method göremezsiniz cünkü primitive ler method icermez
        int n =12;
        //m yazip nokta koyarsaniz bircok method görürsünüz cünkü Wrapper Class lar method icerir
        Integer m =12 ;
        //Örnekler
        byte p = 33;
        Byte r = 44;
        //Short data type nin min ve max degerlerini kod yazarak bulunuz
        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);
        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);

        //Ornek 2: int data type nin minimum degeri ile byte data type nin maximum degerinin toplamini bulunuz
        int minInt =Integer.MIN_VALUE;
        byte maxByte =Byte.MAX_VALUE;
        System.out.println(minInt+ maxByte);

        int maxInt =Integer.MAX_VALUE;
        byte minByte =Byte.MIN_VALUE;
        System.out.println("maxInt*minByte = " + maxInt * minByte);

        //Ornek 3: Primitive int i wrapper Integer a ceviriniz (Autoboxing)
        int num = 12;
        Integer wrapperNum =num;
        int num2 = 22;
        Integer wrapperNum2 =num2;
        System.out.println("num2 = " + num2);
        System.out.println("wrapperNum2 = " + wrapperNum2);

        //Ornek 4: Wrapper Byte i primitive byte a ceviriniz (Unboxing)
        Byte k=12;
        System.out.println(k);
        byte  primitiveK= k;
        System.out.println(primitiveK);

        //Ornek 5: Primitive char i Wrapper Character e ceviriniz
        char inital= 'x';
        Character initalWrapper=inital;

        //Ornek 6 : Wrapper Boolean i primitive boolean a ceviriniz
        Boolean isOldWrapper= true;
        boolean isOldPrimitive = isOldWrapper;








} }
