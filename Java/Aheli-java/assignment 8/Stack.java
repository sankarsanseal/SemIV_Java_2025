/* 
Represents a demo program for stack operations using the StackUsingLinkedList class.
This program provides a menu-based interface for the user to perform stack operations such as push, pop, peek, and check the size.
It uses a `Scanner` to take user input and executes the corresponding stack operation based on the user’s choice.

Author: Pratick Dam
Date: 12-07-2025
*/
import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackLL stack = new StackLL(); // Create a new stack instance

        // Display the menu options
        System.out.println(" ----- Menu -----");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Peek");
        System.out.println("4. Size of the Stack.");
        System.out.println("0. Exit");

        // Menu-driven loop for user input
        while (true) {
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Push operation
                    System.out.print("Enter the element to push into the stack: ");
                    int data = sc.nextInt();
                    stack.push(data);
                    break;
                case 2: // Pop operation
                    int poppedElement = stack.pop();
                    System.out.println("The popped element is: " + poppedElement);
                    break;
                case 3: // Peek operation
                    int peek = stack.peek();
                    System.out.println("The topmost element is: " + peek);
                    break;
                case 4: // Size of the stack
                    int size = stack.size();
                    System.out.println("The size of the stack is: " + size);
                    break;
                case 0: // Exit
                    System.out.println("Exited successfully!");
                    System.exit(0);
                default: // Invalid choice
                    System.out.println("Invalid input (0 - 4)");
                    break;
            }
        }
    }
}
