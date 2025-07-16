import java.util.Scanner;

// Node class to represent each element in the stack
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack class using Linked List
class Stack {
    private Node top;
    private int size;

    Stack() {
        top = null;
        size = 0;
    }

    // Push operation
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println(value + " pushed to stack.");
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return -1;
        }
        int poppedValue = top.data;
        top = top.next;
        size--;
        System.out.println(poppedValue + " popped from stack.");
        return poppedValue;
    }

    // Peek (top element)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return top.data;
    }

    // Size of stack
    public int size() {
        return size;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}

// Main class (public class name is LinkedListStack)
public class LinkedListStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        int choice;

        do {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek (Top Element)");
            System.out.println("4. Size of Stack");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    stack.push(val);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    int topElement = stack.peek();
                    if (topElement != -1)
                        System.out.println("Top element is: " + topElement);
                    break;
                case 4:
                    System.out.println("Stack size is: " + stack.size());
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
