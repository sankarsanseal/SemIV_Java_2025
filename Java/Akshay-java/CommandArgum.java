public class CommandArgum {
    public static void main(String args[])
    {
        int i;
        System.out.println("The number of argument :"+args.length);
        for(i=0;i<args.length;i++)
        {
            System.out.println("The Argument "+ i +" : "+ args[i]);
        }
    }
}