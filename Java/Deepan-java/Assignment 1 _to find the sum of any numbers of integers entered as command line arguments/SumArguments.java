public class SumArguments {
    public static void main(String[] args) {
        int sum = 0;

        // Loop through all command line arguments
        for (String arg : args) {
            try {
                // Convert each argument to an integer and add to sum
                int num = Integer.parseInt(arg);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: '" + arg + "' is not an integer.");
            }
        }

        System.out.println("Sum: " + sum);
    }
}
