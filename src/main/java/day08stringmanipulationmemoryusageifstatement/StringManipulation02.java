package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation02 {
    public static void main(String[] args) {
        //Ornek :  Bir string in belirli bir karakterinden baslayarak belirli bir karaktere kadar dynamic olarak aliniz
        //      abc@gmail.com   ===> gmail
        String a ="abc@gmail.com";

        int startingIndex =a.indexOf('@');
        int endingIndex = a.indexOf('.');
        String companyName = a.substring(startingIndex, endingIndex);
        System.out.println("companyName = " + companyName);//companyName = gmail

        // Java da Memory Kullanimi
        /*
        java da iki tane memory vardir
        1)Stack Memory ==> small
            a)Kucuk memorydir
            b)Primitive leri ve Non-Primitivelerin adreslerini (reference) tutar

        2) Heap Memory ==> Huge
            a)Buyuk memory dir
            b)Non-Primitive datalari icerir
            ==>Java heap memory de yerlestirilen tum Non-primitive datalar icin bir adres olusturur
            ve bu adresi stack memory de saklar
         */

        /*
        Note: String lerin esitliklerini kontrol ederken "==" yerine "equals()" methodu kullaniriz
        Neden kullaniriz?
        Cunku; "==" sembolu iki string i karsilastirirken hem adreslerine hemde degerlerine bakar,
        ikiside ayni ise stringler esittir de. ama biz code yazarken genellikle Stringlerin adressleri ile degil
        degerleri ile ilgileniriz. Bu yuzden String karsilastirmalarinda "==" kullanmayiz

        "equals()" methodu ise iki string i karsilastirirken sadece degerlerine bakar. degerleri ayni ise bu iki string
        esittir der, degerler farkli ise bu iki string farklidir der ki bu bizim kod yazarken ihtiyac duyudugumuz seydir

          Örnekleme :
          Az miktardaki parayı Cüzdanımızda taşırız ( Stack Memory ).
          Cüzdana sığmayacak miktardaki parayı Banka'da saklamayı tercih ederiz. ( Heap Memory ).
          Banka'daki paramıza ulaşmak için gerekli Hesap Bilgilerini de yine Cüzdanımızda saklarız ( Referance - Adres )
         */
        //Ornek 2:Verilen iki string in birbirinin aynisi olup olmadigini kontrol eden kodu yaziniz
        String h = "ali Can";
        String i = "Ali Can";
        boolean result = h.equals(i);
        System.out.println(result);//false
        //___________________________________________________________________________________________________________________________
        //Java da Memory kullanimi
        /*
        java da iki tane memory vardir
        1)Stack Memory ==> small
            a)Kucuk memorydir
            b)Primitive leri ve Non-Primitivelerin adreslerini (reference) tutar

        2) Heap Memory ==> Huge
            a)Buyuk memory dir
            b)Non-Primitive datalari icerir
            ==>Java heap memory de yerlestirilen tum Non-primitive datalar icin bir adres olusturur
            ve bu adresi stack memory de saklar
         */

        /*
        Note: String lerin esitliklerini kontrol ederken "==" yerine "equals()" methodu kullaniriz
        Neden kullaniriz?
        Cunku; "==" sembolu iki string i karsilastirirken hem adreslerine hemde degerlerine bakar,
        ikiside ayni ise stringler esittir de. ama biz code yazarken genellikle Stringlerin adressleri ile degil
        degerleri ile ilgileniriz. Bu yuzden String karsilastirmalarinda "==" kullanmayiz

        "equals()" methodu ise iki string i karsilastirirken sadece degerlerine bakar. degerleri ayni ise bu iki string
        esittir der, degerler farkli ise bu iki string farklidir der ki bu bizim kod yazarken ihtiyac duyudugumuz seydir
         */

        String s = "Tom";
        String t = "Terry";
        String r = new String("Tom");

        System.out.println(s == t);//false cunku adresler ve degerler farklidir
        System.out.println(s.equals(t));//false cunku degerler farkli
        System.out.println(s==r);//false cunku adresler farkli
        System.out.println(s.equals(r));//true cunku equals() sadece degerlere bakar."s" ve "r" nin degerleri ayni oldugunda true verir
//___________________________________________________________________________________________________________________________
        //Ornek 3: Verilen iki string in birbirinin aynisi olup olmadigini buyuk harf kucuk harf dikkate almadan
        // kontrol eden kodu yaziniz
        //equalsIgnoreCase()iki string in birbirinin aynisi olup olmadigini buyuk harf kucuk harf dikkate almadan kontrol eder

        String j = "ali Can";
        String k = "Ali Can";
        boolean result3 =j.equalsIgnoreCase(k);
        System.out.println(result3);//true

    /*Homework
    1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz
    2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console a buyuk harflerle yazdiriniz
    3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini console a yazdiriniz
    4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin ilk harfini buyuk harfle diger harflerini kucuk harflerle
    console a yazdirin
    5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        a)En az 6 character olsun
        b)En az bir tane buyuk harf olsun
        c)En az bir tane kucuk harf olsun
        d)En az bir tane rakam olsun

    Note 1: Once canli oturum sirasinda cozulen ornekleri yapiniz
    Note 2: Tum sorulari dinamik kodlarla cozulmelidir
    Note 3: Birbirinizin cozumlerini inceleyerek tavsiyede bulunabilir yada yardim isteyebilirsiniz

    // * * * HOMEWORK * * *


        //Odev-1: Bir String variable olusturunuz ve bu String'de ki rakam olmayan tum karakterlerin sayisini console'a
        //   yazdiriniz.
        String odev1 = "Moss ile Oslo arasi 60km, Oslo Stavanger arasi 647 km'dir.";
        int a = odev1.replaceAll("[0-9]","").length();
        System.out.println("Odev-1: " + a);

        // Odev-2: Bir String variable olusturunuz ve ilk karakter ile son karakter disinda ki tum characterleri console'a
        // buyuk harflerle yazdiriniz.
        String b = "Svalbard dunyan'nin sonundadiR";
        String ılkHarf = b.substring(0,1).toLowerCase();
        String sonHarf = b.substring(b.length()-1).toLowerCase();
        String kalan = b.substring(1, b.length() - 1);
        String sonuc = kalan.toUpperCase();
        System.out.println("Odev-2: " +ılkHarf+sonuc+sonHarf);



        //Odev-3: Bir String variable olusturunuz ve bu String'de ki ilk ve son character'lerin ASCII degerleri toplamini
        //console yazdiriniz.
        String odev3 = "Bir String variable olusturunuz";
        char c1 = odev3.charAt(0);
        char c2 = odev3.charAt(30);
        System.out.println("Odev-3: " +(c1+c2));

        //Odev-4: Tek kelimeli bi sehir ismi icin Strin Variable olusturun ve sehir isminin ilk harfini buyuk,
        //   diger harflerini kucuk harflerle yazdiriniz.
        String odev4 ="moss";
        String od4= odev4.substring(0,1).toUpperCase()+odev4.substring(1,4);
        System.out.println("Odev-4: " + od4);


        /*
        5- Asagida ki kurallara gore kullanicin girdigi password' u kontrol ediniz
               a- En az 6 character
               b- En az 1 tane buyuk harf olsun
               c- En az 1 tane kucuk harf olsun
               d- En az 1 tane rakam olsun
            Not-1: Once canli oturum sirasinda cozulen ornekleri yapiniz.
            Not-2: Tum sorulari dinamik kodlarla cozulmelidir.
            Not-3: Birbirinizin cozumlerini inceleyerek tavsiyede bulunabilir veya yardim isteyebilirsiniz.


        Scanner sifre = new Scanner(System.in);
        System.out.println("Luften 6 haneli sifenizi giriniz.");
        String pass = sifre.nextLine();
        boolean a5 = pass.length()>5;
        boolean b5 = pass.replaceAll("[^A-Z]","").length()>0;
        boolean c5 = pass.replaceAll("[^a-z]","").length()>0;
        boolean d5 = pass.replaceAll("[^0-9]","").length()>0;

        System.out.println("Odev-5: " + (a5&&b5&&c5&&d5));


     */
        //Odev 2):Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console a buyuk harflerle yazdiriniz
        // Java  ==> AV
        String str = "Java";
        int sonIndex = str.length()-1;
        String sonuc = str.substring(1,sonIndex).toUpperCase();
        System.out.println(sonuc);

    }
}
