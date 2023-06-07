package day03Methodobjectcreationscanner;

public class HomeworkRunner03 {
    public static void main(String[] args) {
        //Homwork
        // icinde isim ve yas variable ları ıle teach methodu bulunan bir Teacher objecti olusturun
        //ve object uzerınde bu ozellıkleri kullanın
        HomworkMukemmelOgretmen03 myTeacher = new HomworkMukemmelOgretmen03();
        System.out.println("myTeacher.isim = " + myTeacher.isim);
        System.out.println("myTeacher.yas = " + myTeacher.yas);
        System.out.println("myTeacher.sinirlenmeKatsayisi = " + myTeacher.sinirlenmeKatsayisi);
        myTeacher.teach();
        myTeacher.sinir();



        //deneme :bir "kiralık ev" object i olusturalım
        HomworkMukemmelOgretmen03 kiralikEv = new HomworkMukemmelOgretmen03();
        System.out.println("kiralikEv.mahalle = " + kiralikEv.mahalle);
        System.out.println("kiralikEv.cadde = " + kiralikEv.cadde);
        System.out.println("kiralikEv.sokak = " + kiralikEv.sokak);
        System.out.println("kiralikEv.metreKare = " + kiralikEv.metreKare);
        System.out.println("kiralikEv.odaSayisi = " + kiralikEv.odaSayisi);
        kiralikEv.adres();
        kiralikEv.konum();
        kiralikEv.aciklama();

    }





}
