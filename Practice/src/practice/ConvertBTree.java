package practice;


class BNode {
    int data;
    BNode left, right;
    BNode(int d) {
        data = d;
        left = null;
        right = null;
    }
}
public class ConvertBTree {
    BNode head;
    BNode root;
    static BNode prev = null;

    void convertBTreeToDLL(BNode root) {
        if (root == null)
            return;
        convertBTreeToDLL(root.left);

        if (prev == null) {
            head = root;
        }
        if (prev != null) {
            prev.right = root;
            root.left = prev;
        }
        prev = root;
        convertBTreeToDLL(root.right);
    }

    void print(BNode head) {
        while (head.right != null) {
            System.out.println(head.data + " ");
            head = head.right;
        }
    }

    public static void main(String[] args) {
        ConvertBTree tree = new ConvertBTree();
        tree.root = new BNode(10);
        tree.root.left = new BNode(12);
        tree.root.right = new BNode(23);
        tree.root.left.left = new BNode(25);
        tree.root.left.right = new BNode(30);
        tree.root.right.left = new BNode(36);

        tree.convertBTreeToDLL(tree.root);
        tree.print(tree.head);
    }
}
