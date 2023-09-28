public class duuble_LL {
    Node R = null, L = null;
    private int size;

    void linkedList() {
        this.size = 0;
    }

    class Node {
        int data;
        Node LPTR;
        Node RPTR;

        Node(int data) {
            this.data = data;
            this.LPTR = null;
            this.RPTR = null;
            size++;
        }
    }

    void dou_ins(int data, int m) {
        Node newNode = new Node(data);

        if (R == null) {
            newNode.LPTR = null;
            newNode.RPTR = null;
            R = L = newNode;
            return;
        }

        if (L.data == m) {
            newNode.LPTR = null;
            newNode.RPTR = L;
            // L.LPTR = newNode;
            L = newNode;
            return;
        }

        Node currNode = new Node(data);
        currNode = L;
        while (currNode.data != m && currNode.RPTR != R) {
            currNode = currNode.RPTR;
        }
        newNode.LPTR = currNode.LPTR;
        newNode.RPTR = currNode;
        (currNode.LPTR).RPTR = newNode;
        currNode.LPTR = newNode;
        return;
    }

    void dou_del(int old) {
        if (R == null) {
            System.out.println("underflow");
            return;
        }

        if (L == R) {
            L = R = null;
            return;
        } else if (old == L.data) {
            L = L.RPTR;
            L.LPTR = null;
            return;

        } else if (old == R.data) {
            (R.LPTR).RPTR = null;
            return;
        }
        Node currNode = new Node(old);
        currNode = L;
        while (currNode.data != old && currNode.RPTR != R) {
            currNode = currNode.RPTR;
        }

        (currNode.LPTR).RPTR = currNode.RPTR;
        (currNode.RPTR).LPTR = currNode.LPTR;

    }

    public void printList() {
        if (L == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = L;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.RPTR;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        duuble_LL list = new duuble_LL();
        list.dou_ins(5, 0);
        list.dou_ins(6, 5);
        list.dou_ins(7, 6);
       list.dou_ins(4, 7);
        list.printList();
    }
}
