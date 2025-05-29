import java.util.Scanner; // Console Text-based input

class DynamicArray{
    public static void main(String [] args){
        int number_of_rows = 0; // Declaring and Defining the variable. 
 
        System.out.println("Number of Rows:" + number_of_rows);
        try(Scanner sc = new Scanner(System.in)){ // try with resource-on-use
            System.out.println("Enter the number of rows required:");
            number_of_rows = sc.nextInt();

            System.out.println("You have entered " + number_of_rows + " for number of rows.");
            
            int arr1[][] = new int[number_of_rows][];

            for (int i = 0 ; i < arr1.length; i++)
            {
                System.out.println(arr1[i]);
            }
        }
        
    }
}