/* 
Represents a stack data structure implemented using a linked list.
This class provides methods for basic stack operations: push, pop, peek, and checking the size.
It uses a `Node` class to manage the stack's elements and provides an efficient way to manage the stack through linked nodes.

Author: Aheli Manna
Date: 12-07-2025
*/
public class StackLL {
    private Node top;    // Points to the top of the stack
    private int size;    // Keeps track of the number of elements in the stack

    // Constructor to initialize an empty stack
    StackLL() {
        this.top = null;
        this.size = 0; 
    }

    // Checks if the stack is empty
    boolean isEmpty() {
        return top == null;
    }

    // Returns the top element without removing it
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        } else {
            return top.data;
        }
    }

    // Returns the number of elements in the stack
    int size() {
        return size;
    }

    // Pushes a new element onto the top of the stack
    void push(int data) {
        Node temp = new Node(data);   // Create a new node
        temp.link = top;              // Link the new node to the current top
        top = temp;                   // Update top to the new node
        size++;
        System.out.println("Element " + data + " is pushed into the stack");
    }

    // Removes and returns the top element of the stack
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow \nCannot pop");
            return -1;
        }
        int popelement = top.data;
        top = top.link;  // Move top to the next node
        size--;
        return popelement;
    }
}
