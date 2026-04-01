 class Min_Chars_to_Add_for_Palindrome{
  public static void main(String[] args) {
   String s="delhidil";
   System.out.println(minChar(s));
  }
  public static int minChar(String s) {
      // Write your code here
      int ans=0;
      int n=s.length()-1;
      String temp="";
      Boolean flag=check(s);
      while(ans<n &&!flag){
          temp+=s.charAt(n-ans);
          s=temp+s;
          ans++;
          flag=check(s);
          
      }
      return ans;
      
      
  }
 public  static boolean check(String s){
      int i=0,j=s.length()-1;
      while(i<=j){
          if(s.charAt(i)!=s.charAt(j)){
             return false;
          }
           i++;
           j--;
      }
      return true;
  }
}
