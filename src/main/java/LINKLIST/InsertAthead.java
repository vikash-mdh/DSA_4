package LINKLIST;
  class sll{
     private Node head;
     private    Node tail;
     private int size;
      public void insertTail(int val){
          Node temp = new Node(val);
          if(head ==  null) head = tail = temp;
            else
                tail.next = temp;
                tail = temp;
                size++;
      }
      public void insertHead(int val){
          Node temp = new Node(val);
          if(head == null) head = tail = temp;
          temp.next = head;
          head = temp;
          size++;
      }
      public void  display(){
          Node temp = head;
          while (temp != null){
              System.out.print(temp.val+ " ");
              temp = temp.next;

          }
          System.out.println();
      }
      public void size(){
          System.out.println("size :  " + size);
      }
  }
public class InsertAthead {
    public static void main(String[] args) {
        sll list = new sll();
        list.insertTail(10);
        list.insertTail(20);
        list.insertTail(30);
        list.display();
        list.insertHead(35);
        list.insertHead(50);
        list.size();
        list.display();
        list.size();

        // implementation of time complicity 0(1)

        // it only headd  of provide of 0(n)
    }
}
