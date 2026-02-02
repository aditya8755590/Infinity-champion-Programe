//1823. Find the Winner of the Circular Game
class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList();
        int i = 1;
        while (n > 0) {
            q.add(i);
            n--;
            i++;
        }

        while (q.size() != 1) {
            int s = k;
            while (s > 1) {
                q.add(q.remove());
                s--;
            }
            q.remove();
        }
        return q.remove();
    }
}