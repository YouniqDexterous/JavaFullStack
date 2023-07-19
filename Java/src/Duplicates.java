public class Duplicates {
    public static void main(String[] args) {
        // array = ["hello", "world"] - output
        boolean repeat;
        for (int i = 0; i < args.length; i++){
            repeat = false;
            for (int j = 0; j < i; j++){
                if ( i!=j && args[i].equals(args[j]) )
                {
                    repeat = true;
                    break;
                }
            }
            if (!repeat)
                System.out.println(args[i]);
        }
    }


}

//input - java Duplicates hello world hello
