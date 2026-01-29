//1544. Make The String Great
class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            st.push(s.charAt(i));
           if(st.size()>=2){
            char first=st.pop();
            char second=st.pop();
            if(Math.abs(first-second)!=32){
                st.push(second);
                st.push(first);
            }
           }

        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0, st.pop());
        }
        return sb.toString();

    }
}