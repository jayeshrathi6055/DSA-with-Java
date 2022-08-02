import java.util.*;

public class StackMethods {
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    public static Stack<Integer> pushAtLast(Stack<Integer> s, int value){
        if(s.isEmpty()){
            s.push(value);
            return s;
        }
        int top = s.peek();
        s.pop();
        s = pushAtLast(s,value);
        s.push(top);
        return s;
    }
    public static Stack<Integer> reverseStack(Stack<Integer>s){
        Stack<Integer> n = new Stack<>();
        while(!s.isEmpty()){
            n.push(s.pop());
        }
        return n;
    }
    public static Stack<Integer> reverseStackRecurrsion(Stack<Integer>s){
        if(s.isEmpty()){
            return s;
        }
        int top = s.pop();
        s = reverseStackRecurrsion(s);
        s = pushAtLast(s,top);
        return s;
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        // Push at last method
        System.out.println("------------------------>");
        s = pushAtLast(s, 5);
        printStack(s);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("------------------------>");
        // Reverse an stack iteratively
        printStack(reverseStack(s));
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println("------------------------>");
        // Reverse an stack reccursively
        s = reverseStackRecurrsion(s);
        printStack(s);
        System.out.println("------------------------>");
    }
}
