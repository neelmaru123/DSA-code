import java.util.*;
import java.util.Stack;

public class infix_to_postfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String st = sc.nextLine();
        revpol r = new revpol();
        r.chek(st+" ");
    }
}

class revpol {
    String polish = "";
    int rank = 0, i = 0, rn;
    char temp;
    int g, f;
    Stack<Character> s = new Stack<>();

    void chek(String st) {
        s.push('(');

        while(st.charAt(i) != ' ') {
            if (s.size() < 1) {
                System.out.println("invalid from size");
                break;
            }
            if(i == 0){
                 g = precedenceG();
                 f = precedenceF(st);
                System.out.println("g " + g + " f " + f);
                rn = rank();
            }
           

            while (g > f) {
                System.out.println("stack in while " + s);
                temp = s.pop();
                polish = polish + temp;
                rank = rank + rn;

                if (rank < 1) {
                    System.out.println("invalid from rank");
                    break;
                }
                 g = precedenceG();
            }
            
            
            if (g != f) {
                s.push(st.charAt(i));
            } else {
                s.pop();
            }
            i++;
            g = precedenceG();
            f = precedenceF(st);
            System.out.println("g " + g + " f " + f);
            rn = rank();    
            
            System.out.println("Ending while " + s);
        }

        if (s.size() != 0 || rank != 1) {
            System.out.println("size "+s.size()+"rank "+rank);
            System.out.println("invalid from");
        } else {
            System.out.println("valid");
        }
        System.out.println("postfix expression is "+polish+s.pop()+s.pop());
    }

    int precedenceG() {
        if (s.empty()) {
            System.out.println("stack is empty");
        }
        if (s.peek() == '+' || s.peek() == '-') {
            return 2;
        } else if (s.peek() == '*' || s.peek() == '/') {
            return 4;
        } else if (s.peek() == '^') {
            return 5;
        } else if (s.peek() == '(') {
            return 0;
        } else {
            return 8;
        }
    }

    int precedenceF(String st) {
        if (st.charAt(i) == '+' || st.charAt(i) == '-') {
            return 1;
        } else if (st.charAt(i) == '*' || st.charAt(i) == '/') {
            return 3;
        } else if (st.charAt(i) == '^') {
            return 6;
        } else if (st.charAt(i) == '(') {
            return 9;
        } else if (st.charAt(i) == ')') {
            return 0;
        } else {
            return 7;
        }
    }

    int rank() {
        if (s.peek() == '+' || s.peek() == '-') {
            return -1;
        } else if (s.peek() == '*' || s.peek() == '/') {
            return -1;
        } else if (s.peek() == '^') {
            return -1;
        } else if (s.peek() == '(' || s.peek() == ')') {
            return 0;
        } else {
            return 1;
        }
    }
}