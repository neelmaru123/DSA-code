public class BSTNode
{
    int data;
    BSTNode parent;
    BSTNode left;
    BSTNode right;

    public BSTNode(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
        this.parent = null;
    }

    public BSTNode()
    {
    }
}

public class BSTFunctions
{
    BSTNode ROOT;

    public BSTFunctions()
    {
        this.ROOT = null;
    }

    void insertNode(BSTNode node, int data)
    {
        if (node == null)
        {
            node = new BSTNode(data);
            ROOT = node;
        }
        else if (data < node.data && node.left == null)
        {
            node.left = new BSTNode(data);
            node.left.parent = node;
        }
        else if (data >= node.data && node.right == null)
        {
            node.right = new BSTNode(data);
            node.right.parent = node;
        }
        else
        {
            if (data < node.data)
            {
                insertNode(node.left, data);
            }
            else
            {
                insertNode(node.right, data);
            }
        }
    }

    public boolean search(BSTNode node, int data)
    {
        if (node == null)
        {
            return false;
        }
        else if (node.data == data)
        {
            return true;
        }
        else
        {
            if (data < node.data)
            {
                return search(node.left, data);
            }
            else
            {
                return search(node.right, data);
            }
        }
    }

    public void printInOrder(BSTNode node)
    {
        if (node != null)
        {
            printInOrder(node.left);
            System.out.print(node.data + " - ");
            printInOrder(node.right);
        }
    }

    public void printPostOrder(BSTNode node)
    {
        if (node != null)
        {
            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.print(node.data + " - ");
        }
    }

    public void printPreOrder(BSTNode node)
    {
        if (node != null)
        {
            System.out.print(node.data + " - ");
            printPreOrder(node.left);
            printPreOrder(node.right);
        }
    }

    public void InsertNodeInBST(int key){
        BSTNode newN = new BSTNode(key);
        BSTNode currNode = null;
        if(ROOT == null){
            ROOT = newN;
            return;
        }
        else{
            currNode = ROOT;
            while(true){
                if(key < currNode.data && currNode.left == null){
                    currNode.left = newN;
                    return;
                }
                else if(key < currNode.data && currNode.left != null){
                    currNode = currNode.left;
                }
                else if(key > currNode.data && currNode.right == null){
                    currNode.right = newN;
                    return;
                }
                else if(key > currNode.data && currNode.right != null){
                    currNode = currNode.right;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        BSTFunctions f = new BSTFunctions();
        /**
         * Insert
         */
        f.InsertNodeInBST( 20);
        f.InsertNodeInBST( 5);
        f.InsertNodeInBST(25);
        

        /**
         * Print
         */
        f.printInOrder(f.ROOT);
        System.out.println("");
        f.printPostOrder(f.ROOT);
        System.out.println("");
        f.printPreOrder(f.ROOT);
        System.out.println("");

        /**
         * Search
         */
        // System.out.println(f.search(f.ROOT, 27) ? "Found" : "Not Found");
        // System.out.println(f.search(f.ROOT, 10) ? "Found" : "Not Found");
    }
}
