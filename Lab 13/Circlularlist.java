 class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
    
}
public class Circlularlist {
    Node first=null;
    Node last=null;
    Node temp;
    public   void addfirst(int data){
        Node temp= new Node(data);
        if(first==null){
            first=temp;
            last=temp;
        }
        else{
            temp.next=first;
            first=temp;
            last.next=first;
        }
        

    }
    public void printlist(){
        Node temp= first;
        while (temp.next!=first) {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public void insertAtLast(int data){
        Node temp=new Node(data);
        if(first==null){
            first=temp;
            last=temp;
        }
        else{
            last.next=temp;
            last=temp;
            last.next=first;
            }
        }
        public void delete(){
            
        }
     
public static void main(String[] args) {
    Circlularlist list= new Circlularlist();
      list.addfirst(1);
      list.addfirst(2);
      list.addfirst(2);
      list.addfirst(2);
      list.insertAtLast(0);

    
      list.printlist();

    
    
}
    
}