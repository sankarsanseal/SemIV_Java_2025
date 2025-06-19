// package SemIV_Java_2025.Java.Instructor.InheritanceExamples;

class Perimeter {
    float sides [];

    Perimeter(float sides [])
    {
        this.sides = sides;
    }

    Perimeter()
    {
        this.sides = new float[0];
        // System.out.println("Perimeter without any arguments");
    }

    double getPerimeter(){
        double perimeter = 0;

        // for (float side : sides)
        // {
        //     perimeter += side;
        // }

        for (int i = 0; i < sides.length ; i++)
        {
            perimeter += sides[i];
        }

        return perimeter;
    }
    
}
