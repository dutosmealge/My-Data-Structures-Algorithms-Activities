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

class Queue {
     // Pointer to the front and rear of the queue
    private Node front;
    private Node rear;

    // Constructor to initialize an empty queue
    public Queue() {
        this.front = this.rear = null;
    }

    // Method to add an element to the queue
    public void EnQueue(int data) {
        Node newNode = new Node(data);

        // If the queue is empty, both front and rear point to the new node
        if (this.rear == null) {
            this.front = this.rear = newNode;
            System.out.println(data + " enqueued");
            return;
        }

        // If the queue is not empty, add the new node to the end and update rear
        this.rear.next = newNode;
        this.rear = newNode;
        System.out.println(data + " enqueued");
    }

    // Method to print the elements in the queue
    public void PrintQueue() {
        // Check if the queue is empty
        if (this.front == null) {
            System.out.println("Queue is empty");
            return;
        }

        // Start from the front node
        Node current = front;
        System.out.println("\nQueue:");

        // Traverse the queue and print each element
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }
}

public class QueueLinkedList {
    public static void main(String[] args) {
	// Create a new queue instance
        Queue queue = new Queue();
        // Enqueue the first element, second element, and current state of the queue
        queue.EnQueue(10);
        queue.EnQueue(20);
        queue.PrintQueue();
    }
}
