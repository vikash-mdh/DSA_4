package LINKLIST;
 class Node{
     int val;
     Node next;
     Node(int val){
         this.val = val;
         this.next = next;
     }
 }
public class BasicLinklist {
     public static void printt(Node head){
         Node temp = head;
         while(temp != null){
             System.out.print(temp.val+" ");
             temp = temp.next;

         }
     }
     public static void printrecursive(Node head){
         if(head ==  null) return;

         printrecursive(head.next);
         System.out.print(head.val+" ");
     }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // printt(a);
        printrecursive(a);

    }
 }
