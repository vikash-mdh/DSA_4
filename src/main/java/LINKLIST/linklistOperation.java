package LINKLIST;
import java.lang.*;
public class linklistOperation {
    // this is called linklist class
       static class Node{
            int data;
            Node next;
            Node(int x){ // this is caled constructor
                data = x;
                next=null;
            }
        }

        public static void main(String args[])
        {
            Node head=new Node(10);
            Node temp1=new Node(20);
            Node temp2=new Node(30);
            // this is connect head to conect to temp1
            head.next=temp1;
            // this is connect temp1 to conect temp2
            temp1.next=temp2;
            // this is print function
            System.out.print(head.data+"-->"+temp1.data+"-->"+temp2.data);

        }
    }
