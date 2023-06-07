package day20statickeywordconstructors;

public class StdRunner {
    public static void main(String[] args) {
        //stdName,Static oldugu icin sadece class ismini kullanarak obje olusturmadan
        //stdName variable mize ulastik
        System.out.println(Student.stdName);//Tom Hanks

        //age, non-static oldugu icin std1 object ini olusturarak
        // age variable miza ulastik
        Student std1 =new Student();
        System.out.println(std1.age);//13

        Student.staticMethod();//Ben static methodum

        std1.nonStaticMethod();//Ben static olmayan methodum

        //String. deyince gelen methodlar Static methoddur.
        //String s=new String() deyip s. deyince gelenler non-Static methoddur

    }
}
