
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class LinkedList {
    Node head;

    
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

   
    public LinkedList copy() {
        if (head == null) {
            return null;
        }

        LinkedList copiedList = new LinkedList();
        Node temp = head;
        while (temp != null) {
            copiedList.add(temp.data);
            temp = temp.next;
        }
        return copiedList;
    }
}


public class CopyLinkedList {
    public static void main(String[] args) {
        LinkedList originalList = new LinkedList();
        originalList.add(10);
        originalList.add(20);
        originalList.add(30);

        System.out.print("Original List: ");
        originalList.display(); 

        LinkedList copiedList = originalList.copy();
        System.out.print("Copied List: ");
        copiedList.display(); 
    }
}
