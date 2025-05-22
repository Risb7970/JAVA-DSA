package Stack;
import  java.util.ArrayList;
//Stack Implementation using ArrayList
public class Stack1 {
    static class Stack{
        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty(){
            return list.size()==0;
        }
        //push function in Stack
        public void push(int data){
            list.add(data);
        }

        //pop function in Stack
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            return top;
        }
    }
    public static void main(String args[]){
       Stack s = new Stack();
       s.push(1);
       s.push(9);
       s.push(8);
       while(!s.isEmpty()){
           System.out.println(s.peek());
           s.pop();
       }
    }
}
