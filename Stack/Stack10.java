package Stack;
//Max area in Histogram
import java.util.Stack;
public class Stack10 {
    public static void MaxArea(int arr[]){
        int maxArea =0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        //next smaller right
        Stack<Integer> stk = new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            while(!stk.isEmpty() && arr[stk.peek()] >=arr[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = stk.peek();
            }
            stk.push(i);
        }

        //next smaller left
        stk = new Stack<>();
        for(int i=0; i< arr.length; i++){
            while(!stk.isEmpty() && arr[stk.peek()] >=arr[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                nsl[i] = -1;
            }else{
                nsr[i] = stk.peek();
            }
            stk.push(i);
        }

        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currArea = height*width;
            maxArea = Math.max(currArea , maxArea);
        }
        System.out.println("The max Area is " + maxArea);
    }
    public static void main(String[] args) {
        int arr[] = {10,2,4,10};
        MaxArea(arr);
    }
}
