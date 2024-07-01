package LINKLIST;
import java.util.*;
public class RevLinklist {

        // Definition for singly-linked list.
        static class Node {
            int val;
            Node next;
            Node(int x) {
                val = x;
                next = null;
            }
        }
        // Function to reverse the linked list
        public Node reverseList(Node head) {
            Node prev = null;
            Node current = head;
            Node next = null;

            while (current != null) {
                next = current.next;  // Store the next node
                current.next = prev;  // Reverse the current node's pointer
                prev = current;       // Move pointers one position ahead
                current = next;
            }
            return prev;
        }

        // Helper function to print the linked list
        public void printList(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Main method
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            RevLinklist list = new RevLinklist();
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node current = head;
            for (int i = 1; i < n; i++) {
                current.next = new Node(sc.nextInt());
                current = current.next;
            }
            // Reversing the linked list function call
            head = list.reverseList(head);

            // print function call
            list.printList(head);

            sc.close();
            // hello dosto
        }
    }


