package linkedlist;

public class LinkedList1  {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){ //O(1)
        
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        size++;
        head = newNode;
    }
    public  void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp= temp.next;
        }
        System.out.println("Null");
    }
    public void Reverse(){
        Node prev = null;
        Node curr =tail= head;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr =next;
        }
        head = prev;

    }
    // hello this is linkedlist

    public void deleteNthfromEnd(int n){
        int sz =0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }
        if(n==sz){
            head = head.next;
            return;
        }

        //sz-1
        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        while(i<iToFind){
         prev = prev.next;
         i++;
        }
        prev.next = prev.next.next;
    }
    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.printList();
        ll.Reverse();
        ll.printList();
        ll.deleteNthfromEnd(2);
        ll.printList();
    }
    
} 
