class Solution {
    public long countPairs(int n, int[][] connections) {
        int e = connections.length;
        int extra = 0;
        int[] parent = new int[n];
        int[] rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
        for (int[] pair : connections) {
            int u = pair[0];
            int v = pair[1];
            int p_u = find(u, parent);
            int p_v = find(v, parent);
            if (p_u == p_v)
                extra++;
            union(v, u, parent, rank);
        }
        // ab kitne components rah gaye hai
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key=find(i,parent);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        
        long sum = 0;
        long ans = 0;
        for (int i : map.keySet()) {
            sum += map.get(i);
        }
        for (int i : map.keySet()) {

            int curr=map.get(i);
            ans+=curr*(sum-curr);
            sum-=curr;
        }
        return ans;

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