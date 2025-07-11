public class CommandArgum {
    public static void main(String args[])
    {
        int i;
        System.out.println("The number of argument :"+args.length);
        for(i=0;i<args.length;i++)
        {
            System.out.println("The Argument " + i + " : " + args[i]);
            try {
                int number=Integer.parseInt(args[i]);
                System.out.println("Valid Number "+number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid Number format!");
            }

        }
    }
}