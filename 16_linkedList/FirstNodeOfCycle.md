```java
/*
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/

class Solution {
    public int cycleStart(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                Node temp=head;
                while(temp!=slow){
                    temp=temp.next;
                    slow=slow.next;
                }
            return slow.data;
            }
        }
       return -1;
    }
}
```