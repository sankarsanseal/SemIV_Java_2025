/*
 * 
 * 
 * Author : Deepan Das
 * 
 * Problem: 
 * 
 * Date: 26 June 2025
 * 
 * 
 */



import java.util.Scanner;

public class ComplexNumber {
    private int real;
    private int img;

    public ComplexNumber () {
        this.real=0;
        this.img=0;
    }

public ComplexNumber (int real,int img) {
    this.real=real;
    this.img=img;
}

public ComplexNumber (ComplexNumber other) {
    this.real=other.real;
    this.img= other.img;
}

public ComplexNumber getSum (ComplexNumber other) {
    int newReal = this.real+other.real;
    int newImg = this.img+other.img;
    return new ComplexNumber(newReal,newImg);
}

public void displayNumber () {
    if (img>=0) {
        System.out.println(real+ "+" + img + "i");
    } else {
        System.out.println(real +"-"+Math.abs(img)+"i");
    }
}

public double getMagnitude() {
    return Math.sqrt(real*real+img*img);
}

public static void main (String[] args) {
  Scanner scanner = new Scanner(System.in);


  System.out.print("enter real part of 1st complex number :");
  int real1=scanner.nextInt();
  System.out.print("enter img part of 1st complex number :");
  int img1=scanner.nextInt();
  ComplexNumber c1=new ComplexNumber(real1,img1);

  System.out.print("enter the real part of 2nd complex number :");
  int real2=scanner.nextInt();
  System.out.print("enter the img part of 2nd complex number :");
  int img2=scanner.nextInt();
  ComplexNumber c2=new ComplexNumber(real2,img2);

  System.out.print("ist complex number :");
  c1.displayNumber();
  System.out.print("2st complex number :");
  c2.displayNumber();

  ComplexNumber sum = c1.getSum(c2);
  System.out.print("sum:");
  sum.displayNumber();

  System.out.println("Magnitude of 1st number :"+ c1.getMagnitude());

  System.out.println("Magnitude of 2nd number :"+c2.getMagnitude());

  scanner.close();

}
}