abstract class Solution{
    Solution(){
        System.out.println("Constructor ");
    }
    public void method1(){
        System.out.println("Im a normal method of abstract class");
    }
     abstract void method2();
}

class ExtenSol extends Solution{
    void method2(){
        System.out.println("Abstract method of solution implemented in inherited class");
    }
}


public class Abstraction {
    public static void main(String[] args) {
        Solution sol = new ExtenSol();
        sol.method1(); // defined in abstract class
        sol.method2(); // declared in abstract and defined other palce
    }
}
