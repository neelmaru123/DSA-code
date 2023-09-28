import java.util.Scanner;

public class Circular_LL {
    Node head,last;
    private int size;

    Circular_LL(){
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
             newNode.next= newNode;
            head = newNode;
            last = newNode;
            return;
        }else{
        newNode.next = head;
        last.next = head;
        head =newNode;

        }
    }


    public void addLast(int data){
         Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            last = newNode;
            return;
        }else{
        last.next = newNode;
        last = newNode;
        last.next = head;

        }
    }

    public void delFirst(int data){
        if(head == last){
            head = last = null;
        }
         
        head = head.next;
        last.next = head;

    }
     public void delLast(int data){
        if(head == last){
            last = head = null;
        }
         
        Node currNode = head;
        while(currNode.next != last){
            currNode = currNode.next; 
        }
        System.out.println((currNode.next).data);
        last = currNode;
        last.next = head;

    }
    
    public void printList(){
        if(head == last){
            System.out.println(head.data);
           return ;
        }
        Node currNode = head;
        while(currNode != last){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.print(currNode.data+" ->");
        System.out.println("null");
    }



    public int getSize(){
        return size;
    }


    public void Delete_Ord(int data){
        Node newNode = new Node(data);

        if(head == null){
            System.out.println("linked list is empty");
        }
         
         Node currNode = head;
         Node pred =null ;
        while(currNode.data != data && currNode != last){
            pred = currNode;
            currNode = currNode.next;
        } 

        if(currNode.data != data){
           System.out.println("data not found");
        }
        if(data == head.data){
            head = head.next;
            last.next = head;
        }

        else{
            pred.next = currNode.next;
            if(data == last.data){
                  last = pred;
            }
        }
        
    }


    public static void main(String[] args) {
        Circular_LL list = new Circular_LL(); 
       int choice = 1,temp;
       Scanner sc = new Scanner(System.in);

       while(choice!=0){
      System.out.println("enter 1 for addfirst -");
      System.out.println("enter 2 for addlast -");
      System.out.println("enter 3 for delfirst -");
      System.out.println("enter 4 for dellast -");
      System.out.println("enter 5 for delete particular data -");
      System.out.println(" enter 0 for exit -");
      choice = sc.nextInt();

      if(choice == 1||choice == 2 || choice == 5){
        System.out.println("enter element");
        temp = sc.nextInt();
      }
      else{
        temp =0;
      }
      switch(choice){
        case 1:
        list.addFirst(temp);
        list.printList();
        break;
        
        case 2:
        list.addLast(temp);
        list.printList();
        break;

        case 3:
         list.delFirst(temp);
        list.printList();
        break;

        case 4:
         list.delLast(temp);
        list.printList();
        break;


        case 5:
        list.Delete_Ord(temp);
        list.printList();
        break;

        default:
        break;
      }
     }
     list.printList();
   } 
}

