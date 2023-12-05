import java.util.ArrayList;

import org.w3c.dom.ranges.Range;

public class PrintInRange {
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

    public static Node buildBST(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value > root.data) {
            root.right = buildBST(root.right, value);
        } else if (value < root.data) {
            root.left = buildBST(root.left, value);
        }

        return root;
    }

    public static void inorderBST(Node root) {
        if (root == null) {
            return;
        }
        inorderBST(root.left);
        System.out.println(root.data);
        inorderBST(root.right);
    }

    public static void RangeBST(Node root, int x, int y) {
        if (root == null) {
            return;
        }
        if (root.data >= x && root.data <= y) {
            RangeBST(root.left, x, y);
            System.out.println(root.data);
            RangeBST(root.right, x, y);

        } else if (root.data >= y) {
            RangeBST(root.left, x, y);

        } else {
            RangeBST(root.right, x, y);
        }

    }

    public static void RootToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            path.add(root.data);
            for (int i = 0; i < path.size(); i++) {
                System.out.print(path.get(i));
            }
            System.out.println();
            path.remove(path.size() - 1);
            return;
        } else {
            path.add(root.data);
        }

        RootToLeaf(root.left, path);
        RootToLeaf(root.right, path);
        path.remove(path.size() - 1);
        return;
    }

    public static void main(String args[]) {
        int arr[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = buildBST(root, arr[i]);
        }
        // inorderBST(root);

        int x = 6;
        int y = 10;
        // RangeBST(root, x, y);
        ArrayList path = new ArrayList<>();
        RootToLeaf(root, path);
    }
}
