class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        int[] parent = new int[n+1];
        int[] rank = new int[n+1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
        for(int[] pair:edges){
            int u_par=find(pair[0],parent);
            int v_par=find(pair[1],parent);
            if(u_par==v_par) return pair;
            union(pair[0], pair[1], parent, rank);
        }
        return null;
    }
     void union(int x, int y, int[] parent, int[] rank) {
        int x_p = find(x, parent);
        int y_p = find(y, parent);
        if (x_p != y_p) {
            if (rank[x_p] > rank[y_p]) {
                parent[y_p] = x_p;
            } else if (rank[x_p] < rank[y_p]) {
                parent[x_p] = y_p;
            } else {
                parent[x_p] = y_p;
                rank[y_p]++;
            }
        }
    }

    int find(int i, int[] parent) {
        if (i == parent[i]) {
            return i;
        }
        return find(parent[i], parent);
    }
}