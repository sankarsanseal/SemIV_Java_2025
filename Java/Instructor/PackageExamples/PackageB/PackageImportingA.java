package PackageB;

import PackageA.PackageExampleA;
// import PackageExamples.PackageA.*;

public class PackageImportingA  extends PackageExampleA
{

    public PackageImportingA(int value)
    {
        super(value);
    }

public static void main(String[] args) {
    
    PackageExampleA public_constructor = new PackageExampleA();
    PackageImportingA protected_constructor = new PackageImportingA(1);
}

}