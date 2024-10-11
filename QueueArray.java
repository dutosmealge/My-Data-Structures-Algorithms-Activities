class QueueArray {
	// Array to store the queue elements
    private int[] queueArray;
    private int front;
    private int rear;
    private int maxSize;
    private int currentSize;

    // Constructor to initialize the queue with a specified size
    public QueueArray(int size) {
		// Set the maximum size
        maxSize = size;
        // Create the array to hold the queue elements
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    // Method to add an element to the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value); // Check if the queue is full
        } else {
            rear = (rear + 1) % maxSize;
            queueArray[rear] = value;
            currentSize++;
        }
    }

    // Method to remove and return the front element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue:");
            return -1;
        } else {
            int value = queueArray[front];
            front = (front + 1) % maxSize;
            currentSize--;
            return value;
        }
    }

    // Method to view the front element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty:");
            return -1;
        } else {
            return queueArray[front];
        }
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return (currentSize == 0);
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return (currentSize == maxSize);
    }

    // Main method to demonstrate queue operations
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5);

        // Enqueue elements into the queue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);

        // Display the front element
        System.out.println("Front element is " + queue.peek());
        // Dequeue an element and display it
        System.out.println("Dequeued element: " + queue.dequeue());
        // Display the front element after dequeuing
        System.out.println("Front element after dequeue: " + queue.peek());
    }
}
