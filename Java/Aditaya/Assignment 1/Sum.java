/*Practical 1: Program to find the sum of any number of integers entered as command line arguments*/

public class Sum{      //class declaration
    public static void main(String args[])      //main function 
    {
        int i, sum=0;                      

        //for loop is used for accessing each argument in args[] array and adding them to sum
        for(i=0;i<args.length;i++)     //args.length returns the total number of arguments
        {
            //try-catch block excpetion handling is used to handle any non integer value
            try 
            {   
                sum+=Integer.parseInt(args[i]); //Integer.parseInt converts each string argument to int
            }
            catch(NumberFormatException e)
            {
                System.out.println("Invalid Number format:"+args[i]);   //prints invalid arguments
            }
        }
        System.out.println("The sum is "+sum);  //Displaying the final output
    }
}
