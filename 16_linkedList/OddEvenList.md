```java
/* Structure of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}*/

class Solution {
    Node divide(Node head) {
        // code here
        if(head==null || head.next==null) return head;
        Node d1=new Node(-1);
        Node d2=new Node(-1);
        Node t1=d1;
        Node t2=d2;
        Node t=head;
        while(t!=null){
            if(t.data%2==0){
                t1.next=t;
                t=t.next;
                t1=t1.next;

            }
            else{
                t2.next=t;
                t=t.next;
                t2=t2.next;
            }
        }

        t2.next=null;

        t1.next=d2.next;

        return d1.next;
    }
}
```