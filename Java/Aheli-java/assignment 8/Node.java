/* 
Represents a node in a linked list.
This class stores an integer as data and a reference to the next node in the list.
It provides a constructor to initialize the node with a specific value.

Author: Aheli Manna
Date: 12-07-2025
*/
public class Node {
    int data;     // Holds the data value of the node
    Node link;    // Reference to the next node

    // Constructor to initialize the node with data
    Node(int data) {
        this.data = data;
        this.link = null; // Initially, the next node is set to null
    }
}
