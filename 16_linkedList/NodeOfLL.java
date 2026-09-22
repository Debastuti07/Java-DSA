import java.util.Scanner;

class Node{
    int val;
    Node next;//default null
    Node(int val){
      this.val=val;  
    }
}
public class NodeOfLL {
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;//Very Imp

        }
    }
    public static void displayRec(Node head){
        if(head==null) return;
        System.out.println(head.val);
        displayRec(head.next);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //create node 
        Node a=new Node(sc.nextInt());//user input
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        //10->20->30->40->50
        // a.val=10;
        // b.val=10;
        // c.val=10;
        // d.val=10;
        // e.val=10;
        System.out.println(c.next);
        // linked node 
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(a);
        System.out.println(a.next.next);//point c
        System.out.println(b);
        System.out.println(b.next);//point c
        System.out.println(c);
        System.out.println(a.next.next.next.val);
        // display(a);
        // displayRec(a);
        System.out.println(get(a,2));
        // Node n=null; 
        // System.err.println(n.val);//null pointer exception

    }

    private static int get(Node head,int idx){
        Node temp=head;
        for(int i=1;i<=idx;i++){
            head=head.next;
        }
        return head.val;
    }
    
}
