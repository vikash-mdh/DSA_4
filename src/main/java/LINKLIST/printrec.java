package LINKLIST;
import java.util.*;
   class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

public class printrec {
       // print the using recursion
        public static void printList(Node head) {
            if (head == null) {
                return;
            }
            System.out.print(head.data+" ");
            printList(head.next);
            System.out.println();
        }



    // print the using whlie loop
    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

        public static void main(String[] args) {
            Node head = new Node(1, new Node(2, new Node(3, null)));
            printList(head);
            printlist(head);
        }

    }

