```java
/* Linked List Node Structure
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
            public Node reverseList(Node head) {

                  Node prev = null;
                  Node curr = head;

                   while (curr != null) {
                       Node next = curr.next;
                       curr.next = prev;
                       prev = curr;
                       curr = next;
                   }

                   return prev;
               }
            public Node reverseCircular(Node head) {
                // code here


                Node temp=head;
                while(temp.next!=head){
                    temp=temp.next;
                }
                temp.next=null;
                reverseList(head);
                head.next=temp;
                return temp;
            }
        }
    
```