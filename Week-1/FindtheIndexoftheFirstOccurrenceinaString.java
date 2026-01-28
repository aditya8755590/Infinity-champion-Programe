class Solution {
    public int strStr(String h, String n) {

        int j=0,nLen=n.length();
        
        if(h.length()<nLen)return -1;
        
        for(int i=0;i<h.length();i++){

        for(int s=i;s<h.length();s++){

         while(s<h.length()&&j<nLen&&h.charAt(s)==n.charAt(j)){
             s++;
             j++;
         }

         if(j==nLen){
                return s-j;
             }
         j=0;
        }}
        return -1;
    }
}