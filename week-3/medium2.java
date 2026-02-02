//950. Reveal Cards In Increasing Order
class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
      // undo move → move bottom to top
	  // undo reveal → put card back on top
        int n=deck.length;
        Arrays.sort(deck);
        Deque<Integer> q=new ArrayDeque<>();
        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--){
            int ele=deck[i];
           if(!q.isEmpty()){
            q.addFirst(q.removeLast());
           }
           q.addFirst(ele);
        }

        int i=0;
        while(!q.isEmpty()){
           ans[i]=q.removeFirst();
           i++;
        }
        return ans;
    }
}