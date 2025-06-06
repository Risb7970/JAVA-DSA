package Stack;
import java.util.*;
//find the next greater element in the list
public class Stack7 {
    public static void main(String[] args) {
        int arr[] = {8,18,3,5,7,9,1,3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtGreater[i] =-1;
            }
            else{
                nxtGreater[i] = s.peek();
            }
            s.push(arr[i]);
        }
        System.out.println(Arrays.toString(nxtGreater));
    }
}
