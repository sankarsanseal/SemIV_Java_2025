public class IntegerChecker {
    public static void main(String[] args) {
        // Check if arguments are provided
        if (args.length == 0) {
            System.out.println("No command-line arguments found!");
            return;
        }

        // Loop through each argument
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            try {
                int number = Integer.parseInt(arg); // Try to convert to integer
                System.out.println("Argument: "+arg+" is an Integer.");
            } catch (NumberFormatException e) {
             System.out.println("Argument: "+arg+" is not an Integer.");
            }
        }
    }
}
