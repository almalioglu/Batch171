package day20statickeywordconstructors;

public class TeacherRunner {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Sennur",35,"Izmir");
        Teacher t2 = new Teacher("Semsettin",45);

        System.out.println(t1);
        System.out.println(t2);
    }
}
