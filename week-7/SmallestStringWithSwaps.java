import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
class Solution {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int n=s.length();
        int[] parent = new int[n+1];
        int[] rank = new int[n+1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
        for(List<Integer> pair:pairs){
            union(pair.get(0), pair.get(1), parent, rank);
        }
         HashMap<Integer, List<Integer>> map = new HashMap<>();
          for (int i = 0; i < n; i++) {
            int root = find(i, parent);

            if (!map.containsKey(root)) {
                map.put(root, new ArrayList<>());
            }

            map.get(root).add(i);
        }
          char[] result = new char[n];
        char[] arr = s.toCharArray();
         for (List<Integer> group : map.values()) {

             List<Character> chars = new ArrayList<>();
             // to char chars mai add ho gaye 
            for (int i : group) {
                chars.add(arr[i]);
            }
            // Sort indices and characters
            // jitni bhi index present hai unko sort kar diya 
            Collections.sort(group);
            //char ko bhi 
            Collections.sort(chars);
             // Put smallest char at smallest index
            for (int i = 0; i < group.size(); i++) {
                result[group.get(i)] = chars.get(i);
            }

         }
           return new String(result);

        
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