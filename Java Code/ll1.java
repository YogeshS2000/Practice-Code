class LL {
    Node head = null;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertFirst(String data) {

        var newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(String data) {
        var newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
    }

    public void delete(String data) {
        if (head.data == data) {
            head = head.next;
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondlast = head;
        Node last = head.next;

        while (last.next != null) {
            last = last.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
        // Node curr = head;
        // while (curr.next.next != null) {
        // if (curr.next.data == data) {
        // curr.next = curr.next.next;
        // }
        // curr = curr.next;
        // }
        // if (curr.next.data == data) {
        // curr.next = null;
        // }
    }

    public void traverse() {

        if (head == null) {
            System.out.println("no data ");
            return;
        }

        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void main(String args[]) {
        var ll = new LL();

        ll.insertFirst("a");
        ll.insertFirst("is");
        // ll.insertFirst(3);
        // ll.insertLast(1);
        // ll.insertLast(2);
        ll.insertLast("list");
        ll.insertFirst("this");
        ll.traverse();
        System.out.println("after the dleetion");
        ll.delete("is");
        ll.traverse();
    }
}