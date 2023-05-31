package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //ARRAY ?
        //Bu yapinin icinde sadece bir tane data depolanabilir.
        // Ama biz kod yazarken bir yapinin icinde coklui data depolama ihtiyaci hissederiz.
        //Bir yapinin icinde coklu data depolayabilmek icin java Array yapisini olusturmustur.
        //ayni data type'da birden fazla datanin saklandigi yapidir
        //Array ler diger collection lardan cok cok daha hizlidir(superfast)
        //Array ler diger collection lardan daha az memory kullanirlar

        //Array nasil olusturulur?
        String stdNames [] = new String[5];
        System.out.println(stdNames);//bu sekilde Stack memory deki adresi yazdirir boyle yazdirmayacagiz.(stack memory,Heap memory)
        System.out.println(Arrays.toString(stdNames)); //Array da yazdirmak icin bunu kullanicaz

        //Array e eleman ekleme nasil yapilir?
        //index yapisi kullanilir 0 1 2 3 4 5 ..gibi

        stdNames[2]="Benna";
        stdNames[3]="Abdullah";
        stdNames[0]="İsmail";
        stdNames[1]="ihsan";
        stdNames[4]="Zehra";
        System.out.println(Arrays.toString(stdNames));

        //Array den specific bir elemani nasil alıriz?
        System.out.println(stdNames[4]);
        
        //Ornek 1: Array deki her elemanin sonuna unlem isareti koyarak ekrana yazdirin
        //length() string lerde method(parantezli), array lerde parantezsiz yazilir(method degil)
        for (int i = 0; i <stdNames.length ; i++) {
            System.out.println(stdNames[i]+"!");
        }
        
    }
}
