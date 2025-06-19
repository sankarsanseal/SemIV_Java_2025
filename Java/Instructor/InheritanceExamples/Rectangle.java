// package SemIV_Java_2025.Java.Instructor.InheritanceExamples;

class Rectangle extends Perimeter{

    float height;
    float base;

    Rectangle(float height, float base){
        super();
        this.height = height;
        this.base = base;
        this.sides = new float [4];
        sides[0] = sides[2] = this.height;
        sides[1] = sides[3] = this.base;
        
    }



    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5,6);

        System.out.println("The perimeter of rect1 is " + rect1.getPerimeter() +".");
    }
    
}
