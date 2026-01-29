//2030. Smallest K-Length Subsequence With Occurrences of a Letter

class Solution {
    public String smallestSubsequence(String s, int k, char letter, int r ) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == letter) {
                count++;
            }
        }
        for (int i = 0; i < n; i++) {
            // remove thabi karange tb remove kane se age ans mil jye ya fir character is se chota ho 
            char ch = s.charAt(i);

            while (!st.isEmpty() && (s.length() - i + st.size() > k) && st.peek() > ch && (st.peek() != letter || count > r)) {
                if (st.pop() == letter) r++;
            }

            if (st.size() < k) {
                if (ch == letter) {
                    st.push(ch);
                    r--;
                }
                else if (k - st.size() > r) {
                // character to thabi add karange jb ensre ho jye ki age valid mil jye ga 
                    st.push(ch);
                }
            }
            // agar hum ne koi element jo ye add ho gaya ho ya fir piche rah gaya ho 
            // to use total count ma se hata denge 
            if (ch == letter) {
                count--;
            }
        }
        StringBuilder sb = new StringBuilder(st.size());
        for (Character c : st){sb.append(c);}
        return sb.toString();
    }
}