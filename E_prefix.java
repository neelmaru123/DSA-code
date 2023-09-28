import java.util.Scanner;
import java.util.Stack;

public class E_prefix {
    public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
        System.out.println("enter prefix string");
        String st = sc.nextLine();
        Eprifix e = new Eprifix();
        e.chek(st);  
    }
}

class Eprifix{
    Stack<Integer> s = new Stack<>();
    int value=0;
    int ans=1;
    int ope1,ope2;
    char temp;
    int i;
    
    void chek(String st){

        for(int i=st.length()-1;i>=0;i--){
        
            if(st.charAt(i) == '0' || st.charAt(i) == '1' || st.charAt(i) == '2' || st.charAt(i) == '3' || st.charAt(i) == '4' || st.charAt(i) == '5' || st.charAt(i) == '6' || st.charAt(i) == '7' || st.charAt(i) == '8' || st.charAt(i) == '9'){
                s.push(Character.getNumericValue(st.charAt(i)));
            }
            else{
                ope1 = s.pop();
                ope2 = s.pop();
                // System.out.println(ope1+ope2);
                value = cal(ope1,ope2,st.charAt(i));
                System.out.println(st.charAt(i));
                s.push(value);
            }
            
            System.out.println("---------"+"stack"+"---------");
            System.out.println("---------"+s+"---------");
            
        }
        System.out.println("Value of preefix expression is "+s.pop());
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


