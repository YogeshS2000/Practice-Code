import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class createGraph {
    static class edge {
        int src;
        int dest;
        // int weight;

        edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
            // this.weight = wt;
        }
    }

    public static void creategraph(ArrayList<edge> graph[], int v) {
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        // graph[0].add(new edge(0, 1));
        // graph[0].add(new edge(0, 2));
        // graph[1].add(new edge(1, 0));
        // graph[1].add(new edge(1, 3));
        // graph[2].add(new edge(2, 0));
        // graph[2].add(new edge(2, 4));
        // graph[3].add(new edge(3, 1));
        // graph[3].add(new edge(3, 4));
        // graph[3].add(new edge(3, 5));
        // graph[4].add(new edge(4, 2));
        // graph[4].add(new edge(4, 3));
        // graph[4].add(new edge(4, 5));
        // graph[5].add(new edge(5, 3));
        // graph[5].add(new edge(5, 4));
        // graph[5].add(new edge(5, 6));
        // graph[6].add(new edge(6, 5));

        graph[0].add(new edge(0, 2));
        graph[1].add(new edge(1, 0));

        graph[2].add(new edge(2, 3));

        graph[3].add(new edge(3, 4));

        // graph[4].add(new edge(4, 0));

    }

    public static void BFS(ArrayList<edge> graph[], int value, boolean visted[]) {
        Queue<Integer> q = new LinkedList<>();

        q.add(value);
        visted[value] = true;
        System.out.println(q.peek());

        while (!q.isEmpty()) {
            int curr = q.remove();

            for (int i = 0; i < graph[curr].size(); i++) {
                if (visted[graph[curr].get(i).dest] == false) {
                    q.add(graph[curr].get(i).dest);
                    System.out.println(graph[curr].get(i).dest);
                    visted[graph[curr].get(i).dest] = true;
                }
            }
        }

    }

    public static void DFS(ArrayList<edge> graph[], int curr, boolean visted[]) {

        System.out.println(curr);
        visted[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            if (visted[curr] == false) {
                DFS(graph, graph[curr].get(i).dest, visted);
            }

        }
    }

    public static void AllPaths(ArrayList<edge> graph[], int srx, int desx, boolean visted[],
            String paths) {

        if (srx == desx) {
            System.out.println(paths);
            return;
        }

        for (int i = 0; i < graph[srx].size(); i++) {
            edge e = graph[srx].get(i);

            if (visted[e.dest] == false) {
                visted[srx] = true;
                AllPaths(graph, e.dest, desx, visted, paths + e.dest);
                visted[srx] = false;
            }
        }
    }

    public static boolean directedCycle(ArrayList<edge> graph[], int curr, boolean visted[], boolean rec[]) {
        visted[curr] = true;
        rec[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            if (rec[graph[curr].get(i).dest]) {
                return true;
            } else if (!visted[graph[curr].get(i).dest]) {
                return directedCycle(graph, graph[curr].get(i).dest, visted, rec);
            }
        }
        rec[curr] = false;
        return false;
    }

    public static void main(String args[]) {
        int v = 5;
        ArrayList<edge> graph[] = new ArrayList[v];
        creategraph(graph, v);

        // print 2nd node adj
        // System.out.println("2nd node ajecency nodes");
        // for (int i = 0; i < graph[2].size(); i++) {
        // edge e = graph[2].get(i);
        // System.out.print(e.dest + " " + e.weight + " ");
        // }
        boolean visted[] = new boolean[v];
        // for (int i = 0; i < visted.length; i++) {
        // if (visted[i] == false) {
        // BFS(graph, i, visted);
        // }
        // }
        // for (int i = 0; i < visted.length; i++) {
        // if (visted[i] == false) {
        // DFS(graph, i, visted);
        // }
        // }

        // AllPaths(graph, 0, 5, visted, "0");

        if (directedCycle(graph, visted, "0", new boolean[v])) {
            System.out.println("exist");
        } else {
            System.out.println("NOt Exist");
        }
    }
}