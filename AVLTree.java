public class AVLTree{
    Node root = null;
    class Node{
        int info;
        Node left;
        Node right;

        Node(int info){
            this.info = info;
            this.left = null;
            this.right = null;
        }
    }

    void AVL(int info){
        Node newNode = new Node(info);
        if(root == null){
            root = newNode;
            return;
        }

        Node currNode = root;
        while(true){
            if(currNode.info > info && currNode.right == null){
                currNode.right = newNode;
                break;
            }
            else if(currNode.info > info && currNode.right != null){
                currNode = currNode.right;
            }
            else if(currNode.info < info && currNode.left == null){
                currNode.left = newNode;
                break;
            }
            else if(currNode.info < info && currNode.left != null){
                currNode = currNode.left;
            }
        }

    }
    public static void main(String[] args) {
        AVLTree a = new AVLTree();
        a.AVL(5);
        a.AVL(4);
        a.AVL(6);
        a.AVL(8);
    }
}