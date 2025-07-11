package Java.Instructor.InterfaceExamples;

public class InterfaceExample02 implements InterfaceExample01 {

    public double getPIValue()
    {
        return PI;
    }


    public static void main(String [] args){

        InterfaceExample02 If02 = new InterfaceExample02();

        System.out.println(If02.getPIValue());
    }
    
}
