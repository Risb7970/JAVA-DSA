package Queue;
//Implementation of the Queue using the Linked List...
public class Queue3 {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;
        public static boolean isEmpty(){
            return head==null && tail==null;
        }

        //Add the element in the Queue
        public static void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head=tail=newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //method for removing the element from Queue
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            if(head==tail){
                head =tail =null;
                return -1;
            }
            int front = head.data;
            head = head.next;
            return front;
        }

        //method for returning the front element of the Queue
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
