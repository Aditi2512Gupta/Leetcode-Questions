import java.util.*;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) return true;

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            int u = e[0], v = e[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.offer(source);
        visited[source] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            if (node == destination) return true;

            for (int nei : graph.get(node)) {
                if (!visited[nei]) {
                    visited[nei] = true;
                    q.offer(nei);
                }
            }
        }
        return false;
    }
}
