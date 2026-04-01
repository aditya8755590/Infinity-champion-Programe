import java.util.*;
public class permutation_string {
 public static void main(String[] args) {
     String s="ABC";
     ArrayList<Character> list=new ArrayList<>();
       recursion("",s);
 }

    public static void recursion(String ans,String s){
            if(s.length()==0){
              System.out.println(ans);
              return;
            }
            for(int i=0;i<s.length();i++){
             recursion(ans+s.charAt(i),s.substring(0, i)+s.substring(i + 1));
            }
     }

 }
