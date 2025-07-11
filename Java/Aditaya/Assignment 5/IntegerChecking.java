/*
Program to accept a set of command line arguments and check whether they are in valid integer format.
Raise message otherwise. It also counts the number of invalid integers.

Author: Aditaya Samui
Date: 10-07-2025
*/

public class IntegerChecking {
    public static void main(String[] args) {
        int error=0;        //Stores number of invalid integers

        for (int i=0; i < args.length; i++) {
            try {
                Integer.parseInt(args[i]);  //Try to parse the argument as an integer
                System.out.println(args[i] + " : valid integer");
            } 
            catch (NumberFormatException e) {
                error++;
                System.out.println(args[i] + " : invalid integer");
            }
        }
        
        System.out.println("Number of invalid integer formats = "+error);
    }
}
