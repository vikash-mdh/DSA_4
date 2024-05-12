package LINKLIST;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        next = null;
    }
}


class LinkedList {
    Node head;
    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
// this is the print function
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class Insertll {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBegin(1);
        list.insertAtBegin(2);
        list.insertAtBegin(3);
        list.insertAtBegin(4);
        list.insertAtBegin(5);
        System.out.print("Linked List: ");
        list.printList();
    }
}





