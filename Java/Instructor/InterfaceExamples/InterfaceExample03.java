package Java.Instructor.InterfaceExamples;


public class InterfaceExample03 implements InterfaceExample01{


    public double getPIValue(){
        
        return 22.0/7.0;

    }



    public static void main(String [] args){

        InterfaceExample03 if03 = new InterfaceExample03();


        System.out.println(if03.getPIValue());
        System.out.println(if03.PI);
        System.out.println(Math.PI);


    }
}