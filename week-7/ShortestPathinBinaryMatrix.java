import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int shortestPathinBinaryMatrix(int[][] grid) {
        int ans = 1;
        int[][] dir = {
                { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 },
                { -1, -1 }, { -1, 1 }, { 1, -1 }, { 1, 1 }
        };
        int n = grid.length;
        int m = grid[0].length;
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1)
            return -1;
        boolean[][] vis = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { 0, 0 });
        vis[0][0] = true;
        while (!q.isEmpty()) {
            int size = q.size();

            for (int ii = 0; ii < size; ii++) {

                int[] curr = q.remove();

                if (curr[0] == n - 1 && curr[1] == m - 1) {
                    return ans;
                }

                for (int[] arr : dir) {
                    int i = arr[0] + curr[0];
                    int j = arr[1] + curr[1];
                    if (i < n && i >= 0 && j < m && j >= 0) {
                        if (grid[i][j] == 0 && !vis[i][j]) {
                            vis[i][j] = true;
                            q.add(new int[] { i, j });
                        }
                    }
                }
            }

            ans++;
        }
        return -1;
    }
}