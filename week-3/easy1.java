//2073. Time Needed to Buy Tickets
class Solution {
    public int timeRequiredToBuy(int[] t, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<t.length;i++){
            q.add(i);
        }
        int timer=0;
        while(true){
            int x=q.poll();
            t[x]--;
            timer++;
            if(x==k&&t[x]==0) break;
            if(t[x]!=0){
                q.add(x);
            }
        }
        return timer;
    }
}