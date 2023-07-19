import java.util.Scanner;

class MyException extends java.lang.Exception{
    public MyException(String s){
        super(s);
    }
}

class NotANumber extends Exception{
}
class Exception1{
    // Compile Time
    //Run time
    public void first(){
        try{
            int[] array = new int[]{1,2,3,4};
            for (int i = 0; i < 5; i++){
                System.out.print(array[i]);
            }System.out.println();
        }
        catch(java.lang.Exception e){
//            System.out.println("\nError Occured and handled with Exception");
        }
    }

    public void second(){
        try{
            throw new MyException("Str");
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
    }

    public void three(){
        try{
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            if (number < 0 ){
                throw new NotANumber();
            }
            else {
                System.out.println("Number is:" + number);
            }
        } catch (NotANumber e) {
            System.out.println("Enter number greater than zero");
        }
    }

}


public class UserException {
    public static void main(String[] args) {
        Exception1 example1 = new Exception1();
        example1.first(); //java based
        System.out.println();
        example1.second();//user defined
        System.out.println();
        example1.three();

    }
}

