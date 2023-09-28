import java.util.Scanner;

public class E_prefix_arr {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter prefix string");
        String st = sc.nextLine();
        evelute e = new evelute();
        e.chek(st);
    }
}
class evelute{
     int arr[] = new int[15];
    int value=0;
    int ans=1;
    int ope1,ope2,top = 0,s;
    char temp;

    void push(int x){
        if(top >= 15){
            System.out.println("stack overflow");
        }
        arr[top] = x;
        System.out.println("push "+ arr[top]);
        top++;
    }

    int pop(){
        if(top < 0){
            System.out.println("stack underflow");
        }
        s = arr[top-1];
        System.out.println("pop "+arr[top-1]);
        top--;
        return s;
    }

    void chek(String st){
        for(int i=st.length()-1;i>=0;i--){
            if(st.charAt(i) == '0' || st.charAt(i) == '1' || st.charAt(i) == '2' || st.charAt(i) == '3' || st.charAt(i) == '4' || st.charAt(i) == '5' || st.charAt(i) == '6' || st.charAt(i) == '7' || st.charAt(i) == '8' || st.charAt(i) == '9'){
                push(Character.getNumericValue(st.charAt(i)));
            }
            else{
                ope1 = pop();
                ope2 = pop();
                value = cal(ope1,ope2,st.charAt(i));
                push(value);
            }
            System.out.println("---------"+"stack"+"---------");
            System.out.println("---------"+s+"---------");
        }
        System.out.println("Value of postfix expression is "+pop());
    }
    int cal(int ope1,int ope2,char sign){
        System.out.println(sign);
        if(sign == '+'){
            return (ope1+ope2);
        }
        else if(sign == '-'){
            return (ope1-ope2);
        }
        else if(sign == '*'){
            return (ope1*ope2);
        }
        else if(sign == '/'){
            return (ope1/ope2);
        }
        else if(sign == '^'){
            for(int i=0;i<ope2;i++){
                ans = ans * ope1;
            }
            return ans;
        }
        else{
            return 0;
        }
    }
}


