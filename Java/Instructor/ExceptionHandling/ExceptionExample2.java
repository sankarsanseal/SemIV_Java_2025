public class ExceptionExample2{

    public static void main(String[] args) {
        int var1 = 1;
        int var0 = 0;

        try{

        System.out.println(var1/var0);

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() + e.toString());
        }

        System.out.println("I must display.");
    }
}