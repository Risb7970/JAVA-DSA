package Queue;
//Implementation of Queue using Array....
public class Queue1 {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        Queue(int n){
            arr = new int[n];
            size =n;
            rear = -1;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        //Method for adding element in the Queue
        public static void add(int data){
            if(rear ==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear+=1;
            arr[rear] = data;
        }
        //Method for removing element from Queue
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        //peek function for returning the front of the Queue
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String args[]){
       Queue q = new Queue(5);
       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       while(!q.isEmpty()){
           System.out.println(q.peek() + " ");
           q.remove();
       }

    }
}
