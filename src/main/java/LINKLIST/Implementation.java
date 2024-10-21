package LINKLIST;
 class Singlylinklist{
     Node head;
     Node tail;
     int size;

   public void insertEnd(int val){
         Node temp = new Node(val);
         if(head ==  null) head = tail = temp;
         else
             tail.next = temp;
            tail = temp;
            size++;
     }
     public void display(){
       Node temp = head;
       while(temp != null){
           System.out.print(temp.val+" ");
           temp = temp.next;
       }
         System.out.println();
     }
     public void size(){
         System.out.println(size);
     }
 }
public class Implementation {
    public static void main(String[] args) {
        Singlylinklist list = new Singlylinklist();
        list.insertEnd(10);
       list.size();
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);
        list.insertEnd(50);
        list.display();
        list.size();

    }
}
