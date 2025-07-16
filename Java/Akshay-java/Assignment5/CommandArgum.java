/*
Program to accept a set of command line arguments and check whether they are in valid integer format.
Raise message otherwise. It also counts the number of invalid integers.
Author: Akshay Basak
Date: 10-07-2025
*/
public class CommandArgum {
	public static void main(String[] args) {
		int i;
		System.out.println("The number of argument :"+args.length);
       for(i=0;i<args.length;i++)
       {
           System.out.println("The Argument " + i + " : " + args[i]);
           try {
               int number=Integer.parseInt(args[i]);
               System.out.println("Valid Number "+number);
           } catch (NumberFormatException e) {
           	System.out.println("Invalid Number format!");
           }
       }
	}
}
