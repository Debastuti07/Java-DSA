```java
/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node deleteNode(Node head, int key) {
        // code here
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=null;
        
        if(key==head.data){
            head=head.next;
            temp.next=head;
            return head;
        }
        Node t=head;
        Node k=head.next;
        while(k!=null){
            if(k.data==key){
                t.next=k.next;
                
            }
            t=t.next;
            k=k.next; 
            
        }
        
        //find new temp (tail) if the temo itself got canceled 
        temp = head;
        while (temp.next != null) {
        temp = temp.next;
    }
        temp.next=head;
        return head;
    }
}
```