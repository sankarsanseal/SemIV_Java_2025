class Area extends Perimeter{
    float height;
    float base;

    Area(float height, float base)
    {
        super();
        this.height = height;
        this.base = base;
        // System.out.println("Area with two variables executed.");
    }

    Area(){
        super();
    }

    double getArea(){

        return height * base;
    }
}