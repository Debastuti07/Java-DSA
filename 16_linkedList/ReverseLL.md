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
        if(head==null) return null;
        ListNode temp=head;
        ArrayList<ListNode>arr=new ArrayList<>();
        while(temp!=null){
            arr.add(temp);
            temp=temp.next;
        }
        int n=arr.size();
        for(int i=n-1;i>=1;i--){
            ListNode t1=arr.get(i);
            ListNode t2=arr.get(i-1);
            t1.next=t2;
        }
        arr.get(0).next=null;
        return arr.get(n-1);
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
        ListNode prev=null;
        ListNode curr=head;
        ListNode fwd;

       if(head==null || head.next==null) return head;
        
        ListNode a=head.next;
        head.next=null;
        ListNode b=reverseList(a);
        a.next=head;
        return b;
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
}
```