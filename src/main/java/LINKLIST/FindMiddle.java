package LINKLIST;

import java.util.Scanner;

public class FindMiddle {
    // Definition for singly-linked list node
    public static class ListNode {
        int val;
       FindMiddle.ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Function to find the middle of the linked list
    public FindMiddle.ListNode findMiddle(FindMiddle.ListNode head) {
        if (head == null) return null;

       FindMiddle.ListNode slow = head;
        FindMiddle.ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

        }

        return slow;
    }

    // Helper function to print the linked list
    public void printList(FindMiddle.ListNode head) {
        FindMiddle.ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method to test the findMiddle function
    public static void main(String[] args) {
       FindMiddle list = new FindMiddle();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        FindMiddle.ListNode head = null;
        FindMiddle.ListNode temp = null;
        for(int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            FindMiddle.ListNode newNode = new FindMiddle.ListNode(val);
            if (head == null) {
                head = newNode;
                temp = head;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }

        // Finding the middle of the linked list
    FindMiddle.ListNode middle = list.findMiddle(head);
        System.out.println(middle.val);
    }
}

