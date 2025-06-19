/*Practical 2: Program to find the factorial of a given number*/

import java.util.Scanner;   //import Scanner class from java.util package

public class Factorial {    //class declaration
    public static void main(String args[]) {    //main function
        int fact=1,n;
        Scanner sc = new Scanner(System.in);    //sc object creation

        System.out.print("Enter a number:");
        n=sc.nextInt();     //take integer input from user
        if(n<0) {           //Factorial is invalid for negative numbers
            System.out.println("Invalid number for factorial");
            return;
        }
           
        for(;n>0;n--) {     //Reducing value of n and multiplying it with fact until n is 1
            fact*=n;
        }
        System.out.println("Factorial is "+fact);   //Displaying final factorial value
        sc.close();     //closing sc to free resources
    }
}
