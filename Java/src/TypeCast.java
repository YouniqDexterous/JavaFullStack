public class TypeCast {
    public static void main(String[] args) {
//Widening:
        int i = 123;
        double d1 = i;

//Narrow:
        double d = 123.678;
        int i1 = (int) d;


        System.out.println("int "+ i +" to Double: "+ d1);
        System.out.println("Double "+d+" to int: "+ i1);

    }
}

/*
Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte

 */