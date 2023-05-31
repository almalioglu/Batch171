package day05concatinationoperatorstypecasting;

public class AsciiValues {
    public static void main(String[] args) {

        /*
        java da her karakterin sayisal bir degeri vardir
        Bu degerler ASCII degerler olarak adlandirilir
        Bu degerlerin tamaminin bulundugu tabloya ASCII Table denir
         */
        char a = 'a';
        System.out.println(a);//a

        //Herhangi bir character'in ASCII degerini bulmak icin o karakteri "int" data type inda bir variable icine koyunuz
        int intA = 'a';
        System.out.println(intA);//97
        int yildiz ='*';
        System.out.println("yildiz = " + yildiz);

        byte unlem = '!';
        System.out.println(unlem);//33
        int unlem2 ='!';
        System.out.println("unlem2 = " + unlem2);

        char c1 = 'K';
        char c2 =  '?';
        System.out.println(c1+c2);//138
        //java da char lari matematiksel islemlerde kullanirsaniz, java char larin ASCII degerlerini kullanir

    }
}
