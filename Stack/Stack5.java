package Stack;
//Reverse the stack
import java.util.*;
public class Stack5 {
    public static void pushAtBottom(Stack<Integer> stk, int data){
        if(stk.isEmpty()){
            stk.push(data);
            return;
        }
        int top = stk.pop();
        pushAtBottom(stk , data);
        stk.push(top);
    }
    public static void reverseStack(Stack<Integer> stk){
        if(stk.isEmpty()){
            return;
        }

        int top = stk.pop();
        reverseStack(stk);
        pushAtBottom(stk , top);
    }
    public static void printStack(Stack<Integer> stk){
        while(!stk.isEmpty()){
            System.out.println(stk.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(6);


        reverseStack(stk);
        printStack(stk);
    }
}
