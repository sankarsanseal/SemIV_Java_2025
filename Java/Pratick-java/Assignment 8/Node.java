/* 
Represents a node in a linked list.
This class stores an integer as data and a reference to the next node in the list.
It provides a constructor to initialize the node with a specific value.

Author: Pratick Dam
Date: 10-07-2025
*/

public class Node {
    int data;      // Data stored in the node
    Node next;     // Reference to the next node

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
