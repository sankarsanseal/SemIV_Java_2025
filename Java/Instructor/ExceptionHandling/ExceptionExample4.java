/*
 * 
 * 
 * Multiple catch definitions for a single try block
 * 
 * 
 */


public class ExceptionExample4{

    public static void main(String[] args) {
        int var1 = 1;
        int var0 = 3; // Changed

        int [] arr1= new int [4];

        int number_of_exceptions_occured = 0;

        try{

        System.out.println(var1/var0);
        arr1[0] = 3 ;

        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage() + e.toString());
            number_of_exceptions_occured ++;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage() + 
            ". Please check the length of the array."
            );
            number_of_exceptions_occured ++;
        }
        finally
        {
            System.out.println("Number of occurred exceptions is " 
            + number_of_exceptions_occured 
            + "." );
        }

        System.out.println("I must display.");
    }
}