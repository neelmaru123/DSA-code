public class Stack_using_LL {
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

    public void push(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public int pop(){
        if(head == null){
           System.out.println("list is empty");
           return null;
        }
        size--;
        temp = head.data;
        head = head.next;
        return temp;
    }


    public void printStack(){
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
        Stack_using_LL s =  new Stack_using_LL();
        s.push(1);
        s.push(2);
        s.push(3);
        s.printStack();
        System.out.println("deleted elemet is "+s.pop());
         s.printStack();
    }
}
