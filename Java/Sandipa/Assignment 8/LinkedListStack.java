
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedListStack {
    private Node top;  // top of the stack
    private int size;  // number of elements in stack
    public LinkedListStack() {
        top = null;
        size = 0;
    }
    // Push operation
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;  // Link new node to  top
        top = newNode;       // Update top to new node
        size++;
        System.out.println(value + " pushed to stack.");
    }
    // Pop operation: Remove and return top element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to pop.");
            return -1;
        }
        int popped_Value = top.data;
        top = top.next;  // Move top pointer down
        size--;
        System.out.println(popped_Value + " popped from stack.");
        return popped_Value;
    }
    // Peek operation: Return top element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No top element.");
            return -1;
        }
        return top.data;
    }
    // Return the number of elements in stack
    public int size() {
        return size;
    }
    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }
    // Main method for demonstration
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        //stack.push(65);
        //stack.push(54);
        //stack.push(78);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());
        stack.pop();
        System.out.println("Top element after pop: " + stack.peek());
        System.out.println("Stack size after pop: " + stack.size());
        stack.pop();
        System.out.println("Top element after pop: " + stack.peek());
        System.out.println("Stack size after pop: " + stack.size());
    }
}