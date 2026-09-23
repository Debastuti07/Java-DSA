```java
/* Linked List Node Structure
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        int length=0;
        Node temp=head;
        while(temp!=null)
        {
            length++;
            temp=temp.next;
        }
        temp=head;
        for(int i=1;i<=length/2;i++){
            temp=temp.next;
        }
        return temp.data;
    }
}
```