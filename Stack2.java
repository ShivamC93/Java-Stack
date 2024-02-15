import java.util.*;

public class Stack2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter the number of elemets");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        for(int i =1;i<=n;i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
    }
}
