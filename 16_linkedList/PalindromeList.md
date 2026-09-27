```java
/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        Node temp=head;
                ArrayList<Integer> arr=new ArrayList<>();
                while(temp!=null){
                    arr.add(temp.data);
                    temp=temp.next;
                }
                int i=0;
                int j=arr.size()-1;
                while(i<j){
                int a=arr.get(i);
                int b=arr.get(j);
                    if (a!=b) {
                        return false;
                    }
                    i++;
                    j--;
                }
                return true;
    }
}
```



```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
     public ListNode reverseList(ListNode head) {
        
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        ListNode a=temp.next;
        temp.next=null;
        ListNode b=reverseList(a);
        a.next=temp;
        return b;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
       
       ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=reverseList(slow);
        ListNode i = head;
        ListNode j = head2;

        while (i!=null && j != null) {
            if (i.val != j.val)
                return false;

            i = i.next;
            j = j.next;
        }
        return true;

    }
}
```