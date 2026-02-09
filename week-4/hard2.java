//2289. Steps to Make Array Non-decreasing
public class hard2 {
     int ans=0;
    public int totalSteps(int[] nums) {
        Stack<int[]> st=new Stack<>();

        int n=nums.length;

        for(int i=0;i<n;i++){
          int s=0;
          while(!st.isEmpty()&&st.peek()[0]<=nums[i]){
            s=Math.max(s,st.pop()[1]);
          }
          if(st.isEmpty()){
            s=0;
          }
          else{
            s+=1;
          }
          ans=Math.max(ans,s);
          st.push(new int[]{nums[i],s});
        }
        return ans;
        
    }
}
