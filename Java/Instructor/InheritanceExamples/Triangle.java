// package SemIV_Java_2025.Java.Instructor.InheritanceExamples;

class Triangle extends Area
{

    Triangle(float height, float base){
        super(height, base);
        // System.out.println("Triangle with two variables created.");
    }

    Triangle(float a, float b, float c){
        super();
        this.sides = new float[3];
        this.sides[0] = a;
        this.sides[1] = b;
        this.sides[2] = c;
        // System.out.println("Triangle With 3 values executed.");
    }

    double getArea(){

        if (this.sides.length == 3){
            double temp_area = 0;
            double s = this.getPerimeter()/2;

            temp_area = Math.sqrt(
                s * 
                (s-this.sides[0]) * 
                (s-this.sides[1]) * 
                (s-this.sides[2])
                
            );

            return temp_area;
        }

        return super.getArea() * 0.5;
    }



    public static void main(String[] args) {
        
        Triangle triangle1 = new Triangle(3,4);

        System.out.println("The area of triangle 1: " + triangle1.getArea());

        Triangle triangle2 = new Triangle(3,4,5);

        System.out.println("The perimeter of triangle2 is " + triangle2.getPerimeter());
        System.out.println("The area of triangle2 is " + triangle2.getArea());
    }

    
}
