package Stack;
//push at bottom of the stack
import java.util.*;
public class Stack3 {
    public static void pushAtBottom(Stack<Integer> stk , int data){
        if(stk.isEmpty()){
            stk.push((data));
            return;
        }
        int top = stk.pop();
        pushAtBottom(stk , data);
        stk.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        pushAtBottom(stk , 4);
        while(!stk.isEmpty()){
            System.out.println(stk.pop());
        }
    }
}
