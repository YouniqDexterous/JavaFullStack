class University{
    int ID = 102934;
}
//class Student extends University{
//    String name= "Sam";
//
//
//}
public class Inheritance extends University{
    String name = "Stu 1";

    public static void main(String[] args) {
        Inheritance inherit = new Inheritance();
        System.out.println("Student ID: "+inherit.ID);
        System.out.println("Student ID: "+inherit.name);

    }

}
