package day19passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {
        //PassByValue--> bize kopya variable degeri verip orjinali koruyor.
        // Biz kopya üzerinde islem yapıyoruz.
        // Note : Java "pass by value" sayeesinde value larin original degerlerini korur.
        int shirtPrice = 100;

        // java method a gonderirken orjinal degeri degil, kopyasini gonderir ve degisen deger kopya deger olur.
        System.out.println(discount("student", shirtPrice)); // 90
        System.out.println(discount("veteran", shirtPrice)); // 80
        System.out.println(discount("senior", shirtPrice)); // 95


        // Normalde indirim yaptik discount method u ile ama buradaki deger hala original
        System.out.println(shirtPrice);
        shirtPrice= discount("veteran",shirtPrice);
        System.out.println(shirtPrice);

    }
    // Discount methodunu olusturalim
    public static int discount(String type, int price){

        switch (type){
            case "student":

                price -= 10;
                break;

            case "veteran":

                price -= 20;
                break;

            case "senior":

                price -= 5;
                break;

            default:

                price = price;
        }

        return price;

    }

    /*
    Pass By Value:
    1) Java "pass by value" kullanir
    2) Yani java method larin original degeri degistirmesine musade etmez
    3) Java method lara deger yollarken orjinal degerin kopyasini olusturur veo o kopyayi method a yollar.
        Method kopya deger uzerinde degisiklik yapar, boylece original deger korunmus olur.
     4) java esnek bir dildir,istersek yazdigimiz kod ile orjinal degerin degismesini de temin edebiliriz

     Pass By Reference:
    1) Pass by Reference da method a reference yollanir
    2) Reference adres demektir. Adress yollaninca method adresi kullanarak orjinal degere ulasir ve orjinal degeri degistir.
    Bu yuzden "C#" gibi Pass By Reference kullanan dillerde method variable in orjinal degerini degistirir.
     */
    }

