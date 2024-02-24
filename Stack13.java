import java.util.*;

public class Stack13 {//infix to prefix
    public static void main(String[] args) {
        String infix= "9-(5+3)*4/6";
        System.out.println(infix);
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i =0;i<infix.length();i++){
            char ch = infix.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                String s = "" + ch; // ASCII value of 0 is 48, so subtracting
                val.push(s);
            }
            
             // 48 from ASCII gives the integer value
            else if(op.size()==0 || ch == '(' || op.peek()=='(') op.push(ch);
            else if(ch==')'){
                while (op.peek()!='(') {
                    //work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                }
                op.pop();
            }
            else{
                if(ch=='+'|| ch=='-'){
                    //work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                    //push
                    op.push(ch);
                }
                    if(ch == '*' ||  ch == '/'){
                        if(op.peek()=='*' || op.peek()=='/'){
                            String v2 = val.pop();
                            String v1 = val.pop();
                            char o = op.pop();
                            String t = o + v1 + v2;
                            val.push(t);
                            //push
                            op.push(ch);
                        }
                        else op.push(ch);
                    }       
                }    
            }
   
        while(val.size()>1){
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t = o + v1 + v2;
            val.push(t);
        
        }
        String prefix = val.pop();
        System.out.println(prefix);
    }
}








