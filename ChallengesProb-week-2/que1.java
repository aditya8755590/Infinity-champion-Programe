//3412. Find Mirror Score of a String
class Solution {
    public long calculateScore(String s) {
        int n=s.length();
        long ans=0;
        // ye sirf is liye h ki us ka mirror age present hai ki nahi 
        Stack<Integer>[] freq=new Stack [26];

        for(int i=0;i<n;i++){
            boolean flag=true;
            char curr=s.charAt(i);
            char mirror = (char)('a' + ('z' - curr));
            if(freq[mirror-'a']!=null&&!freq[mirror-'a'].isEmpty()){
               ans+=(i-freq[mirror-'a'].pop());
               flag=false;
             }
            if(flag){
            if(freq[curr-'a']==null){
                freq[curr-'a']=new Stack<>();
            }
           Stack st=freq[curr-'a'];
           st.push(i);
            }
            
        }
        return ans;
       
    }

}