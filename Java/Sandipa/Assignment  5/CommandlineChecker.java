public class CommandlineChecker {
    public static void main(String[] args) {
        // Check if arguments are provided
        if (args.length == 0) {
            System.out.println("No command line arguments provided.");
            return;
        }
        System.out.println("Checking command line arguments:\n");
        for (int i = 0; i < args.length; i++) {
            String argument = args[i];
            System.out.print("Argument " + (i + 1) + ": \"" + argument + "\" - ");
            try {
                // Try parsing the argument as an integer
                float number = Float.parseFloat(argument);
                System.out.println("This is a valid integer.");
            } catch (NumberFormatException e) {
                System.out.println("This is NOT a valid integer.");
            }
        }
    }
}
