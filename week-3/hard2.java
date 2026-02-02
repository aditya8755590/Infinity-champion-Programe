//1696. Jump Game VI
class Solution {
    public int maxResult(int[] nums, int k) {
        int n=nums.length;
        Deque<Integer> dq=new LinkedList<>();
        int dp[]=new int[n];
        for(int i=n-1;i>=0;i--){
          // check or remove the invalid one 
          while(!dq.isEmpty()&&dq.peekFirst()>i+k){
            dq.removeFirst();
          }
          dp[i]=dq.isEmpty()?nums[i]:nums[i]+dp[dq.peekFirst()];
          while(!dq.isEmpty()&&dp[dq.peekLast()]<=dp[i]){
            dq.removeLast();
          }
          dq.addLast(i);
        }
        return dp[0];
    }
}