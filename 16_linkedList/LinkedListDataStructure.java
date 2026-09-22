import java.util.LinkedList;

class Node{ //user defined data type 
    int val;
    Node next;

    Node(int val){
        this.val=val;
    }
}

class LL{//user defined data structure
    Node head;
    Node tail;
//add at the end 
    void addAtTail(int x){
        Node temp=new Node(x);
        if(tail==null) {
            head=tail=temp;
            return;
        }
        tail.next=temp;
        tail=temp;
    }
    void display(){
        if(head==null) return;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    //add at the beginning 
    void addAtHead(int x){
        Node temp=new Node(x);
        if(tail==null){
            head=tail=temp;
            return;
        }
        temp.next=head;
        head=temp;
    }

    //
    
}
public class LinkedListDataStructure {
    public static void main(String[] args) {
        LL l1=new LL();
        l1.addAtTail(10);
        l1.addAtTail(20);
        l1.addAtTail(30);
        l1.addAtTail(40);
        l1.display();

        l1.addAtHead(70);
        l1.display();
    }
}
