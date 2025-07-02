public class ExceptionExample3{

    public static void main(String[] args) {
        int var1 = 1;
        int var0 = 3; // Changed

        int [] arr1= new int [0];

        try{

        System.out.println(var1/var0);
        arr1[0] = 3 ;

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() + e.toString());
        }

        System.out.println("I must display.");
    }
}