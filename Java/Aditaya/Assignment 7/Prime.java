/*
Program to check whether a number given by the user is prime or not.
A number having only two factors (1 and the number itself) is called Prime number 

Author: Aditaya Samui
Date: 10-07-2025
*/

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        //Any number less than 2 cannot be categorised in Prime or Composite
        if(n<2) {
            System.out.println("The given number is invalid for checking Prime.");
        }
            
        else {
            int i;
            for(i=2;i<=n/2;i++) {   
                //If a number has a factor it will be within this range (other than 1 and the number itself)
                
                if(n%i==0) {
                    System.out.println(n+" is a Composite Number.");
                    break;
                }
            }

            if(i>n/2) {     //If the loop never encounters break then, i>n/2 indicating Prime number
                System.out.println(n+" is a Prime number.");     
            }
        }
        sc.close();
    }
}
