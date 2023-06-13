package day23datetimearargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class DateTime02 {
    public static void main(String[] args) {
        //Anlik zamani nasil alırız?
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);//21:02:05.931493300

        //Anlik zamanda  bilesenler nasil alinir?
        int hour = myCurrentTime.getHour();//saat
        System.out.println(hour);

        int minute = myCurrentTime.getMinute();//dakika
        System.out.println(minute);

        int second = myCurrentTime.getSecond();//saniye
        System.out.println(second);

        int nano = myCurrentTime.getNano();//nano saniye
        System.out.println(nano);

        //Gelecek ve gecmise nasil gidilir?
        LocalTime next = myCurrentTime.plusMinutes(13).plusHours(3).minusMinutes(13).minusHours(3);
        System.out.println(next);//21:13:26.713882300

        //Zaman formati nasil degistirilir?
        /*
        DateTime class da kullnilan tarih saat formatlari
        "HH : mm" --> 24 lü saat sistemi
        "hh : mm" --> 12 li saat sistemi
        "hh : mm a" --> 12 li saat sistemi AM,PM gosterilir
        "HH : mm : ss" --> 24 lü saat sistemi
        "HH : MM" -->YANLIS FORMAT MM aylar icin kullanilir
        "mm"-->minute   "MM"--> month demektir

        dd-MM-yyyy --> gun ay yil
        MMM --> AUG
        MMMM-->August
        */
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm");
        String formattedMyCurrentTime = dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime);//21:32

        //Date formati nasil degistirilir?
        LocalDate myDate = LocalDate.of(2023, 8, 13);
        System.out.println(myDate);//2023-08-13

        //Tarihi AY/GUN/YIL sekline ceviriniz?
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formatedMydate = dtf2.format(myDate);
        System.out.println(formatedMydate);

        //Tarihi GUN/Ay isminin il 3harfi/YIL
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String yeniFormat= dtf3.format(myDate);
        System.out.println(yeniFormat);

        // GUN/AY ismi/YIL
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String yeniFormat2= dtf4.format(myDate);
        System.out.println(yeniFormat2);

        //Baska bir zaman dilimindeki tarih ve zamani nasil alabiliriz?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);//2023-06-11

        //Amsterdam da ayin kaci?
        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);

        //Tokyoda Saat kac?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);

        //Berlin de saat kac?
        LocalTime timeInBerlin = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeInBerlin);
    }
}
