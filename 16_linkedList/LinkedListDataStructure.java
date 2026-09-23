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
    int size;


     int get(int idx){
        Node temp=head;
        for(int i=1;i<=idx;i++){
            head=head.next;
        }
        return head.val;
    }



    int  search(int val){
         if(head==null) return -1;
        Node temp=head;
        int idx=0;
        while(temp!=null){
            if(temp.val==val){
                return idx;
            }
            temp=temp.next;
            idx++;
        }
        return -1;
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


//add at the end 
    void addAtTail(int x){
        Node temp=new Node(x);
        if(tail==null) {
            head=tail=temp;
            size++;
            return;
        }
        tail.next=temp;
        tail=temp;
        size++;
    }




    //add at the beginning 
    void addAtHead(int x){
        Node temp=new Node(x);
        if(tail==null){
            head=tail=temp;
            size++;
            return;
        }
        temp.next=head;
        head=temp;
        size++;
    }


    //delete at head
    void deleteAtHead(){
       
        if(head==null) return;
        head=head.next;
        size--;
    }


    //delete from the end
   void deleteFromEnd(){
     if(head==null) return;
     if(head==tail)
     {
        head=tail=null;
        size--;
        return ;
     }
    Node temp=head;
    while(temp.next!=tail)
    {
        temp=temp.next;
    }
    temp.next=null;
    tail=temp;
    size--;

   }

   //add in a particular index
   void insert(int val,int idx){
       if(idx<0||idx>size){
        System.out.println("invalid index");
        return ;
       }
       if(idx==0){
        addAtHead(val);
        return;
       }
       if(idx==size){
        addAtTail(val);
        return ;
       }
       else{
       Node temp=head;
       for(int i=0;i<idx-1;i++){
        temp=temp.next;

       }
       Node t=new Node(val);
       t.next=temp.next;
       temp.next=t;
       size++;
    }
   }

   //delete element from a particular idx
   
    
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
        
        l1.deleteAtHead();
        l1.display();
        
        l1.deleteFromEnd();
        l1.display();

        // System.out.println(l1.search(20));

        l1.insert(60, 1);
        l1.display();
        
        System.out.println(l1.get(2));
    }
}
