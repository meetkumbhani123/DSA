
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class Queue {
     Node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (this.rear == null) {
            this.front = this.rear = newNode;
            System.out.println(data + " enqueued to queue");
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
        System.out.println(data + " enqueued to queue");
    }

   
    public int dequeue() {
        if (this.front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int dequeuedData = this.front.data;
        this.front = this.front.next;
        if (this.front == null) {
            this.rear = null;
        }
        return dequeuedData;
    }

   
    public int peek() {
        if (this.front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return this.front.data;
    }

    public boolean isEmpty() {
        return this.front == null;
    }

    
    public void display() {
        if (this.front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}


public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display(); // Output: 10 20 30

        System.out.println("Front element is " + queue.peek()); // Output: Front element is 10

        System.out.println(queue.dequeue() + " dequeued from queue"); // Output: 10 dequeued from queue
        queue.display(); // Output: 20 30

        System.out.println("Is queue empty? " + queue.isEmpty()); // Output: Is queue empty? false
    }
}
