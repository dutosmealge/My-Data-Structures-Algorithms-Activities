class Node {
     // The data stored in the node
    int data;
    // Pointer to the next node in the stack
	Node next;

    // Constructor to initialize the node with data
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
     // Pointer to the top node of the stack
    private Node top;

    // Constructor to initialize an empty stack
    public Stack() {
        this.top = null;
    }

    // Method to add an element to the top of the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed onto stack");
    }

    // Method to remove and return the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    // Method to view the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}

public class StackLinkedList {
    public static void main(String[] args) {
	// Create a new stack instance
        Stack stack = new Stack();
        // Push the first element and second element onto the stack
        stack.push(10);
        stack.push(20);

        // Display the top element of the stack
        System.out.println("Top element is: " + stack.peek());
    }
}
