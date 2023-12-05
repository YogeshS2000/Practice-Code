import java.util.*;

class QueueUsingStack2 {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s2.isEmpty() && s1.isEmpty();
        }

        public static void add(int data) {
            s1.push(data);
        }

        public static int remove() {
            if (s1.isEmpty() && s2.isEmpty())
                return -1;
            if (s1.isEmpty() && !s2.isEmpty()) {
                return s2.pop();
            }
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            return s2.pop();

        }

        public static int peek() {
            if (s1.isEmpty() && s2.isEmpty())
                return -1;
            if (s1.isEmpty() && !s2.isEmpty()) {
                return s2.peek();
            }
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            return s2.peek();
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue();
        // Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}