//1526. Minimum Number of Increments on Subarrays to Form a Target Array
class Solution {
    public int minNumberOperations(int[] target) {
        int ans=0;
        int max=target[0];

        for(int i=1;i<target.length;i++){
           if(target[i]<max){
            ans+=max-target[i];
           }
            max=target[i];
        }

        return ans+max;
    }
}