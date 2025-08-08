package PackageB;

import PackageA.SuperClass;

public class SubClass extends SuperClass{
    int a;

    public SubClass(int a) {
        super(a);
        this.a=a+10;
    }

    void showSub(){
        System.out.println("SubClass variable a="+a);
    }
}
