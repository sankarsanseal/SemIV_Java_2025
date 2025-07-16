import java.util.*;

class Complex_Number {
    int real;
    int img;

    // Default Constructor
    Complex_Number() {
        real = 0;
        img = 0;
    }

    // Parameterized Constructor
    Complex_Number(int r, int i) {
        real = r;
        img = i;
    }

    // Copy Constructor
    Complex_Number(Complex_Number c) {
        real = c.real;
        img = c.img;
    }

    // Method to add two complex numbers
    Complex_Number getSum(Complex_Number c) {
        int sumReal = this.real + c.real;
        int sumImg = this.img + c.img;
        return new Complex_Number(sumReal, sumImg);
    }

    // Method to display the complex number
    void displayNumber() {
        if (img >= 0)
            System.out.println(real + " + " + img + "i");
        else
            System.out.println(real + " - " + (-img) + "i");
    }

    // Method to return the magnitude
    double getMagnitude() {
        return Math.sqrt(real * real + img * img);
    }

    // Main method with user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  input for first complex number
        System.out.print("Enter real part of first number: ");
        int r1 = scanner.nextInt();
        System.out.print("Enter imaginary part of first number: ");
        int i1 = scanner.nextInt();
        Complex_Number num1 = new Complex_Number(r1, i1);

        // Taking input for second complex number
        System.out.print("Enter real part of second number: ");
        int r2 = scanner.nextInt();
        System.out.print("Enter imaginary part of second number: ");
        int i2 = scanner.nextInt();
        Complex_Number num2 = new Complex_Number(r2, i2);

        // Displaying the complex numbers
        System.out.print("First Number: ");
        num1.displayNumber();

        System.out.print("Second Number: ");
        num2.displayNumber();

        // Adding the numbers
        Complex_Number sum = num1.getSum(num2);
        System.out.print("Sum: ");
        sum.displayNumber();

        // Displaying magnitudes
        System.out.println("Magnitude of First Number: " + num1.getMagnitude());
        System.out.println("Magnitude of Second Number: " + num2.getMagnitude());
        scanner.close();

    }
}