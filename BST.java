import java.util.*;

import javax.swing.RootPaneContainer;

public class BST {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Tree t = new Tree();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] { 4, 1, 6, 5, 2, 9 };
        for (int i = 0; i < arr.length; i++) {
            t.insert(t.ROOT, arr[i]);
        }
        t.printLevelOrder();
        // System.out.print("In order :");
        // t.printInOrder(t.ROOT);
        // System.out.println();
        // System.out.print("Pre order :");
        // t.printPostOrder(t.ROOT);
        // System.out.println();
        // System.out.print("Post order :");
        // t.printPreOrder(t.ROOT);
        // int choice = 1;
        // int temp = 0;
        // while (choice != 0) {
        // switch (choice) {
        // case 1:
        // temp = sc.nextInt();
        // t.insert(t.ROOT, temp);
        // System.out.println("enter 1 for insert");
        // System.out.println("enter 2 for inorder traversel");
        // System.out.println("enter 3 for Pre traversel");
        // System.out.println("enter 4 for Post traversel");
        // choice = sc.nextInt();
        // break;
        // case 2:
        // System.out.print("In order :");
        // t.printInOrder(t.ROOT);
        // break;
        // case 3:
        // System.out.print("Pre order :");
        // t.printPostOrder(t.ROOT);
        // break;
        // case 4:
        // System.out.print("Post order :");
        // t.printPreOrder(t.ROOT);
        // break;
        // default:
        // System.out.println("invalid choice");
        // }
        // }
        // // String str = "";
        // while(n != 0){
        // char ch = (char) ((n-1)%26 + 65);
        // n = (n-1) / 26;
        // str = ch + str;
        // }
        // return str;
    }
}

class Node {
    int data;
    Node LPTR;
    Node RPTR;

    Node(int data) {
        this.data = data;
        this.LPTR = null;
        this.RPTR = null;

    }
}
// class tree{
// int root = (Integer) null;
// }

class Tree {
    Node ROOT = new Node(0);

    public Node insert(Node root, int value) {
        Node n = new Node(value);
        if (root == null) {
            root = n;
            return root;
        }

        else if (value < root.data) {
            root.LPTR = insert(root.LPTR, value);
            // System.out.println("left :"+root.data);
            return root;
        } else {
            root.RPTR = insert(root.RPTR, value);
            // System.out.println("right :"+root.data);
            return root;
        }
    }

    public void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.LPTR);
            System.out.print(node.data + " - ");
            printInOrder(node.RPTR);
        }

    }

    public void printPostOrder(Node node) {
        if (node != null) {
            printPostOrder(node.LPTR);
            printPostOrder(node.RPTR);
            System.out.print(node.data + " - ");
        }

    }

    public void printPreOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " - ");
            printPreOrder(node.LPTR);
            printPreOrder(node.RPTR);
        }
    }

    public void printTree(){
        Queue<Integer> q = new Queue();

        while(!q.isEmpty()){
            q.add(ROOT);
            int len = q.size();
            for(int i=0;i<len;i++){
                
            }
        }
    }

}
