//create interface using abstract concept
interface Test{
    //declare methods
    void method1();
    void method2();
    void method3();

}
// use override if not using abstract class to implement interface
// Should definetly implement all methods of interface...
class TestCase1 implements Test{
    @Override
    public void method1(){
        System.out.println("Defining method 1");
        this.display();
    }

    @Override
    public void method2() {
        System.out.println("Defining method 2");
    }

    @Override
    public void method3() {
        System.out.println("Defining method 3");
    }

    public void display(){
        System.out.println("Extra method");
        this.method2();
        this.method3();
    }
}

abstract class TestCase2 implements Test{
    public void method1(){
        System.out.println("Implementing in abstract defined class");
    }
}

class ExtendTestCase2 extends TestCase2{
    public void method2(){
        System.out.println("Implementing in Extended with abstract defined class");
    }
    public void method3(){
        System.out.println("Implementing in Extended with abstract defined class");
    }
}

public class Interface {
    public static void main(String[] args) {
        //implement interface by overriding all methods
        Test t1 = new TestCase1();
        t1.method1();

        //implement interface using abstract class
        TestCase2 t2 = new ExtendTestCase2();

        Test t3 = new ExtendTestCase2();
    }
}
