class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertOrderList {
    Node first;
    

   

    void insertInOrder(int data) {
        Node temp = new Node(data);
        if (first == null || temp.data <= first.data) {
            temp.next = first;
            first = temp;
           
        } else {
            Node current = first;
            while (current.next != null && current.next.data < temp.data) {
                current = current.next;
            }
            temp.next = current.next;
            current.next = temp;
           
        }
    }
    public void display(){
        Node temp=first;
        while (temp!=null) {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        InsertOrderList list = new InsertOrderList();
        list.insertInOrder(1);
        list.insertInOrder(2);
        list.insertInOrder(0);
        list.insertInOrder(4);
        list.display();
    }
}