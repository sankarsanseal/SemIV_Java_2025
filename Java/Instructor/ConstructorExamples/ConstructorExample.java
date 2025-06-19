package ConstructorExamples;

public class ConstructorExample {

    public static void main(String[] args) {

        UsageTwo use1 = new UsageTwo(3,4);

        UsageTwo use2 = new UsageTwo(1);

        System.out.println(use1.magnitude());
        System.out.println(use2.magnitude());
        System.out.println(use1.toString());
        System.out.println(use2.toString());
    }
    
}
