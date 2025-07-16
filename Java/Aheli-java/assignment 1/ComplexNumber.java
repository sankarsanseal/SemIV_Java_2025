/* 
 Class to represent Complex Numbers and perform basic operations.
 Author: Aheli Manna
 Date: 9-07-2025
*/
import java.util.Scanner;

public class ComplexNumber {
    int real;
    int img;

    // Default constructor
    ComplexNumber() {
        this.real = 0;
        this.img = 0;
    }

    // Parameterized constructor
    ComplexNumber(int real, int img) {
        this.real = real;
        this.img = img;
    }

    // Copy constructor
    ComplexNumber(ComplexNumber copy) {
        this.real = copy.real;
        this.img = copy.img;
    }

    // Returns the sum of two complex numbers
    public ComplexNumber getSum(ComplexNumber sum) {
        int realSum = this.real + sum.real;
        int imgSum = this.img + sum.img;
        return new ComplexNumber(realSum, imgSum);
    }

    // Returns the magnitude of the complex number
    public double getMag() {
        return Math.sqrt(real * real + img * img);
    }

    // Displays the complex number
    public void display() {
        System.out.println("Complex Number: " + real + " + " + img + " i ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter the first real number:");
        int r1 = sc.nextInt();
        System.out.println("Enter the first img number:");
        int i1 = sc.nextInt();
        System.out.println("Enter the second real number:");
        int r2 = sc.nextInt();
        System.out.println("Enter the second img number:");
        int i2 = sc.nextInt();
        
        // Creating objects and performing operations
        ComplexNumber c1 = new ComplexNumber(r1, i1);
        ComplexNumber c2 = new ComplexNumber(r2, i2);
        ComplexNumber result = c1.getSum(c2);

        System.out.println("First:");
        c1.display();
        System.out.println("Second:");
        c2.display();
        System.out.println("Sum:");
        result.display();
        System.out.println("Magnititude of first: " + c1.getMag());
        System.out.println("Magnititude of second: " + c2.getMag());
        System.out.println(Math.sqrt(-1));

        sc.close();
    }
}
