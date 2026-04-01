public class subSequence {
 public static void main(String[] args) {
   String s="abcd";
   printsub(s,"",0);
 }
 static void printsub(String s,String ans,int pos){

       if(s.length()==0){
        System.out.println(ans);
        return;
       }
      // for(int i=pos;i<s.length();i++){
        String temp=ans;
        printsub(s.substring(1),temp,0);
        printsub(s.substring(1),temp+s.charAt(0),0);
        // printsub(s.substring(1),temp,i);
     //  }
 }
 
}
