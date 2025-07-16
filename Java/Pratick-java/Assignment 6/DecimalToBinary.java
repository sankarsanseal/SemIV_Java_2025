/* 
Represents a program to convert a decimal number to its binary representation.
This class takes an integer input from the user, performs the conversion from decimal to binary, and displays the result.
It handles the special case where the number is zero, and uses a loop to calculate the binary representation for other numbers.

Author: Pratick Dam
Date: 10-07-2025
*/
import java.util.Scanner;

public class DecimalToBinary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input the Decimal Number
        System.out.println("Enter the Decimal Number: ");
        int num = sc.nextInt();

        if(num == 0){
            System.out.println("The Binary of "+num+" is : "+num);
        } else {
            String binary = "";
            int number  = num;
            while(number>0){
                int remainder = number%2;
                binary = remainder + binary;
                number = number/2;
            }
            System.out.println("The Binary of "+num+" is: "+binary);
        }
        sc.close();
    }
}