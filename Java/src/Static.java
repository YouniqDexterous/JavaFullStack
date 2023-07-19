
public class Static {
    static int var1 = 0;
    int var2 = 0;
    static int statVar;

    static void method1(){
        var1 = 1;
      /*
              cannot access super, this members
          not stactic variable so cant access
        var2 = 1;

       */
        System.out.println("Variable 1 is: "+ var1 + " Variable 2 is not accessible");
    }

    void method2(){
        var1 = 2;
        this.var2 = 2;
        System.out.println("Variable 1 is: "+ var1 + " Variable 2 is: "+this.var2);

    }


    public static void main(String[] args) {
        System.out.println("Static method called without creating instance");
        method1();

        Static s = new Static();
        s.method2();
    }
}
