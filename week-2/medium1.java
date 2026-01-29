//907. Sum of Subarray Minimums
class Solution {
    public int sumSubarrayMins(int[] arr) {
        // next small element in left 
        // next small element in right 
        int n=arr.length;
        int MOD=1000000007;
        Stack<int[]> st=new Stack<>();
        Stack<int[]> st1=new Stack<>();
        int[] LMA=new int[n];
        int[] RMA=new int[n];

        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&arr[i]<=st.peek()[0]){
               st.pop();
            }
            LMA[i]=st.isEmpty()?-1:st.peek()[1];
            st.push(new int[]{arr[i],i});

        }

        for(int i=n-1;i>=0;i--){

            while(!st1.isEmpty()&&arr[i]<st1.peek()[0]){
               st1.pop();
            }
            RMA[i]=st1.isEmpty()?n:st1.peek()[1];
            st1.push(new int[]{arr[i],i});

        }

        long result=0;
        for(int i=0;i<n;i++){
         long left=i-LMA[i];
         long right=RMA[i]-i;
         long curr=*arr[i];
         result+=curr;
        }
        return (int)(result%MOD);
        
    }
}