package day14loops;

public class Loops02 {
    public static void main(String[] args) {
        //Ornek 1: 5 den 8 ekadar tamsayilarin toplamini veren kodu yaziniz
        int sum = 0;// toplamada 0 , etkisiz elemandir
        for (int i=5  ;i<9  ;i++ ){
            sum =sum+i;
            //  System.out.println("loop ici =>"+sum);
        }
        System.out.println(sum);

        //Ornek 2: 7 den 9 a kadar tamsayilarin carpimini veren kodu yaziniz
        int multiply =1;//carpmada 1, etkisiz elemandir
        for (int i=7; i<10 ; i++){
            multiply = multiply*i;
        }
        System.out.println(multiply);

        //Ornek 3: Verilen bir tam sayinin rakamlari toplamini veren kodu yaziniz
        //578 ==> 5+7+8=20
        int toplam =0;
        int num =-578;
        num =Math.abs(num);
        for (int i=num; i>0; i=i/10){
            toplam =toplam +i%10;
        }
        System.out.println(toplam);
    }
}
