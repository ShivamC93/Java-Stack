public class Stack8 {
    
    public static class Node{
        int val;
        Node next;
        Node(){
            this.val = val;
        }
    }

    
    public static class LLstack{
        private Node head = null;
        private int size = 0;
        void push(int x){
            Node temp = new Node();
            temp.next = head;
            head = temp;
            size++;
        }

        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.val + " ");
            }
            System.out.println();
        }
        int size(){
            return size;
        }

        int pop(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }

        int peek(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }
    }
    public static void main(String[] args) {
        LLstack st = new LLstack();
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
