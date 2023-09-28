import java.util.Scanner;

public class linkedList {
    Node head;
    private int size;

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

    
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    public void addLast(int data){
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

    
    public void printList(){
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


    public void deleteFirst(){
        if(head == null){
           System.out.println("list is empty");
           return;
        }
        size--;
        head = head.next;
    }


    public int getSize(){
        return size;
    }


    public void deleteLast(){
         if(head == null){
           System.out.println("list is empty");
           return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }


    public void INSORD(int data){
        Node newNode = new Node(data);

        if(head == null){
            newNode.next = null;
            return;
        }

        if(newNode.data <= head.data){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null && newNode.data >= (currNode.next).data){
            currNode = currNode.next;
        } 
        newNode.next = currNode.next;
        currNode.next = newNode;
    }


    public static void main(String[] args) {
       linkedList list = new linkedList();
       int choice = 1 ,temp;
       Scanner sc =  new Scanner(System.in);

        while (choice != 0){
            System.out.println("Enter 1 for addFirst - ");
            System.out.println("Enter 2 for addLast - ");
            System.out.println("Enter 3 for deleteFirst - ");
            System.out.println("Enter 4 for deleteLast - ");
            System.out.println("Enter 5 for insert in order -");
            System.out.println("Enter 0 for Exit -");
            choice = sc.nextInt();
            if(choice == 1 || choice == 2 || choice == 5 ){
                System.out.print("Enter elemet : ");
                temp = sc.nextInt();
            }
            else{
                temp = 0;
            }
            switch (choice) {
                case 1:
                    list.addFirst(temp);
                    list.printList();
                    break;
                case 2:
                    list.addLast(temp);
                    list.printList();
                    break;
                case 3:
                    list.deleteFirst();
                    list.printList();
                    break;
                case 4:
                    list.deleteLast();
                    list.printList();
                    break; 
                case 5:
                    list.INSORD(temp);
                    list.printList();
                    break;                     
                default:
                    break;
            }
        }

        list.printList();

    }
}

