package practice;

import java.util.Scanner;

public class InsertBST {
    BNode root;

    BNode InsertInBST(BNode root, int data) {
        if (root == null) {
            root = new BNode(data);
            return root;
        }

        if (data < root.data)
            root.left = InsertInBST(root.left, data);
        else if (data > root.data)
            root.right = InsertInBST(root.right, data);

        return root;
    }

    void insert(int d) {
        root = InsertInBST(root, d);
    }

    void inorderRec(BNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    void traverse() {
        inorderRec(root);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        InsertBST tree = new InsertBST();
        while(n-- > 0) {
            int d = sc.nextInt();
            tree.insert(d);
        }
        tree.traverse();
    }
}
