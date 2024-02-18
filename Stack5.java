import java.util.*;

public class Stack5 {//reverse a stack
    public static void displayReverse(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        System.out.println(top+ " ");
        displayReverse(st);
        st.push(top);
    }

    public static void displayRec(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        displayReverse(st);
        System.out.println(top+ " ");
        st.push(top);
    }

    public static void main(String[] args) {
        // create a stack of Integers
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        displayReverse(st);
    }
}
