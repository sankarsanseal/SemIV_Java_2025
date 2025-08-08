package PackageB;

import PackageA.SuperClass;

public class SubClass extends SuperClass {
    public void Display(){
        super("Optimus");
        Display();
        System.out.println("This is a Subclass!");
    }
}

