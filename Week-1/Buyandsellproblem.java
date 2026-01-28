class Solution {
    public int maxProfit(int[] p) {
        int n=p.length;
        int buy=p[0];
        int ans=0;
        for(int i=1;i<n;i++){
            if(buy>p[i]){
                buy=p[i];
                continue;
            }
            ans=Math.max(ans,Math.max(0,p[i]-buy));
        }
        return ans;
    }
}