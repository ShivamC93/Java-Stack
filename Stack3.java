import java.util.*;

public class Stack3 {//reverse and copy
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        //reverse
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            int x = st.peek();
            rt.push(x);
            st.pop();
        }
        System.out.println(rt);
        //reverse copy
        Stack<Integer> gt = new Stack<>();
        while(rt.size()>0){
            int x = rt.peek();
            gt.push(x);
            rt.pop();
        }
        System.out.println(gt);
    }
}
