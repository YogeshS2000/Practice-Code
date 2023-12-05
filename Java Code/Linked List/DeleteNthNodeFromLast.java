import java.util.LinkedList;

class DeleteNthNodeFromLast {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int getllsize(Node head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }

    public static void delete(Node head, int n) {
        Node curr = head;
        int size = getllsize(curr);

        int k = size - n;
        int count = 1;
        Node pre = head;
        while (count < k) {
            pre = pre.next;
        }
        pre.next = pre.next.next;
    }

    public static void printll(Node root) {
        while (root != null) {
            System.out.println(root.data);
            root = root.next;
        }
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.next = new Node(2);
        root.next.next = new Node(3);
        root.next.next.next = new Node(4);
        root.next.next.next.next = new Node(5);
        delete(root, 2);
        printll(root);
        // LinkedList list=new LinkedList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // list.add(6);
    }
}