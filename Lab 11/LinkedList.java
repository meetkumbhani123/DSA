class Node {
    int data;
    Node Next;

    Node(int data) {
        this.data = data;
        Next = null;
    }
}

public class LinkedList {
    Node first = null;
    Node last = null;

    public void push(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.Next = newNode;
            last = newNode;
        }

    }

    public void pop() {
        // Node newNode = new Node();
        Node prev = first;
        Node save = first;
    
        while (save.Next != null) {
            if (save== null) {
                System.out.println("Empty");
            } else {
                
                prev = save;
                save = save.Next;
            }

        }
        prev.Next = null;
        last = prev;

    }
    public int peek() {
        if (first == null) {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }
        return last.data;
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);
        list.pop();
        
        

        Node temp = list.first;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.Next;
        }
        System.out.println("Top element is: " + list.peek());
    }
}