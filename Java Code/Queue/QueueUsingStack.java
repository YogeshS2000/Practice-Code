import java.util.*;

class QueueUsingStack {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void add(int data) {
            if (s1.isEmpty()) {
                s1.push(data);
                return;
            }

            while (!s1.isEmpty()) {
                int sdata = s1.pop();
                s2.push(sdata);
            }
            s1.push(data);

            while (!s2.isEmpty()) {
                int sdata = s2.pop();
                s1.push(sdata);
            }
        }

        public static int remove() {
            if (s1.isEmpty()) {
                return -1;
            }
            int pdata = s1.peek();
            s1.pop();
            return pdata;
        }

        public static int peek() {
            if (s1.isEmpty()) {
                return -1;
            }

            return s1.peek();
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue();
        // Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}