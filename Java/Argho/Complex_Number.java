import java.util.Scanner;

public class Complex_Number {
   int real;
   int img;

   Complex_Number() {
      this.real = 0;
      this.img = 0;
   }

   Complex_Number(int var1, int var2) {
      this.real = var1;
      this.img = var2;
   }

   Complex_Number(Complex_Number var1) {
      this.real = var1.real;
      this.img = var1.img;
   }

   Complex_Number getSum(Complex_Number var1) {
      int var2 = this.real + var1.real;
      int var3 = this.img + var1.img;
      return new Complex_Number(var2, var3);
   }

   void displayNumber() {
      if (this.img >= 0) {
         System.out.println(this.real + " + " + this.img + "i");
      } else {
         System.out.println(this.real + " - " + -this.img + "i");
      }

   }

   double getMagnitude() {
      return Math.sqrt((double)(this.real * this.real + this.img * this.img));
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter real part of first number: ");
      int var2 = var1.nextInt();
      System.out.print("Enter imaginary part of first number: ");
      int var3 = var1.nextInt();
      Complex_Number var4 = new Complex_Number(var2, var3);
      System.out.print("Enter real part of second number: ");
      int var5 = var1.nextInt();
      System.out.print("Enter imaginary part of second number: ");
      int var6 = var1.nextInt();
      Complex_Number var7 = new Complex_Number(var5, var6);
      System.out.print("First Number: ");
      var4.displayNumber();
      System.out.print("Second Number: ");
      var7.displayNumber();
      Complex_Number var8 = var4.getSum(var7);
      System.out.print("Sum: ");
      var8.displayNumber();
      System.out.println("Magnitude of First Number: " + var4.getMagnitude());
      System.out.println("Magnitude of Second Number: " + var7.getMagnitude());
      var1.close();
   }
}
