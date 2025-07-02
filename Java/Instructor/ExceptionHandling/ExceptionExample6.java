/*
 * 
 * An example of usage of throws keyword.
 * 
 * 
 */


public class ExceptionExample6 extends Throwable{

    ExceptionExample6(){
        String str1="Custom Exception.";

        System.out.println(str1);
        System.out.println("Error in commands.");

        if (str1.equals(""))
        {
            System.out.println("String comparison.");
        }
    }

    static String throwsExample() throws NullPointerException
    {
        String str2 = null;
        str2.length();
        return str2;

    }

    public static void main(String[] args) throws NullPointerException{
        int var1 = 1;
        int var0 = 3; // Changed

        int [] arr1= new int [4];

        int number_of_exceptions_occured = 0;

        try{

        System.out.println(var1/var0);
        arr1[0] = 3 ;
        throwsExample();

        throw new ExceptionExample6();
 

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
        catch(ExceptionExample6 ue)
        {
            System.out.println("Custom Exception is caught.");
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