public class Exception {
    public static void main(String[] args) {
        // Compile Time
        //Run time

        try{
            int[] array = new int[]{1,2,3,4};
            for (int i = 0; i < 5; i++){
                System.out.print(array[i]);
            }System.out.println();
        }
        catch(java.lang.Exception e){
            System.out.println("\nError Occured and handled with Exception");
        }
    }
}
