//1856. Maximum Subarray Min-Product
class Solution {
    public static int maxSumMinProduct(int[] nums) {
        int n=nums.length;
        int mod=1000000007;
        Stack<int[]> st1=new Stack<>();
        Stack<int[]> st2=new Stack<>();
        int[] lmm=new int[n];
        int[] rmm=new int[n];

        for(int i=0;i<n;i++){
          while(!st1.isEmpty()&&st1.peek()[0]>=nums[i]){
            st1.pop();
          }
          lmm[i]=st1.isEmpty()?-1:st1.peek()[1];
          st1.push(new int[]{nums[i],i});
        }
        
        for(int i=n-1;i>=0;i--){
          while(!st2.isEmpty()&&st2.peek()[0]>=nums[i]){
            st2.pop();
          }
          rmm[i]=st2.isEmpty()?n:st2.peek()[1];
          st2.push(new int[]{nums[i],i});
        }

        long[] pre=new long[n];
        for(int i=0;i<n;i++){
            pre[i]+=i!=0?nums[i]+pre[i-1]:nums[i];
        }

        long ans=0;

        for(int i=0;i<n;i++){
            long left=lmm[i]<0?0:pre[lmm[i]];
            long right=pre[rmm[i]-1];
            ans = Math.max(ans, (long)nums[i] * (right - left));

        }

        return (int)(ans%mod);

    }
}