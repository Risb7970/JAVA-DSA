package Queue;
//Deque in java
import java.util.*;
public class Deque1 {
    public static void main(String args[]){
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.removeFirst();
        System.out.println(deque);
    }
}
