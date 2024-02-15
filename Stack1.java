import java.util.*;

public class Stack1{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        // Push elements to stack
        st.push(3);
        st.push(6);
        st.push(9);
        st.push(14);
        st.push(10);
        //peek
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println("Size is : " + st.size());
        System.out.println(st.empty());
    }
}