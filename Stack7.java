public class Stack7 { //Stack array implimentation
    public static class stack{
        private int[] arr = new int[5];
        private int idx = 0;
        
        void push(int x){
            if(isFull()){
                System.out.println("Stack is Full");
                return ;
            }
            arr[idx] = x;
            idx++;
        }

        int peek(){
            if(idx==0){
                System.out.println("Stack is full");
                return -1;
            }
            return idx-1;
        }

        int pop(){
            if(idx==0) return -1;
            int top = arr[idx-1];
            idx--;
            return top;
        }

        void display(){
            for(int i = 0; i<= idx; i++){
                System.out.println(arr[idx]);
            }
            System.out.println();
        }

        int size(){
            return idx;
        }

        boolean ifEmpty(){
            if(idx==0) return true;
            else return false;
        }

        boolean isFull(){
            if(idx==arr.length) return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        stack st = new stack();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(6);
        st.display();
        System.out.println("Size of the Stack : " +st.size());
        st.pop();
        st.display();
        st.peek();
    }
}
