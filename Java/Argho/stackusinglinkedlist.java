import java.util.Scanner;

// Node class representing a single node in the linked list
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack class implemented using a linked list
class Stack {
    Node top;
    int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    // Method to push an element onto the stack
    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        size++;
    }

    // Method to pop an element from the stack
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return a sentinel value to indicate failure
        }
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }

    // Method to get the number of elements in the stack
    public int getSize() {
        return size;
    }

    // Method to get the top element of the stack
    public int getTop() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return -1; // Return a sentinel value to indicate failure
        }
        return top.data;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}

public class stackusinglinkedlist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();

        while (true) {
            System.out.println("Stack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Get Size");
            System.out.println("4. Get Top");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int data = scanner.nextInt();
                    stack.push(data);
                    break;
                case 2:
                    int poppedData = stack.pop();
                    if (poppedData != -1) {
                        System.out.println("Popped element: " + poppedData);
                    }
                    break;
                case 3:
                    System.out.println("Number of elements in stack: " + stack.getSize());
                    break;
                case 4:
                    int topElement = stack.getTop();
                    if (topElement != -1) {
                        System.out.println("Top element: " + topElement);
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    
            }
        }
       
    }
    
}