package day23datetimearargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime03 {
    public static void main(String[] args) {
      LocalDateTime ldt=  LocalDateTime.now();
        System.out.println(ldt);//2023-06-10T22:22:13.406983100
                                //   DATE   -     TİME
        // ltd.   yazarak içinden istenen deger alınabilir ,
        // once kalıp olusturulur
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy , hh:mm "); //küçük hh 12 saat sistemi buyuk HH 24 luk
        String formattedltd = dtf.format(ldt);
        System.out.println(formattedltd);

    }
}
