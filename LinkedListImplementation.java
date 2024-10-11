class Node {
    int data; // The data stored in the node
    Node next; // Pointer to the next node in the list

    // Constructor to initialize the node with data
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head; // The head of the list

    // Constructor to initialize an empty linked list
    LinkedList() {
        head = null; // Start with no elements
    }

    // Method to insert a new node at the beginning of the list
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to insert a new node at the end of the list
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head; // Start at the head
        while (current.next != null) {
            current = current.next; // Traverse to the end of the list
        }
        current.next = newNode; // Link the new node at the end
    }

    // Method to insert a new node after a given node
    void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null"); // Handle null case
            return;
        }

        Node newNode = new Node(data); // Create a new node
        newNode.next = prevNode.next; // Link new node to the next of prevNode
        prevNode.next = newNode; // Link prevNode to the new node
    }

    // Method to delete a node by its value
    void deleteNode(int key) {
        if (head == null) {
            return; // If the list is empty, nothing to delete
        }

        if (head.data == key) {
            head = head.next; // If head is to be deleted, update head
            return;
        }

        Node current = head; // Start at the head
        // Traverse until the node before the one to be deleted
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }

        // If the node to be deleted is found
        if (current.next == null) {
            return;
        }

        current.next = current.next.next; // Bypass the node to be deleted
    }

    // Method to print the entire linked list
    void printList() {
        Node current = head; // Start at the head
        while (current != null) {
            System.out.print(current.data + " "); // Print the current node's data
            current = current.next; // Move to the next node
        }
        System.out.println();
    }
}

public class LinkedListImplementation {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtEnd(1); // Insert 1 at the end
        list.insertAtBeginning(2); // Insert 2 at the beginning
        list.insertAtEnd(3); // Insert 3 at the end
        list.insertAfter(list.head.next, 4); // Insert 4 after the second node

        list.printList(); // Print the current list: 2 4 1 3

        list.deleteNode(3); // Delete node with value 3

        list.printList(); // Print the updated list: 2 4 1
    }
}
