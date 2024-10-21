package LINKLIST;
class Insertll{
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
    public void insertpos(int idx, int val){
        Node temp = new Node(val);
        Node x = head;
        for(int i = 1; i <idx-1; i++) {
            x = x.next;
        }
            // this is your insertation part
            temp.next = x.next;
            x.next = temp;
    }
    public void delete(int idx) throws Error{
        if(head == null) throw new Error("list");
        if(idx < 0 || idx > size)
            throw new Error("Invalid address");
        Node temp = head;
        for(int i = 1; i < idx-1; i++) {
            temp = temp.next;
        }
      temp.next = temp.next.next;
        size--;

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
        System.out.println("size : " + size);
    }
}
public class InsertgivenPosition {
//    public static void main(String[] args) {
//        Insertll list = new Insertll();
//        list.insertTail(10);
//        list.insertTail(30);
//        list.insertTail(40);
//        list.insertHead(90);
//        list.insertHead(45);
//        list.insertpos(3,55);
//        list.insertpos(4,78);
//        list.display();
//        list.size();
//        list.delete();
//        list.display();
//        list.size();
//
//    }
}
