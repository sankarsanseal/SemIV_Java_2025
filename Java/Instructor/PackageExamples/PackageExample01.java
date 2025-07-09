package Java.Instructor.PackageExamples;

public class PackageExample01 {

    public PackageExample01(){
        System.out.println("Default Constructor.");
    }

    protected PackageExample01(String str1){
        System.out.println("Protected Constructor with String object " 
        + str1 
        + " is created.");
    }

    private PackageExample01(Double d){
        System.out.println("Private Constructor with double primitive data value " 
        + d 
        + " is created.");
    }


    public static void main(String[] args) {
       
        PackageExample01 public_constructor = new PackageExample01();

        PackageExample01 protected_constractor = new PackageExample01(
            "I am a subclass."
            );

        PackageExample01 private_constructor = new PackageExample01(1e37);

        System.out.println("All three constructors are created.");

    }
    
}
