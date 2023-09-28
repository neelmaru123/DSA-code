public class C_queue {
    public static void main(String[] args) {
        queue a = new queue();
        a.enqueue(1);
        a.enqueue(2);
        a.enqueue(3);
        a.enqueue(4);
        a.enqueue(5);
        a.enqueue(6);

        a.dqueue();
        a.dqueue();
        a.dqueue();

        a.enqueue(7);
        a.enqueue(8);
        a.enqueue(9);


        a.display();
    }
}

class queue{
    int arr[] = new int[6];
    int r=-1,f=-1,n=5,size = 0,temp;

    void enqueue(int x){
        if(r == n){
            f = 0;
            r = (r+1)/size+1;
        } else {
            r += 1;
        }

        if(f == r){
            System.out.println("queue overflow");
            return;
        }
        size++;
       
        arr[r] = x;


        if(f == -1){
            f = 0;
        }
        System.out.println(arr[r]+" is inserted");
    }

    void dqueue(){
        if(f == -1){
            System.out.println("queue underflow");
        }

        for(int i=0;i<5;i++){
            arr[i] = arr[i+1];
        }

        

        size--;
        if(r == f){
            f = -1;
            r = -1;
        }

        if( f == n){
            f = 0;
        }
        else{
            f = f + 1;
        }
        // System.out.println("delete"+temp);
    }

    void display(){
        
        for(int i=0;i<6;i++){
            System.out.print(arr[i] + " => ");
        }
    }

}

