class Area{
    float height;
    float base;

    Area(float height, float base)
    {
        this.height = height;
        this.base = base;
    }

    double getArea(){
        return height * base;
    }
}