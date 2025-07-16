/* 
Represents a stack data structure implemented using a linked list.
This class provides methods for basic stack operations: push, pop, peek, and checking the size.
It uses a `Node` class to manage the stack's elements and provides an efficient way to manage the stack through linked nodes.

Author: Pratick Dam
Date: 10-07-2025
*/
public class StackUsingLinkedList {
    private Node top;  // Top of the stack
    private int size;  // Number of elements in the stack

    StackUsingLinkedList() {
        this.top = null;
        this.size = 0;
    }

    boolean isEmpty() {
        return top == null;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! No Element to peek for");
            return -1;
        } else {
            return top.data;
        }
    }

    int size() {
        return size;
    }

    public void push(int data) {
        Node temp = new Node(data);  // Create new node
        temp.next = top;             // Link it to current top
        top = temp;                  // Update top to new node
        size++;
        System.out.println(data + " is pushed into the stack");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop");
            return -1;
        }
        int poppedValue = top.data;
        top = top.next;  // Remove top node
        size--;
        return poppedValue;
    }
}
