import java.util.*;

class createBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int i = 0;

    public static Node BSTree(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val < root.data) {
            root.left = BSTree(root.left, val);
        } else {
            root.right = BSTree(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        } else if (key > root.data) {
            return search(root.right, key);
        } else {
            return search(root.left, key);
        }
    }

    public static Node DeleteBST(Node root, int value) {
        if (value > root.data) {
            root.right = DeleteBST(root.right, value);
        } else if (value < root.data) {
            root.left = DeleteBST(root.left, value);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                Node IS = InorderSuccessor(root.right);
                root.data = IS.data;
                root.right = DeleteBST(root.right, IS.data);
            }
        }
        return root;
    }

    public static Node InorderSuccessor(Node root) {
        if (root.left == null) {
            return root;
        }
        return InorderSuccessor(root.left);
    }

    public static void main(String args[]) {
        int arr[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = BSTree(root, arr[i]);
        }

        inorder(root);
        System.out.println();
        // System.out.println(search(root, 2));
        root = DeleteBST(root, 6);
        root = DeleteBST(root, 5);
        inorder(root);
        // Arrays.sort(arr);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

    }
}