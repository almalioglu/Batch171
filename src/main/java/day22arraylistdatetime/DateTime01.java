package day22arraylistdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        //Icinde bulundugumuz zaman dilimindeki tarihi nasil alırız
        LocalDate myCurrentDate=LocalDate.now();
        System.out.println(myCurrentDate);//2023-06-07

        //Tarihten istedigimiz bileşeni(gun,ay,yıl..) nasıl aliriz?
       int montValue= myCurrentDate.getMonthValue();
        System.out.println(montValue);//6
       int yearValue= myCurrentDate.getYear();
        System.out.println(yearValue);//2023
       int dayValue= myCurrentDate.getDayOfMonth();
        System.out.println(dayValue);//7
        Month monthName=myCurrentDate.getMonth();//Month bir Enum dur
        // Enum ise java da sabit degerleri(ay isimleri,gun isimleri,ulkedeki sehir isimleri)depolamak icin kullanilir.
        System.out.println(monthName);//JUNE

       DayOfWeek dayName= myCurrentDate.getDayOfWeek();
        System.out.println(dayName);//WEDNESDAY

        System.out.println(myCurrentDate.plusDays(5).plusMonths(5).plusYears(5));//tarih ekleme,gelecek
        System.out.println(myCurrentDate.minusYears(10).minusMonths(10).minusDays(10));//tarih cıkarma,gecmis

        //Specific bir tarih nasil alınir
      LocalDate date1=  LocalDate.of(1980,8,10);
      LocalDate date2=  LocalDate.of(1990,8,10);
        System.out.println(date1);//1980-08-10
        //Bir tarihin baska bir tarihten sonra olup olmadigini nail kontrol ederiz
        boolean r1 =date1.isAfter(date2);
        System.out.println(r1);//false

        //Bir tarihin baska bir tarihten once olup olm. nasıl kontrol ederiz
       boolean r2= date1.isBefore(date2);
        System.out.println(r2);//true

        //
        boolean r3 =date1.isEqual(date2);
        System.out.println(r3);//false

        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen year,month ve day i sırayla girin");
       int year= input.nextInt();
       int month= input.nextInt();
       int day= input.nextInt();
      LocalDate givenDate= LocalDate.of(year,month,day);
      if (givenDate.isBefore(LocalDate.now())){
          System.out.println(givenDate+ "invalid date gecersiz");
    }else {
          System.out.println("Enter time for the ticket");
      }

      }
}
