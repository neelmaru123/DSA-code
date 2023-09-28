import java.util.Scanner;

public class queue {
    public static void main(String[] args) {
        abc a = new abc();
        Scanner sc = new Scanner(System.in);
        int choice = 1,temp;

        do {
            if(choice == 1){
                System.out.print("Enter number :");
                temp = sc.nextInt();
                a.enqueue(temp);
                a.display();
                System.out.print("Enter 1 for insert , 2 for delete and 0 for exit : ");
                choice = sc.nextInt();
            } else {
                a.dqueue();
                a.display();
                System.out.print("Enter 1 for insert , 2 for delete and 0 for exit : ");
                choice = sc.nextInt();
            }
        } while (choice != 0);
    }
}

class abc{
    int arr[] = new int[10];
    int r=-1,f=-1,n=10,temp;

    void enqueue(int x){
        if(r >= n){
            System.out.println("queue overflow");
            return;
        }
        r += 1;
        arr[r] = x;
        if(f == -1){
            f = 0;
        }
    }

    int dqueue(){
        if(f == -1){
            System.out.println("queue underflow");
        }

        for(int i=0;i<r;i++){

            arr[i]=arr[i+1];
            // temp = arr[i];
        }
        // System.out.println("arr is "+arr[1]);

        if(r == f){
            f = 0;
            r = 0;
        }
        else{
            f = f + 1;
        }
        // System.out.println("delete"+temp);
        return temp;
    }

    void display(){
        for(int i=0;i<=r-f;i++){
            System.out.println(arr[i]);
        }
    }

}
