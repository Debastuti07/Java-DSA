class ListNode {
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val){
        this.val=val;
    }
}
class DoublyLinkedList {
    ListNode head;
    ListNode tail;
    int size;
    void AddAtHead(int val){
        ListNode temp=new ListNode(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
        size++;
    }


    void AddAtTail(int val){
        ListNode temp=new ListNode(val);
        if(head==null) head=tail=temp;
        else{
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        size++;
    }
    void DeleteAtHead(){
        
        if(head==null) head=tail=null;
        else{
            head=head.next;
            head.prev=null;
        }
        size--;
    }

    void DeleteAtTail(){
        
        if(size==0 || size==1) head=tail=null;
        
        else{
            tail=tail.prev;
            tail.next=null;
        }
        size--;
    }
    void display(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void insert(int val,int idx){
       if(idx<0||idx>size){
        System.out.println("invalid index");
        return ;
       }
       if(idx==0){
        AddAtHead(val);
        return;
       }
       if(idx==size){
        AddAtTail(val);
        return ;
       }
       else{
       ListNode temp=head;
       for(int i=0;i<idx-1;i++){
        temp=temp.next;

       }
       ListNode t=new ListNode(val);
       t.next=temp.next;
       temp.next=t;
       t.prev=temp;
       t.next.prev=t;
       size++;
    }
   }

    void displayReverse(){
        ListNode temp=tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
}
public class DoublyLL {
    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.AddAtHead(50);
        dll.AddAtHead(40);
        dll.AddAtHead(30);
        dll.AddAtHead(20);
        dll.display();

        dll.AddAtTail(10);
        dll.display();

        dll.DeleteAtHead();
        dll.display();

        dll.DeleteAtTail();
        dll.display();
        dll.displayReverse();

        dll.insert(80, 3);
        dll.display();

       
    }
}
