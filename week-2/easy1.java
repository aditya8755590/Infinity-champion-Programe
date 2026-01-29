
//2696. Minimum String Length After Removing Substrings

class Solution {
    public int minLength(String s) {
        Stack<Character> st=new Stack<>();
        char a='A';
        char a1='B';
        char b='C';
        char b1='D';
        int i=0,n=s.length();

        while(i<n){
         st.push(s.charAt(i));
         if(st.size()>=2){
            // operation
            char first=st.pop();
            char second=st.pop();
            if((first==a1&&second==a)||(first==b1&&second==b)){
               
            }
            else{
                st.push(second);
                st.push(first);
            }
         }
         i++;
        }
        return st.size();
    }
}