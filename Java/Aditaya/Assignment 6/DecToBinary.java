/*
Program to input a decimal number from user and convert it into corresponding binary value

This program can also be done easily using this method: Integer.toBinaryString(n) 

Author: Aditaya Samui
Date: 10-07-2025
*/

import java.util.Scanner;

public class DecToBinary {
    public static void main(String[] args) {
        System.out.print("Enter a decimal number: ");
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();     //taking decimal number from user

        long rev_bin=9;      //Stores the reverse of the binary
        //initializing rev_bin from 9(any non zero) since we want to include the zeroes in the binary
        //We will discard this after reversing the rev_bin by dividing it by 10

        while(dec>0) {
            rev_bin=(rev_bin*10) + (dec%2);
            dec/=2;
        }

        long bin=0;      //Stores the binary number
        while(rev_bin>9){       //reversing the number until 9 comes
            bin=(bin*10) + (rev_bin%10);
            rev_bin/=10;
        }

        System.out.println("Converted Binary : "+bin);
        sc.close();
    }
}
