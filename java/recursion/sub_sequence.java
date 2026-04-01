public class sub_sequence {
 public static void main(String[] args) {
  String s="abc";
  String ans=" ";
  sebsequence(s,ans);

 }
 public static void sebsequence(String s,String ans){
  if(s.length()==0){
   System.out.println(ans);
   return;
   
  }
  sebsequence(s.substring(1),ans);
  sebsequence(s.substring(1),ans+s.charAt(0));

 }
 
}
