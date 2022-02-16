package main.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private int v;
    private LinkedList<Integer> adj[];

    public Graph(int v) {
        this.v = v;
        this.adj = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
    }

    public void addEdges(int v, int u) {
        adj[v].add(u);
    }

    public void BFS(int s) {
        boolean[] visited = new boolean[v];
        Queue<Integer> q = new LinkedList<>();

        q.add(s);

        while (!q.isEmpty()) {
            int n = q.poll();
            for (Integer u: adj[n]) {
                if (!visited[u]) {
                    q.add(u);
                }
            }
            visited[n] = true;
        }
    }
}
