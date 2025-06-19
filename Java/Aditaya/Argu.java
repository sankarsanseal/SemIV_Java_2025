/* Program to take command line arguments and check whether the argument is a valid integer or not */

public class Argu {     //Class delaration
    public static void main(String args[])      //main function
    {
        int i;
        System.out.println("Number of arguments "+args.length);     //args.length returns the total number of arguments
        
        //for loop is used for accessing each argument in args[] array and adding them to sum
        for(i=0;i<args.length;i++)
        {
            System.out.print("Arg "+i+": "+args[i]);    //used to display the arguments
            
            //try-catch block excpetion handling is used to handle any non integer value
            try 
            {
                Integer.parseInt(args[i]); //Integer.parseInt converts each string argument to int
                System.out.println(", Valid Number format.");
            } 
            catch (NumberFormatException e) //For invalid integer format
            {
                System.out.println(", Invalid number format.");
            }

        }
        System.out.println();
    }
}
