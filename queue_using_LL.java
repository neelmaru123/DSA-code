public class queue_using_LL {
    Node head;
    private int size;
    int temp;

    linkedList(){
        this.size = 0;
    }

     
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void enqueue(int data){
        Node newNode = new Node(data);
       if(head == null){
           head = newNode;
           return;
       }
       Node currNode = head;
       while(currNode.next != null){
           currNode = currNode.next;
       }
       currNode.next = newNode;
   }

   public int dqueue(){
        if(head == null){
           System.out.println("list is empty");
           return null;
        }
        size--;
        temp = head.data;
        head = head.next;
        return temp;
    }

    public void printqueue(){
        if(head == null){
           System.out.println("list is empty");
           return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        queue_using_LL q = new queue_using_LL();
    }

}
