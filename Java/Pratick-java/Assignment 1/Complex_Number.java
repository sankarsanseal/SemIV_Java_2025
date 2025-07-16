/* 
 Class to represent Complex Numbers and perform basic operations.
 It contains attributes for real and imaginary parts,
 provides constructors to initialize values,
 and includes methods to display the number, calculate sum, and compute magnitude.

 Author:Pratick Dam
 Date: 10-07-2025
*/

import java.util.*;
public class Complex_Number {

    int real, img;

    //Default constructor
    Complex_Number(){
        this.real = 0;
        this.img = 0;
    }

    //Parameterized constructor
    Complex_Number(int real, int img){
        this.real = real;
        this.img= img;
    }

    //Method to return the complex number
    public Complex_Number getSum(Complex_Number c){
        int RealSum = this.real + c.real;
        int RealImg = this.img + c.img;
        return new Complex_Number(RealSum, RealImg); 
    }
    //Method to display the numbers
    public void displayNumber(){
        if(img>=0){
            System.out.println("Real: "+ real +"    Img: "+ img +"i");
        } else {
            System.out.println("Real: "+ real +"    Img: -"+ Math.abs(img) +"i");
        }
    }

    //Find the magnitude
    public double getMagnitude(){
        return Math.sqrt(Math.pow(real,2)+ Math.pow(img,2));
    }

    //Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st Real number: ");
        int r1 = sc.nextInt();
        System.out.println("Enter the 1st Imaginary number: ");
        int i1 = sc.nextInt();
        System.out.println("Enter the 2nd Real number: ");
        int r2 = sc.nextInt();
        System.out.println("Enter the 2nd Imaginary number: ");
        int i2 = sc.nextInt();

        //Initialize the Complex NUmbers
        Complex_Number c1 = new Complex_Number(r1, i1);
        Complex_Number c2 = new Complex_Number(r2, i2);

        //Get the result
        Complex_Number result = c1.getSum(c2);

        //print the details and the result of the following complex numbers
        System.out.println("The first Complex Number is: ");
        c1.displayNumber();

        System.out.println("The second Complex Number is: ");
        c2.displayNumber();

        System.out.println("Sum: ");
        result.displayNumber();
        double n = c1.getMagnitude();
        System.out.println("Magnitude of 1st number: "+ n);

        //CLose the Scanner class
        sc.close();
    }
}