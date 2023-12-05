import java.util.LinkedList;
import java.util.Queue;

public class NumberOfNodesInTree {
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

    public static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int x = countOfNodes(root.left);
        int y = countOfNodes(root.right);
        return x + y + 1;
    }

    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int x = sumOfNodes(root.left);
        int y = sumOfNodes(root.right);
        return x + y + root.data;
    }

    public static int heightoftree(Node root) {
        if (root == null) {
            return 0;
        }
        int x = heightoftree(root.left);
        int y = heightoftree(root.right);
        return Math.max(x, y) + 1;
    }

    public static int diameterOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int diam1 = diameterOfTree(root.left);
        int diam2 = diameterOfTree(root.right);
        int diam3 = heightoftree(root.left) + heightoftree(root.right) + 1;

        return Math.max(diam3, Math.max(diam1, diam2));
    }

    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameterOfTree2(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameterOfTree2(root.left);
        TreeInfo right = diameterOfTree2(root.right);

        int myheight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int mydiam = Math.max(diam3, Math.max(diam1, diam2));

        TreeInfo newinfo = new TreeInfo(myheight, mydiam);
        return newinfo;

    }

    public static int kthlevelsum(Node root, int k) {
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);
        int level = 1;
        int sum = 0;
        if (level == k) {
            return root.data;
        }
        while (!q.isEmpty()) {
            Node currNode = q.remove();

            if (currNode == null) {

                level++;
                if (level == k) {
                    while (q.peek() != null) {
                        sum = sum + q.remove().data;
                    }
                }
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }

            } else {
                if (currNode.left != null)
                    q.add(currNode.left);
                if (currNode.right != null)
                    q.add(currNode.right);
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(7);
        root.right.right = new Node(7);
        root.left.left.left = new Node(4);
        // System.out.println(countOfNodes(root));
        // System.out.println(sumOfNodes(root));
        // System.out.println(heightoftree(root));
        // System.out.println(diameterOfTree(root));
        // System.out.println(diameterOfTree2(root).diam);
        System.out.println(kthlevelsum(root, 3));
    }
}
