import java.util.*;

class Hashmapcode {
    static class Hash<k, v> {

        class Node {
            k key;
            v value;

            public Node(k key, v value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;// LL size
        private int N;// array size
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public Hash() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(k key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchinLL(int bi, k key) {
            LinkedList<Node> ll = buckets[bi];

            for (int i = 0; i < ll.size(); i++) {
                if (key == ll.get(i).key) {
                    return i;
                }
            }
            return -1;
        }

        private void reHashing() {
            LinkedList<Node> oldbuckets[] = buckets;
            N = N * 2;
            buckets = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldbuckets.length; i++) {
                LinkedList<Node> ll = oldbuckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(i);
                    put(node.key, node.value);
                }
            }

        }

        public void put(k key, v value) {
            int bi = hashFunction(key);
            int di = searchinLL(bi, key);

            if (di == -1) {
                buckets[bi].add(new Node(key, value));
                n++;
            } else {
                Node data = buckets[bi].get(di);
                data.value = value;
            }
            double lambda = (double) n / N;

            if (lambda > 2) {
                reHashing();
            }
        }

        public v get(k key) {
            int bi = hashFunction(key);
            int di = searchinLL(bi, key);

            if (di == -1) {
                return null;
            } else {
                Node data = buckets[bi].get(di);
                return data.value;
            }
        }

        public boolean contains(k key) {
            int bi = hashFunction(key);
            int di = searchinLL(bi, key);

            if (di == -1) {
                return false;
            } else {
                return true;
            }
        }

        public v remove(k key) {
            int bi = hashFunction(key);
            int di = searchinLL(bi, key);

            if (di == -1) {
                return null;
            } else {
                Node data = buckets[bi].remove(di);
                n--;
                return data.value;
            }
        }

        public boolean isEmpty() {
            return n == 0;
        }

        public ArrayList<k> keyset() {
            ArrayList<k> keys = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    keys.add(ll.get(j).key);
                }
            }
            return keys;
        }

        public static void main(String args[]) {
            Hash<String, Integer> map = new Hash<>();
            map.put("china", 100);

            map.put("india", 180);
            // System.out.println(map.remove("india"));
            // System.out.println(map.get("india"));
            // System.out.println(map.get("china"));
            System.out.println(map.contains("india"));
            System.out.println(map.isEmpty());
            System.out.println(map.keyset());
        }
    }
}