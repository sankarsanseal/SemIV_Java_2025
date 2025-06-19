// package SemIV_Java_2025.Java.Instructor.InheritanceExamples;

class Perimeter {
    float sides [];

    Perimeter(float sides [])
    {
        this.sides = sides;
    }

    Perimeter()
    {
        
    }

    double getPerimeter(){
        double perimeter = 0;

        for (float side : sides)
        {
            perimeter += side;
        }

        return perimeter;
    }
    
}
