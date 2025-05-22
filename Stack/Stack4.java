package Stack;

import java.util.Stack;

//Reverse the String using stack
public class Stack4 {
    public static String reverseString(String str){
        Stack<Character> stk = new Stack<>();
        int idx =0;
        while(idx<str.length()){
            stk.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder();
        while(!stk.isEmpty()){
            char curr = stk.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "Rishabh";
        String result = reverseString(str);
        System.out.println(result);
    }
}
