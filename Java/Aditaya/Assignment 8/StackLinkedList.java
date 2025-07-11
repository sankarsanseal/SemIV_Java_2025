/*
Program to Implement Stack using linked list with a menu driven program
Menu:
0: Exit
1: PUSH
2: POP
3: PEEK(displays top element)
4: Display no. of elements


Author: Aditaya Samui
Date: 10-07-2025
*/

import java.util.Scanner;

public class StackLinkedList {
    Node top = null;    //top pointing to top of the stack or head of the list

    //class for node of Linked list 
    class Node {
        int info;    //value of the node in the linked list
        Node next;      //Next node of the linked list

        Node(int info) {
            this.info = info;
            this.next = null;   //By default next of the node will point to null
        }
    }

    public void push(int info) {        //Push a new element in the stack
        Node temp = new Node(info);
        if(top != null) {
            temp.next = top;
        }
        top = temp;
    }

    public int pop() {          //Pop the top element of the stack and return its value
        int n = top.info;
        Node temp = top;
        top=top.next;
        temp = null;
        return n;
    }

    public int peek() {     //Display the value of top elememt of the stack
        return top.info;
    }

    public int items() {        //Display the number of items present in the stack
        int n=0;
        Node temp = top;
        while(temp!=null) {
            n++;
            temp = temp.next;
        }
        return n;
    }

    //Main function
    public static void main(String[] args) {
        StackLinkedList stk = new StackLinkedList();
        Scanner sc = new Scanner(System.in);

        //Displaying the Menu
        System.out.println("\n---STACK OPERATIONS---\n");
        System.out.println("Menu:\n0: Exit\n1: PUSH\n2: POP\n3: PEEK(displays top element)\n4: Display no. of elements");

        int ch;     //Takes user choice
        do {
            System.out.print("\nPress: ");
            
            ch = sc.nextInt();
            switch(ch) {
                case 0:
                    System.out.println("Program terminated successfully.");
                    break;
                case 1:     //Push Operation
                    System.out.print("Enter value of element:");
                    int val=sc.nextInt();
                    stk.push(val);
                    break;
                case 2:     //Pop operation
                    try{
                        System.out.println("The element popped is "+stk.pop());
                    }
                    //Handling null exception if the stack is already empty
                    catch(NullPointerException e) {
                        System.out.println("Stack Underflow!");
                    }
                    break;
                case 3:     //Display top element of Stack
                    try{
                        System.out.println("The top element is "+stk.peek());
                    }
                    //Handling null exception if the stack is already empty
                    catch(NullPointerException e) {
                        System.out.println("Stack is empty!");
                    }
                    break;
                case 4:     //Display number of elements
                    System.out.println("Number of element in Stack is "+stk.items());
                    break;
                default:
                    System.out.println("Wrong Number!");
            }
        } while(ch!=0);

        sc.close();
    }
}
