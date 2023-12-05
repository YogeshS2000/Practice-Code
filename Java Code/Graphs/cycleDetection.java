import java.util.ArrayList;

public class cycleDetection {
    static class edge {
        int src;
        int dest;

        edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createg(ArrayList<edge> graph[], int v) {
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new edge(0, 1));
        // graph[0].add(new edge(0, 2));
        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 2));
        // graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 1));
        // graph[3].add(new edge(0, 1));
        // graph[3].add(new edge(0, 1));
        // graph[3].add(new edge(0, 1));
    }

    public static boolean undirectedCycle(ArrayList<edge> graph[], boolean visted[], int par, int curr) {

        visted[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (visted[e.dest] == true && e.dest != par) {
                return true;
            }
            if (visted[e.dest] != true) {
                undirectedCycle(graph, visted, curr, e.dest);
            }

        }
        return false;
    }

    public static void main(String args[]) {
        int v = 7;
        ArrayList<edge> graph[] = new ArrayList[v];
        boolean visted[] = new boolean[v];
        // for (int i = 0; i < v; i++) {
        // System.out.println(visted[i]);
        // }
        // ArrayList<Integer> arr = new ArrayList<>(5);
        // arr.add(1);
        // for (int i = 0; i < arr.size(); i++) {
        // System.out.println(arr.get(i));
        // }
        createg(graph, v);
        System.out.println(undirectedCycle(graph, visted, -1, 0));
        ;
    }
}
