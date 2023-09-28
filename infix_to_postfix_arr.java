import java.util.Scanner;

public class infix_to_postfix_arr {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String st = sc.nextLine();
        revpol r = new revpol();
        r.polish(st);
    }
}
class revpol{
    char arr[] = new char[100];
    int top = 0,s,temp,rank;
    String polish  = "";
    char next;
    static boolean flag = true;


    void push(int x){
        if(top >= 100){
            System.out.println("stack overflow");
        }
        arr[top] = x;
        top++;
    }

    int pop(){
        if(top < 0){
            System.out.println("stack underflow");
        }
        s = arr[top-1];
        top--;
        return s;
    }

    int spf(char a) {
        if (a == '+' || a == '-') {
            return 2;
        } else if (a == '*' || a == '/') {
            return 4;
        } else if (a == '^') {
            return 5;
        } else if (a == '(') {
            return 0;
        } else {
            return 8;
        }
    }

    int ipf(char c) {
        if (c == '+' || c == '-') {
            return 1;
        } else if (c == '*' || c == '/') {
            return 3;
        } else if (c == '^') {
            return 6;
        } else if (c == '(') {
            return 9;
        } else if (c == ')') {
            return 0;
        } else {
            return 7;
        }
    }

    int rank(int c ) {
        if (s == '*' || s == '/' || s == '^' || s == '+' || s == '-') {
            return -1;
        } else {
            return 1;
        }
    }

    void polish(String st){
        for(int i=0;i<st.length();i++){
            next = st.charAt(i);
            if(next != ' '){
                if(top < 0){
                    System.out.println("invalid");
                    flag = false;
                    break;
                }
            }
            while(spf(arr[top]) > ipf(next)){
                temp = pop();
                polish = polish + temp;
                rank = rank + rank(temp);
                if(rank < 1){
                    System.out.println("invalid");
                    flag = false;
                    break;
                }
            }
            if(!flag){
                break;
            }

            if(spf(arr[top] != ipf(next))){
                push(next);
            }
            else{
                pop();
            }
        }
        System.out.println("postfix expression is "+polish);
    }
    
}
