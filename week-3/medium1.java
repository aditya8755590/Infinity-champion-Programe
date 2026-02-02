//3191. Minimum Operations to Make Binary Array Elements Equal to One I
class Solution {
    public int minOperations(int[] nums) {
        int k=3;
        // so in this question a straightforwad apporach ki agar flip kiya to kaha tak infulunce padaga or har index ke liye hm ye dheknge ki kitne flip ka infulunce hai ya nahi or jarurat hai kaya 
        int n=nums.length;
        // if we now want to use is fliped so 
        //boolean isFliped[]=new boolean[n];
        Deque<Integer> q= new ArrayDeque<>();
        int flipCount=0;
        int result=0;
        for(int i=0;i<n;i++){
            while(q.size()>k){
                q.removeFirst();
            }
          if(q.size()==k&&q.removeFirst()==1){
            flipCount--;
          }
          if(nums[i]==flipCount%2){
            // flip ke jarurat hai 
            if(i+k>n) return -1;
            q.addLast(1);
            flipCount++;
            result++;
          }
          else{
            q.addLast(0);
          }
        }
        return result;
    }
}