package ConstructorExamples;

public class UsageTwo {

    double real;
    double imaginary;

    public UsageTwo(double r, double i){
        real = r;
        imaginary = i;
    }

    public UsageTwo(double  i){
        imaginary = i;
    }

    double magnitude(){
        return Math.sqrt(real*real + imaginary*imaginary);
    }
    
}
