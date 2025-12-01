class Solution {
    int[] parent;

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        parent = new int[n];
        for (int i = 0; i < n; i++)
            parent[i] = i;

        for (int[] e : edges)
            union(e[0], e[1]);

        return find(source) == find(destination);
    }

    int find(int x) {
        if (parent[x] != x) parent[x] = find(parent[x]);
        return parent[x];
    }

    void union(int a, int b) {
        parent[find(a)] = find(b);
    }
}