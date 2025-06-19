// package SemIV_Java_2025.Java.Instructor.InheritanceExamples;

class Triangle extends Area 
{

    Triangle(float height, float base){
        super(height, base);
    }

    double getArea(){
        return super.getArea() * 0.5;
    }


    public static void main(String[] args) {
        
        Triangle triangle1 = new Triangle(3,4);

        System.out.println("The area of triangle 1: " + triangle1.getArea());
    }

    
}
