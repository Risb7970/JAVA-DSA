package linkedlist;

public class Doublyll {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public  int size;


    //Add operation in doubly LinkedList
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public int removeFirst(){
        if(head==null){
            System.out.print("Dll is Empty");
            return Integer.MIN_VALUE;
        }
        if(size ==1){
            int val = head.data;
            head = tail =null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;

    }
    public void reverseDll(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
     Doublyll dll = new Doublyll();
     dll.addFirst(1);
     dll.addFirst(4);
     dll.addFirst(9);
     dll.addFirst(10);
     dll.print();
     System.out.println(dll.size);
//        dll.removeFirst();
//        dll.print();
//        System.out.println(dll.size);
        dll.reverseDll();
        dll.print();
    }
}
