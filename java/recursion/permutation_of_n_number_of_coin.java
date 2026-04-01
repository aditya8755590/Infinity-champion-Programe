public class permutation_of_n_number_of_coin {
 public static void main(String[] args) {
  String ans=" ";
  int n=3;
  cointoss(n,ans,0);
 }
 public static void cointoss(int n,String ans,int m){
  if(n==0){
   System.out.println(ans);
   return ;
  }
  // is mai agar h ek sath nahi bhat sakte 
  if(ans.length()==0||ans.charAt(ans.length()-1)!='H'){
  cointoss(n-1, ans+"H",m++);}
  cointoss(n-1, ans+"T",m--);


 }
 
}
