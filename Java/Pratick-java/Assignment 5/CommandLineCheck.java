/* 
Represents a program to check command line arguments.
This class verifies if there are any command line arguments, and for each argument, it checks if it's an integer or not.
It uses exception handling to determine if the argument can be parsed as an integer.

Author: Pratick Dam
Date: 10-07-2025
*/
public class CommandLineCheck{
    public static void main(String[] args) {
        //Checking the presence of Command line arguments
        if(args.length == 0){
            System.out.println("There are no command line arguments!");
            return;
        }
        //Checking if integer or not
        for(int i = 0; i<args.length; i++){
            String arg = args[i];
            try{
                int num = Integer.parseInt(arg);
                int num1 = Integer.parseInt(arg,16);
                System.out.println("No. Argument "+(i+1)+" is an integer: "+num);
                System.out.println("No. Argument "+(i+1)+" is an integer: "+num1);
            } catch (NumberFormatException e){
                System.out.println("No. Argument "+(i+1)+" is not an integer: "+arg);
            }
        }
    }
}