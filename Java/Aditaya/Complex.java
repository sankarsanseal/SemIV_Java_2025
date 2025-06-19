/*
Program to create a class ComplexNumber 
create default, parameter and copy constructor
create methods getSum(), display() and magnitude()
*/

import java.util.Scanner;   //importing Scanner class for taking input from user
import java.lang.Math;

class ComplexNumber{     //class Definition
    int real;   //real part
    int img;    //imaginary part

    //Constructors
    ComplexNumber(int r, int i) {       //with both parameters
        real=r;
        img=i;
    }
    ComplexNumber(int i) {              //with only one parameters
        real=0;
        img=i;
    }
    ComplexNumber() {                   //no paramaters (default)
        real=0;
        img=0;
    }
    ComplexNumber(ComplexNumber num) {  //Copy of another complex number
        real=num.real;
        img=num.img;
    }

    //methods

    void display() {        //Display method
        if(img>=0)
            System.out.println(real+" + "+img+"i"); //for positive imaginary
        else
            System.out.println(real+" - "+img+"i"); //for negative imaginary
    }

    ComplexNumber getSum(ComplexNumber num) {   //Method for addition of two Compplex Number
        ComplexNumber sum=new ComplexNumber(real+num.real,img+num.img);
        return sum;
    }

    double magnitude() {        //Method to calculate the L2 value of Complex Number
        double res=Math.sqrt((real*real)+(img*img));
        return res;
    }

}

public class Complex{
    public static void main(String args[]){     //main Function
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter real part and imaginary part of a complex number:");
        int r=sc.nextInt();
        int i=sc.nextInt();
        System.out.println("Enter real part and imaginary part of a complex number:");
        int r2=sc.nextInt();
        int i2=sc.nextInt();

        ComplexNumber n1=new ComplexNumber(r,i);    //object declaration
        ComplexNumber n2=new ComplexNumber(r2,i2);

        System.out.println("\nGiven Complex Numbers:");
        n1.display();       //display method
        n2.display();
        
        ComplexNumber res=n1.getSum(n2);    //getSum method

        System.out.print("\nSum of two complex Number is ");      
        res.display();     

        System.out.println("\nMagnitude is "+res.magnitude());     //magnitude method

        sc.close();     //closing sc object
    }
}