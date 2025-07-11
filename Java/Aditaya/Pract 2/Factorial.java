/*
Program to find the factorial of a given number entered by user

Author: Aditaya Samui
Date: --2025
*/

import java.util.Scanner;   //import Scanner class from java.util package

public class Factorial {    //class declaration
    public static void main(String args[]) {    //main function
        int fact=1,n;
        Scanner in = new Scanner(System.in);    //sc object creation
        

        System.out.print("Enter a number:");
        n=in.nextInt();     //take integer input from user
        in.close();         //Closing the in
        if(n<0) {           //Factorial is invalid for negative numbers
            System.out.println("Invalid number for factorial");
            return;
        }
           
        for(;n>0;n--) {     //Reducing value of n and multiplying it with fact until n is 1
            fact*=n;
        }
        System.out.println("Factorial is "+fact);   //Displaying final factorial value
    }
}
