class Queue {
    int front = -1;
    int rear = -1;
    int n = 5;
    int[] queue = new int[n];

    public void enqueue(int x) {
        if (rear == n - 1) {
            System.out.println("queue is full");
        } else {
            rear++;
            queue[rear] = x;
            if (front == -1) {
                front = 0;
            }
        }
    }

    public int dequeue() {
        if (front == -1 || front > rear) {
            return -1; // or any other value to indicate an empty queue
        } else {
            int temp = queue[front];
            front++;
            return temp;
        }
        // if(front==0){
        //     System.out.println("undwerflow");
            
        // }
        // int temp= queue[rear];
        // if(front==rear){
        //     front=rear=-1;

        // }
        // else{
        //     front++;
        // }
        // return temp;
    }

    public void printQueue() {
        if (front == -1 || rear == -1) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
        }
    }
}

public class EnqueueDemo {
    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(3);
        q.enqueue(5);
        q.dequeue();

        
        q.printQueue();
    }
}